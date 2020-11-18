package com.ghac.myspilder.myspilder3.util;

import com.google.i18n.phonenumbers.PhoneNumberToCarrierMapper;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.google.i18n.phonenumbers.geocoding.PhoneNumberOfflineGeocoder;
import com.sasa.bean.PhoneNumberBean;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @author Z
 * @date 2019/6/12
 */
public class PhoneNumberUtils {


    private static PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();

    private static PhoneNumberToCarrierMapper carrierMapper = PhoneNumberToCarrierMapper.getInstance();

    private static PhoneNumberOfflineGeocoder geocoder = PhoneNumberOfflineGeocoder.getInstance();

    public static PhoneNumberUtils instance = null;


    private static List<String> standardList;

    //private static
    private PhoneNumberUtils() {

    }

    public static PhoneNumberUtils getInstance() {
        if (instance == null) {
            instance = new PhoneNumberUtils();
            standardList = new ArrayList<>();
            standardList.add("+");
            standardList.add("00");

        }
        return instance;
    }


    public PhoneNumberBean Identification(String phoneNumber) {
        String[] segmentationList = phoneNumber.split(" ");
        PhoneNumberBean phoneNumberBean = null;
        List<String> codeAndphoneNumber = match(segmentationList);
        switch (codeAndphoneNumber.size()) {
            case 1:
                phoneNumberBean = new PhoneNumberBean();
                phoneNumberBean.setMobile(codeAndphoneNumber.get(0));
                break;
            case 2:
                phoneNumberBean = new PhoneNumberBean();
                phoneNumberBean.setAreaCode(codeAndphoneNumber.get(0));
                phoneNumberBean.setMobile(codeAndphoneNumber.get(1));
                phoneNumberBean.setCodeMobile(codeAndphoneNumber.get(0) + codeAndphoneNumber.get(1));
                break;
            default:
                break;
        }

        if (phoneNumberBean.getAreaCode() != null) {
            if (!checkPhoneNumber(phoneNumberBean.getMobile(), phoneNumberBean.getAreaCode())) {
//                System.out.println("手机号无效：" + phoneNumberBean);
                phoneNumberBean.setMobile(StringFilter(phoneNumberBean.getCodeMobile()));
                phoneNumberBean.setCodeMobile(null);
                phoneNumberBean.setAreaCode(null);

            }
        }
        String moblie = phoneNumberBean.getMobile().replaceAll("^(0+)", "");
        phoneNumberBean.setMobile(moblie);
        return phoneNumberBean;
    }


    /**
     * 直接去除所有特殊数据
     * 包括空格
     *
     * @param rawData
     * @return
     */
    public PhoneNumberBean IdentificationsMin(String rawData) {

        PhoneNumberBean phoneNumberBean = null;
        rawData=StringFilter(rawData);
        rawData = rawData.replaceAll("^(0+)", "");
        List<String> strings = new ArrayList<>();
        String areaCode = null;
        String phoneNumber = null;
        int i = 1;
        while (i < 4) {
            if (i > rawData.length()) {
                break;
            }
            areaCode = rawData.substring(0, i);
            phoneNumber = rawData.substring(i, rawData.length());
            if(phoneNumber==null || phoneNumber.equals("")){
                break;
            }
            //  System.out.println("areaCode:"+areaCode +" phoneNumber"+phoneNumber);
            if (checkPhoneNumber( phoneNumber,areaCode)) {
                strings.add(areaCode);
                strings.add(phoneNumber);
                break;
            }
            i++;
        }
        if (strings.size() == 0) {
            strings.add(StringFilter(rawData));
        }

        switch (strings.size()) {
            case 1:
                phoneNumberBean = new PhoneNumberBean();
                phoneNumberBean.setMobile(strings.get(0));
                break;
            case 2:
                phoneNumberBean = new PhoneNumberBean();
                phoneNumberBean.setAreaCode(strings.get(0));
                phoneNumberBean.setMobile(strings.get(1));
                phoneNumberBean.setCodeMobile(strings.get(0) + strings.get(1));
                break;
            default:
                break;
        }
        return phoneNumberBean;
    }

    private List<String> match(String[] segmentationList) {
        int size = segmentationList.length;
        if (size > 0) {
            String s = segmentationList[0];
            //System.out.println("s:" + s);
            for (String standard : standardList) {
                //System.out.println("standard:" + standard);
                if (s.contains(standard)) {
                    //System.out.println("匹配成功:规则" + standard);
                    switch (standard) {
                        case "+":
                            return plusDealWith(segmentationList);
                        case "00":
                            if (segmentationList.length > 2) {
                                return zeroDealWith(segmentationList);
                            }
                            break;
                        default:
                            break;
                    }
                }
            }
            if (size > 1) {
                return DealWith(segmentationList);
            } else {
                List<String> strings = new ArrayList<>();
                String phoneNumber = merge(segmentationList);
                strings.add(StringFilter(phoneNumber));
               // List<String> strings=cycleJudge(phoneNumber);
                return strings;
            }
        }
        return null;
    }

    private List<String> DealWith(String[] segmentationList) {
        String areaCode = segmentationList[0];
        List<String> strings = new ArrayList<>();
        areaCode = StringFilter(areaCode);
        if (areaCode.length() > 0) {
            strings.add(areaCode);
        }
        segmentationList[0] = "";
        String phoneNumber = merge(segmentationList);
        strings.add(StringFilter(phoneNumber));
        return strings;
    }

    private List<String> plusDealWith(String[] segmentationList) {
        List<String> strings = new ArrayList<>();
        /**
         *通过获取一位，两位，三位判断
         */
        if (segmentationList.length == 1) {
            String str = segmentationList[0];
            String areaCode = null;
            String phoneNumber = null;
            int i = 2;
            while (i < 5) {
                if (i > str.length()) {
                    break;
                }
                areaCode = str.substring(1, i);
                phoneNumber = str.substring(i, str.length());
              //  System.out.println("areaCode:"+areaCode +" phoneNumber"+phoneNumber);
                if (checkPhoneNumber( phoneNumber,areaCode)) {
                    strings.add(areaCode);
                    strings.add(phoneNumber);
                    break;
                }
                i++;
            }
            if (strings.size() == 0) {
                phoneNumber = str.substring(1, str.length());
                strings.add(StringFilter(phoneNumber));
            }
        } else {
            String areaCode = segmentationList[0];
            areaCode = StringFilter(areaCode);
            if (areaCode.length() > 0) {
                strings.add(areaCode);
            }
            segmentationList[0] = "";
            String phoneNumber = merge(segmentationList);
            strings.add(StringFilter(phoneNumber));
        }


        return strings;
    }

    private  List<String>  cycleJudge(String rawData){
        rawData=StringFilter(rawData);
        rawData = rawData.replaceAll("^(0+)", "");
        List<String> strings = new ArrayList<>();
        String areaCode = null;
        String phoneNumber = null;
        int i = 1;
        while (i < 4) {
            if (i > rawData.length()) {
                break;
            }
            areaCode = rawData.substring(0, i);
            phoneNumber = rawData.substring(i, rawData.length());
            if(phoneNumber==null || phoneNumber.equals("")){
                break;
            }
            //  System.out.println("areaCode:"+areaCode +" phoneNumber"+phoneNumber);
            if (checkPhoneNumber( phoneNumber,areaCode)) {
                strings.add(areaCode);
                strings.add(phoneNumber);
                break;
            }
            i++;
        }
        if (strings.size() == 0) {
            strings.add(StringFilter(rawData));
        }
        return  strings;
    }






    private List<String> zeroDealWith(String[] segmentationList) {

        String areaCode = segmentationList[1];
        List<String> strings = new ArrayList<>();
        strings.add(areaCode);
        segmentationList[0] = "";
        segmentationList[1] = "";
        String phoneNumber = merge(segmentationList);
        strings.add(StringFilter(phoneNumber));
        return strings;

    }


    public String merge(String[] segmentationList) {
        String mergeStr = "";
        for (String segmentation : segmentationList) {
            mergeStr = mergeStr + segmentation;
        }
        return mergeStr;

    }

    /**
     * 转义正则特殊字符 （$()*+.[]?\^{}
     * \\需要第一个替换，否则replace方法替换时会有逻辑bug
     */
    public static String makeQueryStringAllRegExp(String str) {
        if (StringUtils.isBlank(str)) {
            return str;
        }

        return str.replace("\\", "\\\\").replace("*", "\\*")
                .replace("+", "\\+").replace("|", "\\|")
                .replace("{", "\\{").replace("}", "\\}")
                .replace("(", "\\(").replace(")", "\\)")
                .replace("^", "\\^").replace("$", "\\$")
                .replace("[", "\\[").replace("]", "\\]")
                .replace("?", "\\?").replace(",", "\\,")
                .replace(".", "\\.").replace("&", "\\&");
    }


    public String StringFilter(String str) throws PatternSyntaxException {
        // 只允许字母和数字 // String regEx ="[^a-zA-Z0-9]";
        // 清除掉所有特殊字符
        String regEx = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（） ——+|{}【】‘；：”“’。，、？-]";
        Pattern p = Pattern.compile(regEx);
        Matcher m = p.matcher(str);
        return m.replaceAll("").trim();
    }

    /**
     * 根据国家代码和手机号  判断手机号是否有效
     *
     * @param phoneNumber
     * @param countryCode
     * @return
     */
    public static boolean checkPhoneNumber(String phoneNumber, String countryCode) {
//        System.out.println("phoneNumber:"+phoneNumber+" countryCode:"+ countryCode);
        int ccode = StringUtil.toInteger(countryCode);
        long phone = StringUtil.toLong(phoneNumber, 0L);

        Phonenumber.PhoneNumber pn = new Phonenumber.PhoneNumber();
        pn.setCountryCode(ccode);
        pn.setNationalNumber(phone);


        return phoneNumberUtil.isValidNumber(pn);

    }


    public static void main(String args[]) {
        List<String> testList = new ArrayList<>();
        testList.add("00 86 135 3954 6122");
        testList.add("+86 135 3954 6122");
        testList.add("+8613266838086");
        testList.add("013570423110");
        testList.add("00 1357042311013453546");
        testList.add("13570423110");
        testList.add("86 13570423110");
        testList.add("86 13507(4)23 110");
        testList.add("86 13—507(4)23 110");
        testList.add("86 13-507(4)23 110");
        testList.add("0000013570423110");
        testList.add("8613512341234");
        testList.add("+263 7 86321662");
        testList.add("263 28622001");
        testList.add("+263 28622000");

        for (String test : testList) {
            System.out.println("测试的数据：" + test);
            PhoneNumberBean phoneNumberBean = PhoneNumberUtils.getInstance().Identification(test);
            System.out.println("返回的数据：phoneNumberBean" + phoneNumberBean);
        }

    }


}

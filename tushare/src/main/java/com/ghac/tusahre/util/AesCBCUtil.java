package com.ghac.tusahre.util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Z
 * @date 2019/1/25
 */
public class AesCBCUtil {
    /*
    *已确认
* 加密用的Key 可以用26个字母和数字组成
* 此处使用AES-128-CBC加密模式，key需要为16位。
            */
    public static String sKey = "sasaixyzgicloudn";
    public static String ivParameter = "1122abcd3344abcd";
    public static AesCBCUtil instance = null;

    //private static
    private AesCBCUtil() {

    }

    public static AesCBCUtil getInstance() {
        if (instance == null) {
            instance = new AesCBCUtil();
        }
        return instance;
    }

    public String Encrypt(String sSrc, String sKey) throws Exception {
        if (sKey == null) {
            System.out.print("Key为空null");
            return null;
        }
        // 判断Key是否为16位
        if (sKey.length() != 16) {
            System.out.print("Key长度不是16位");
            return null;
        }
        byte[] raw = sKey.getBytes("utf-8");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");//"算法/模式/补码方式"
        IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes());//使用CBC模式，需要一个向量iv，可增加加密算法的强度
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
        byte[] encrypted = cipher.doFinal(sSrc.getBytes());
        return new BASE64Encoder().encode(encrypted);//此处使用BASE64做转码功能，同时能起到2次加密的作用。
    }


    // 解密
    public String decrypt(String sSrc, String encodingFormat, String sKey, String ivParameter) throws Exception {
        try {
            byte[] raw = sKey.getBytes("ASCII");
            SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes());
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
            byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);//先用base64解密
            byte[] original = cipher.doFinal(encrypted1);
            String originalString = new String(original, encodingFormat);
            return originalString;
        } catch (Exception ex) {
            return null;
        }
    }

    // 解密
    public String decrypt(String sSrc,String sKey) throws Exception {

        byte[] raw = sKey.getBytes("ASCII");
        SecretKeySpec skeySpec = new SecretKeySpec(raw, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        IvParameterSpec iv = new IvParameterSpec(ivParameter.getBytes());
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
        byte[] encrypted1 = new BASE64Decoder().decodeBuffer(sSrc);//先用base64解密
        byte[] original = cipher.doFinal(encrypted1);
        String originalString = new String(original, "UTF-8");
        return originalString;

    }

    // 解密
    public List<String> decrypt(List<String>
                                        sSrc) throws Exception {
        List<String> decryptList = new ArrayList<>();
        for (String s : sSrc) {
            s = decrypt(s,sKey);
            decryptList.add(s);
        }
        return decryptList;
    }


    public static void main(String[] args) throws Exception {
        //  addressBookUpload   +263 28622000
        // 需要加密的字串
        String cSrc = "[{\"mobile\": \"156 9768 3202\", \"nickName\" : \"优速出租\"},"
            + "{\"mobile\":\"156 9768 3201\",\"nickName\":\"冠希煞笔\"},"
            + "{\"mobile\":\"+86 135 7042 3110\",\"nickName\":\"严经理\"},"
            + "{\"mobile\":\"+86 178 2051 0088\",\"nickName\":\"卢俊杰0088\"},"
            + "{\"mobile\":\"1555517197299\",\"nickName\":\"昵称100000342\"},"
            + "{\"mobile\":\"4008308300\",\"nickName\":\"华为客服\"}]";

//        +86 178 2051 0088
        cSrc = "["
            + "{\"mobile\":\"+86 178 2051 0088\",\"nickName\":\"100000590\"}"
            + "]";
        System.out.println("100000590=" + AesCBCUtil.getInstance().Encrypt(cSrc, "sasaixyzgicloudn"));

        cSrc = "["
            + "{\"mobile\":\"+86 13570423110\",\"nickName\":\"严经理\"}"
            + "]";
        System.out.println("100000293=" + AesCBCUtil.getInstance().Encrypt(cSrc, "sasaixyzgicloudn"));

        cSrc = "["
            + "{\"mobile\":\"+263 28622000\",\"nickName\":\"我是你爸爸\"},"
            + "{\"mobile\":\"+263 178 2051 0088\",\"nickName\":\"卢俊杰0088\"},"
            + "{\"mobile\":\"10086\",\"nickName\":\"移动客服\"},"
            + "{\"mobile\":\"10087\",\"nickName\":\"华为客服\"}]";
        System.out.println("加密前的字串是：" + cSrc);
        // 加密
        String enString = AesCBCUtil.getInstance().Encrypt(cSrc, "sasaixyzgicloudn");
        System.out.println("加密后的字串是：" + enString);
        // System.out.println("1jdzWuniG6UMtoa3T6uNLA==".equals(enString));
        // 解密
        String DeString = AesCBCUtil.getInstance().decrypt(enString, "sasaixyzgicloudn");
        System.out.println("解密后的字串是：" + DeString);


        //  getRegistration 1uKAS4vsOiRnlDp5Q3xw6Q==
        DeString = AesCBCUtil.getInstance().decrypt(
            "wgx+oU2GU1L/oCBK3dSKpyuDX7mqQadAUwxjrBPZwO+/TFg5B8NaMeLk1j/pZHTtSM/cyOK4QAzJ9Yu8/9ATi17ovbcP2wv/thhsr2qk3XZWwVOqg2qE0Cl50CvAN/e+o3pgiwRQiH9C0lqFwS2jNdKGmAXjgER/j4s8p+xVHrIfANXF2aZmV1M9zE7Z2ZMOw5bcwsePgZ1plOkKwm++ps/riscDJo0pZ1WW9WtQq8rgGDKUPpTx7nlumw+BCZpz",
            "e4cc50a6ed92df71");
        System.out.println("解密后的字串是：" + DeString);

        DeString = AesCBCUtil.getInstance().decrypt(
            "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",
            "e4cc50a6ed92df71");
        System.out.println("解密后的字串是：" + DeString);
    }

}

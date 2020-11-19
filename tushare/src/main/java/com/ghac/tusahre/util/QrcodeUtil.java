//package com.ghac.myspilder.myspilder3.util;
//
//
//import com.alibaba.fastjson.JSON;
//import com.sasa.bean.QrcodeBean;
//import com.sasa.exception.GlobalException;
//
///**
// * 二维码工具
// *
// * @author Z
// * @date 2019/5/13
// */
//public class QrcodeUtil {
//
//    /**
//     * 需要判断 是否过期
//     */
//    public  static QrcodeBean analysis(String qrCodeStr) {
//        String analysisStr = null;
//        try {
//            analysisStr = AesCBCUtil.getInstance().decrypt(qrCodeStr, "utf-8", AesCBCUtil.sKey, AesCBCUtil.ivParameter);
//        } catch (Exception e) {
//            throw new GlobalException("解析失败");
//        }
//        QrcodeBean qrcodeBean;
//        try {
//             qrcodeBean = JSON.parseObject(analysisStr, QrcodeBean.class);
//        }catch (Exception e){
//            throw new GlobalException("错误json");
//        }
//        if (qrcodeBean.getType() == 1) {
//            /**
//             * 7天过期
//             */
//            if (TimeUtil.getTime() > qrcodeBean.getCreateTime() + 7 * 24 * 60 * 60) {
//                throw new GlobalException("已经过期");
//            }
//        }
//        return JSON.parseObject(analysisStr, QrcodeBean.class);
//
//
//    }
//
//    public static String generate(QrcodeBean qrcodeBean) {
//        String jsonString = JSON.toJSONString(qrcodeBean);
//        String generateStr = "";
//        try {
//            generateStr = AesCBCUtil.getInstance().Encrypt(jsonString, AesCBCUtil.sKey);
//        } catch (Exception e) {
//
//        }
//        return generateStr;
//
//    }
//
//    public static void main(String args[]) {
//        QrcodeBean qrcodeBean = new QrcodeBean();
//        qrcodeBean.setType(1);
//        qrcodeBean.setMoney("1.00");
//        qrcodeBean.setCreateTime(TimeUtil.getTime());
//        qrcodeBean.setId(10000000L);
//        String str = generate(qrcodeBean);
//        System.out.println("str:" + str);
//        QrcodeBean qrcodeBean1 = analysis(str);
//        System.out.println("qrcodeBean1:" + qrcodeBean1);
//
//
//    }
//}

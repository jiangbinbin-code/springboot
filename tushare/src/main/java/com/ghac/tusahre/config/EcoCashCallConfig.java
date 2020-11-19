//package com.ghac.tusahre.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
///**
// * @author Z
// * @date 2019/3/21
// */
//@Component
//public class EcoCashCallConfig {
//
//    @Value("${EcoCashHttpUtil.callback}")
//    private String callback = "http://183.6.112.112:38086/wallet/callback";
//
//    public String getCallback() {
//        return callback;
//    }
//
//    public void setCallback(String callback) {
//        this.callback = callback;
//    }
//
//
//    public String getBalanceInquiry(){
//        return callback+"/balanceInquiry";
//    }
//
//    public String getSendMoney(){
//        return callback+"/sendMoney";
//    }
//
//    public String getBuyAirtime(){
//        return callback+"/buyAirtime";
//    }
//
//    public String getBillPayment(){
//        return callback+"/billPayment";
//    }
//
//    public String getSubscriberToMerchant(){
//        return callback+"/subscriberToMerchant";
//    }
//}

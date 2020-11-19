package com.ghac.tusahre.enums;

/**
 * 交易事务码类型
 *
 * @author Z
 * @date 2018/12/29
 */
public enum PaymentTypesEnum {

    /**
     * 个人转账该商家
     */
    SubscriberToMerchant("000006"),
    Bill("ECO004"),
    BalanceInquiry("000001"),
    SendMoney("ECO005"),
    BuyAirtime("ECO001"),
    CustomerLookup("000015"),
    MerchantAndBillerLookup("CAS0009"),
    ZESAAccountlookup("ZESA001"),
    ZESA_BUY_TOKEN("ZESA005"),
    TransactionLookup("ENQUIRY"),
    CHECK_ELIGIBILITY("KASHAGI001"),
    REQUEST_LOAN("KASHAGI002"),
    GET_OUTSTANDING_LOANS("KASHAGI003"),
    REPAY_LOAN("KASHAGI005");


    private String code;


    private PaymentTypesEnum(String code) {
        this.code = code;


    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}

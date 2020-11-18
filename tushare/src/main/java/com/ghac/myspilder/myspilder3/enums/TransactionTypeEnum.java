package com.ghac.myspilder.myspilder3.enums;

/**
 * 转账类型
 * @author Z
 * @date 2018/12/29
 */
public enum TransactionTypeEnum {

    /**
     * 所有
     */
    all (0, "all"),
    /**
     * 转账
     */
    transfer(1, "1#4"),
    /**
     * 二维码转账
     */
    receiveCode(2, "6"),
    /**
     *充值
     */
    airtime(3, "2"),
    /**
     * 缴费
     */
    biller(4, "3"),
    /**
     * 商家
     */
    merchant (5, "5"),;


    private Integer code;

    private String msg;


    private TransactionTypeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;

    }


    // 普通方法
    public static String getmsg(int index) {
        for (TransactionTypeEnum c : TransactionTypeEnum.values()) {
            if (c.getCode() == index) {
                return c.msg;
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }


    public void setCode(Integer code) {
        this.code = code;
    }


    public String getMsg() {
        return msg;
    }


    public void setMsg(String msg) {
        this.msg = msg;
    }

}

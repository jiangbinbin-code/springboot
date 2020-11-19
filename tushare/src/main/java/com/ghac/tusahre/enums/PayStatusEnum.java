package com.ghac.tusahre.enums;

/**
 * 支付状态
 *
 * @author Z
 * @date 2019/6/12
 */
public enum PayStatusEnum {
    /**
     * 处理中
     */
    processing(0),
    /**
     * 成功
     */
    success(1),
    /**
     * 失败
     */
    failure(2);


    private Integer code;


    private PayStatusEnum(Integer code) {
        this.code = code;


    }


    public Integer getCode() {
        return code;
    }


    public void setCode(Integer code) {
        this.code = code;
    }


}

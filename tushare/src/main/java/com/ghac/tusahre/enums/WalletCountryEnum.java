package com.ghac.tusahre.enums;

/**
 * @author Jean
 * @date
 * @des
 */
public enum WalletCountryEnum {

    ZIM("263", "Zimbabwe"),
    LES("266", "Lesotho"),
    BUR("257", "Burundi");

    WalletCountryEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    private String code;
    private String name;

    public String code(){
        return code;
    }

    public String getName(){
        return name;
    }
}

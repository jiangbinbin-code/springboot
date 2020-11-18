package com.ghac.myspilder.myspilder3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author Z
 * @date 2019/5/8
 */
@Component
public class EcoCashConfig {

    @Value("${EcoCash.url}")
    private String url;

    @Value("${EcoCash.vendorCode}")
    private String vendorCode;


    @Value("${EcoCash.key}")
    private String key;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

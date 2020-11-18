package com.ghac.myspilder.myspilder3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Z
 * @date 2019/4/13
 */
@Component
public class ImageConfig {
    @Value("${ImageConfig.url}")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

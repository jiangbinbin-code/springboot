package com.ghac.myspilder.myspilder3.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 推送到c++的配置url
 * @author Z
 * @date 2019/1/2
 */
@Component
public class PushConfig {

    @Value("${PushConfig.url}")
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

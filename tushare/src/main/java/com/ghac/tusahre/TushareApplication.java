package com.ghac.tusahre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableCaching // 启用缓存功能
@EnableScheduling // 开启定时任务功能
@SpringBootApplication
public class TushareApplication {

    public static void main(String[] args) {
        SpringApplication.run(TushareApplication.class, args);
    }

}

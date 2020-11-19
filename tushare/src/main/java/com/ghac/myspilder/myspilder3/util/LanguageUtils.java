package com.ghac.myspilder.myspilder3.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * 语言工具
 *
 * @author Z
 * @date 2019/4/26
 */

public class LanguageUtils {

//    @Autowired
//    private Configuration configuration;



    private static final Logger LOGGER = LoggerFactory.getLogger(LanguageUtils.class);

    private LanguageUtils() {

    }

    private static class SingletonHolder {
        private static LanguageUtils apnsUtils = new LanguageUtils();
    }

    public static LanguageUtils getInstance() {
        return SingletonHolder.apnsUtils;
    }

    public String getLanguage() {
        ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = servletRequestAttributes.getRequest();
        String language = request.getHeader("Language");
        if (language != null && !language.equals("")) {
            LOGGER.warn("【user】 头部语言是：" + language);
        } else {
            language = "2";
        }
        return language;
    }


//    public String getLanguage(String code) {
//        String language=getLanguage();
//        String str = "";
//        if (Configuration.Copywriting.containsKey(language+ "#" + code)) {
//            str = Configuration.Copywriting.get(language + "#" + code);
//        } else {
//            LOGGER.warn("【user】 没有找到语言是：{}" , getLanguage() + "#" + code);
//            if (str == null || str.equals("")) {
//                str = "Loading...";
//            }
//        }
//        return str;
//
//    }
}

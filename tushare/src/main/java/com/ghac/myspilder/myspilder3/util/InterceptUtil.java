package com.ghac.myspilder.myspilder3.util;

/**
 * @author Z
 * @date 2019/7/17
 */
public class InterceptUtil {

    public static String behind(String str, int i) {
        String value;
        int length = str.length();
        if (length >= i) {
            value = str.substring(length - i, length);
        } else {
            value = str;
        }
        return value;
    }
}

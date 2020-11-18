package com.ghac.myspilder.myspilder3.util;

/**
 * @author Z
 * @date 2019/5/9
 */
public class StringUtil {

    public static int toInteger(String countryCode) {
        return Integer.parseInt(countryCode);

    }

    public static long toLong(String phoneNumber, long i) {
        return Long.parseLong(phoneNumber);
    }
}

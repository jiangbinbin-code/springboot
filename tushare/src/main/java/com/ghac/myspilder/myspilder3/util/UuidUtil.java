package com.ghac.myspilder.myspilder3.util;

import java.util.UUID;


/**
 * 
 * @author Z
 *
 */
public class UuidUtil {
    /**
     * 生成token
     * @return
     */
    public static String GetGUID()
    {
        return UUID.randomUUID().toString().replace("-", "");
    }


}

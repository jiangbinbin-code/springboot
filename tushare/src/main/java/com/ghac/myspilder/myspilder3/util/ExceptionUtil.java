package com.ghac.myspilder.myspilder3.util;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * @author Z
 * @date 2019/5/11
 */
public class ExceptionUtil {
    public static String toStackTrace(Exception e)
    {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        try
        {
            e.printStackTrace(pw);
            return sw.toString();
        }
        catch(Exception e1)
        {
            return "";
        }
    }
}

package com.ghac.tusahre.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间工具
 *
 * @author Z
 * @date 2019/1/4
 */
public class TimeUtil {

    /**
     * 获取当前时间时间戳 单位：秒
     * @return
     */
    public static int getTime() {
        return (int) (System.currentTimeMillis() / 1000);
    }


    /*
    * 将时间转换为时间戳
    */
    public static String dateToStamp(String s) throws ParseException {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);
        return res;
    }

    /*
      * 将时间戳转换为时间
      */
    public static String stampToDate(String s) {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt * 1000L);
        res = simpleDateFormat.format(date);
        return res;


    }

    /**
     *  获取指定日期下个月的第一天
     *
     * @param dateStr
     * @param format
     * @return
     */
    public static String getFirstDayOfNextMonth(String dateStr, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            Date date = sdf.parse(dateStr);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.add(Calendar.MONTH, 1);

            return sdf.format(calendar.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static int getFirstDayOfNextMonth(int startTime) {
        try {

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd ");
            long lt = new Long(startTime);
            Date date = new Date(lt * 1000L);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.DAY_OF_MONTH, 1);
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            calendar.add(Calendar.MONTH, 1);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return (int) (calendar.getTime().getTime() / 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


    /**
     * 传入具体日期 ，返回具体日期增加一个月。
     *
     * @param startTime 开始的时间戳
     * @return 结束时间戳
     */
    public static int stampToDate(int startTime) {
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(startTime);
        Date date = new Date(lt * 1000L);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(date);
        rightNow.add(Calendar.MONTH, 1);
        Date dt1 = rightNow.getTime();
        return (int) (dt1.getTime() / 1000);
    }


    /****
     * 传入具体日期 ，返回具体日期增加一个月。
     * @param date 日期(2017-04-13)
     * @return 2017-05-13
     * @throws ParseException
     */
    public static String subMonth(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = sdf.parse(date);
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MONTH, 1);
        Date dt1 = rightNow.getTime();
        String reStr = sdf.format(dt1);
        return reStr;
    }


    public static Date toDate(String time) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = sdf.parse(time);
        return dt;
    }


    public static void main(String args[]) {
        String s = stampToDate("1541001600");

        String s1 = getFirstDayOfNextMonth("2019-01-08", "yyyy-MM-dd");

        int time = getFirstDayOfNextMonth(1546931250);
        System.out.println("s :" + s + " s1 : " + s1 + " time" + time);

        long time1 = System.currentTimeMillis();
        System.out.println("time: " + time1 + " time/1000: " + time1/1000);
    }
}

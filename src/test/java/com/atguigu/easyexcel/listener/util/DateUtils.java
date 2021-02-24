package com.atguigu.easyexcel.listener.util;

import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author vain
 * @date： 2017/11/8 9:49
 * @description： 日期帮助类
 */
public class DateUtils {


    public static final Long SECOND = 1000L;
    public static final Long MINUTE = 60 * SECOND;
    public static final Long HOUR = 60 * MINUTE;
    public static final Long DAY = 24 * HOUR;
    public static final Long WEEK = 7 * DAY;

    public static final String FORMATSTR = "yyyy-MM-dd HH:mm:ss";

    public static Date getCurDate() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);

        return new Date(cal.getTimeInMillis());
    }

    /**
     * 按照给定格式将java.com.bsd.instalment.manager.util.Date转换为字符串
     *
     * @param date
     * @param formatStr yyyy-MM-dd HH:mm:ss
     * @return
     */
    public static String dateToStr(Date date, String formatStr) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(formatStr);
            return format.format(date);
        } catch (Exception e) {
            return "";
        }
    }

    /**
     * 日期转字符串 格式：yyyy-MM-dd
     *
     * @param date
     * @return
     * @author lizhenjiang
     * @date 2020/04/26
     */
    public static String dateToStr(Date date) {
        return dateToStr(date, "yyyy-MM-dd");
    }

    public static Date strTodate(String date, String formatStr) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        try {
            return sdf.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 字符串转日期，格式：yyyy-MM-dd
     *
     * @param dateStr
     * @return
     * @author lizhenjiang
     * @date 2020/04/26
     */
    public static Date strToDate(String dateStr) {
        return strTodate(dateStr, "yyyy-MM-dd");
    }

    /**
     * 获取某一天的起始时间和结束时间
     * 00:00:00-23:59:59
     * @param date
     * @return
     */
    public static Map<String,String> getFirLastDate(Date date){
        Map<String,String> map = new HashMap<String,String>();
        String stringDate = getStringDate(date);
        String firstTime = stringDate.substring(0, 10) + " " + "00:00:00";
        String lastTime = stringDate.substring(0, 10) + " " + "23:59:59";
        map.put("firstTime",firstTime);
        map.put("lastTime",lastTime);
        return map;
    }

    public static Date parseStringDate(String orderCreateTimeStart) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            ParsePosition pos = new ParsePosition(0);
            return format.parse(orderCreateTimeStart,pos);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static String fillWithDayStart(String time) {
        return time + " 00:00:00";
    }

    public static String fillWithDayEnd(String time) {
        return time + " 23:59:59";
    }


    /**
     * 获取当前时间的凌晨时间
     *
     * @param currentTime
     * @return
     */
    public static Date getCurrentDayZero(Date currentTime) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentString = formatter.format(currentTime);
        String zeroString = currentString.substring(0, 11) + "00:00:00";
        Date currentDayZero = formatter.parse(zeroString);
        return currentDayZero;
    }
    /**
     * 将utc时间转成北京时间
     * @param utcString
     * @return
     */
    public static Date utc2normal(String utcString){
        String[] str = utcString.split(":");

        SimpleDateFormat utcFormat = null;

        if(str.length==3 &&!utcString.contains(".")){
            utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss Z");

        }else if(str.length==4 && !utcString.contains(".")){
            utcFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss:SSS Z");
        }else{
            return new Date();
        }
        String utcTime = utcString.replace("Z", " UTC");
        try {
            Date date = utcFormat.parse(utcTime);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }

    }

    /**
     * 格式化日期
     * @param currentTime
     * @return
     */
    public static String getStringDate(Date currentTime) {
        if(currentTime ==null){
            return null;
        }
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = formatter.format(currentTime);

        return strDate;
    }

    /**
     * 获取当前时间的前一天的时间
     *
     * @return
     */
    public static Date getPreDay(Date currentTime,int dt) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        //当前时间的过去两个月的时间
        c.setTime(currentTime);
        c.add(Calendar.DATE, dt);
        Date m = c.getTime();
        return m;
    }


    /**
     * 获取当前时间的前两个月的时间
     *
     * @return
     */
    public static Date getPreMonth(Date currentTime) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        //当前时间的过去两个月的时间
        c.setTime(currentTime);
        c.add(Calendar.MONTH, -2);
        Date m = c.getTime();
        return m;
    }
    public static Date addDays(final Date date, final int amount) {
        return add(date, Calendar.DAY_OF_MONTH, amount);
    }

    private static Date add(final Date date, final int calendarField, final int amount) {
        if (date == null) {
            throw new IllegalArgumentException("The date must not be null");
        }
        final Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(calendarField, amount);
        return c.getTime();
    }

    /**
     * 时间计算，加减秒（分钟、小时、天、星期）
     *
     * @param date       被计算的日期
     * @param amount     数量（比如加3小时就是3）
     * @param typeMillis 类型毫秒数，已在此工具类中定义常量
     * @return
     */
    public static Date dateCalc(Date date, int amount, Long typeMillis) {
        return new Date(date.getTime() + amount * typeMillis);
    }

    /**
     * 时间戳转换时间
     * @author wangcheng
     * @date 2020/02/19
     * @param timeStamp
     * @param pattern
     * @return: java.util.Date
    **/
    public static Date parseDateByTimeStamp(Long timeStamp,String pattern){
        if(null == timeStamp){
            return null;
        }
        Date date = new Date(timeStamp);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sf.format(date);
       return strTodate(format,pattern);
    }

    public static Date parseDateByTimeStamp(Long timeStamp){
       return parseDateByTimeStamp(timeStamp,"yyyy-MM-dd HH:mm:ss");
    }

    public static String parseDateStrByTimeStamp(Long timeStamp,String pattern){
        Date date = new Date(timeStamp);
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sf.format(date);
        return format;
    }

    /**
     * 时间戳转换时间字符串
     * @author wangcheng
     * @date 2020/02/19
     * @param timeStamp
     * @param
     * @return: java.util.Date
     **/
    public static String parseDateStrByTimeStamp(Long timeStamp){
        return parseDateStrByTimeStamp(timeStamp,"yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 计算两个日期相差的天数的绝对值
     * @param dateStr1 格式：yyyy-MM-dd
     * @param dateStr2 格式：yyyy-MM-dd
     * @return
     * @throws ParseException
     */
    public static Long getDayDifference(String dateStr1, String dateStr2) {
        return getDayDifference(strToDate(dateStr1), strToDate(dateStr2));
    }

    /**
     * 计算两个日期相差的天数的绝对值
     * @param date1
     * @param date1
     * @return
     * @throws ParseException
     */
    public static Long getDayDifference(Date date1, Date date2) {
        return Math.abs(date1.getTime() - date2.getTime()) / (24 * 60 * 60 * 1000);
    }

    /**
     * 计算两个日期相差的天数的绝对值
     * @param date1
     * @param dateStr2 格式：yyyy-MM-dd
     * @return
     * @throws ParseException
     */
    public static Long getDayDifference(Date date1, String dateStr2) {
        return getDayDifference(date1, strToDate(dateStr2));
    }

    /**
     * 计算两个日期相差的天数的绝对值
     * @param dateStr1 格式：yyyy-MM-dd
     * @param date2
     * @return
     * @throws ParseException
     */
    public static Long getDayDifference(String dateStr1, Date date2) {
        return getDayDifference(strToDate(dateStr1), date2);
    }

    /**
     * 分钟
     */
    public static Date getOverTimeByMinute(int minute, Date endDate) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(endDate);
        int nowMinute = ca.get(Calendar.MINUTE);
        int res = nowMinute % minute;
        if (res == 0) {
            //准点 当前分钟加指定时间
            ca.add(Calendar.MINUTE, minute);
        } else {
            //当前分钟加(指定时间-余数)
            ca.add(Calendar.MINUTE, minute - res);
        }
        ca.set(Calendar.SECOND, 0);
        return ca.getTime();
    }

    /**
     * 小时
     */
    public static Date getOverTimeByHour(int hour, Date endDate) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(endDate);
        int nowHour = ca.get(Calendar.HOUR_OF_DAY);
        int res = nowHour % hour;
        if (res == 0) {
            //准点 当前分钟加指定时间
            ca.add(Calendar.HOUR_OF_DAY, hour);
        } else {
            //当前分钟加(指定时间-余数)
            ca.add(Calendar.HOUR_OF_DAY, hour - res);
        }
        ca.set(Calendar.MINUTE, 0);
        ca.set(Calendar.SECOND, 0);
        return ca.getTime();
    }

    /**
     * 小时分钟获取完整时间
     *
     * @param
     * @return
     */
    public static Date getDateByHourMinute(String dateStr, Date now) {
        String s = dateToStr(now);
        Date date = strTodate(s + " " + dateStr, "yyyy-MM-dd HH:mm");
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        return cal.getTime();
    }

    public static int getWeekOfDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        if (w < 0)
            w = 0;
        return w;
    }

    public static int getMonthOfDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int w = cal.get(Calendar.DAY_OF_MONTH);
        if (w < 0)
            w = 0;
        return w;
    }

}

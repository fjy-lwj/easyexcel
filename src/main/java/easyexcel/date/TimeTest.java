package easyexcel.date;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author fjy
 * @date 2021/1/11 18:16
 */
public class TimeTest {

    @Test
    public void test01() {
        Date nowDate = new Date();
        Date startDate = DateUtils.dateCalc(DateUtils.getOverTimeByMinute(10, nowDate), - 2 * 10, DateUtils.MINUTE);
        // 18:29 得到18:30 , 18:30 得到18:40
        System.out.println("DateUtils.getOverTimeByMinute(10, nowDate) = " + DateUtils.getOverTimeByMinute(10, nowDate));
        System.out.println("startDate = " + startDate);


        Date excuteDate = DateUtils.getDateByHourMinute("16:15:00", nowDate);
        System.out.println("excuteDate = " + excuteDate);


        //执行前半小时刷新数据
        Date refreshDate = DateUtils.dateCalc(startDate, -1, DateUtils.HOUR);
        System.out.println("refreshDate = " + refreshDate);

        Integer[] ia={0,1,2,3,4,5,6,7,8,9};
        List<Integer> list= new ArrayList(Arrays.asList(ia));

        List<Integer> lists = Arrays.asList(ia);
        Collections.shuffle(list);
        System.out.println("list = " + list);

        Collections.shuffle(lists);
        System.out.println("lists = " + lists);

    }

    @Test
    public void test02() {
        Date theTodayStartDate = getTheTodayStartDate(new Date());
        String s = dateToStr(theTodayStartDate, "yyyy-MM-dd HH:mm:ss");
        System.out.println("theTodayStartDate = " + theTodayStartDate);
        System.out.println("s = " + s);
    }

    // 获取当天开始的时间  如: Mon Jan 25 00:00:00 CST 2021
    public static Date getTheTodayStartDate(Date date) {
        if (date == null) {
            return null;
        } else {
            Calendar c1 = Calendar.getInstance();
            c1.setTime(date);
            c1.set(11, 0);
            c1.set(12, 0);
            c1.set(13, 0);
            c1.set(14, 0);
            return c1.getTime();
        }
    }

    //日期格式转为字符串格式   如: 2021-01-25 00:00:00
    public static String dateToStr(Date date, String formatStr) {
        try {
            SimpleDateFormat format = new SimpleDateFormat(formatStr);
            return format.format(date);
        } catch (Exception e) {
            return "";
        }
    }

}

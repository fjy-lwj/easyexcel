package easyexcel.hutool;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.convert.ConverterRegistry;
import cn.hutool.core.date.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * @author fjy
 * @date 2021/2/7 10:07
 */
public class HutoolTest {

    @Test
    public void test1() {
/*
转换为大写
*/
        double aa = 67556.32;
        //结果为："陆万柒仟伍佰伍拾陆元叁角贰分"    注意 转换为大写只能精确到分（小数点儿后两位），之后的数字会被忽略。
        String digitUppercase = Convert.digitToChinese(aa);
        System.out.println("digitUppercase = " + digitUppercase);

        DateUnit minute = DateUnit.MINUTE;
        int a = 3423;
        ConverterRegistry converterRegistry = ConverterRegistry.getInstance();
        String result = converterRegistry.convert(String.class, a);
        Assert.assertEquals("3423", result);

/*获取Date对象的某个部分*/
        Date date = DateUtil.date();
        //获得年的部分
        int year = DateUtil.year(date);
        System.out.println("year = " + year);
        //获得月份，从0开始计数
        int month = DateUtil.month(date) + 1;
        System.out.println("month = " + month);
        //获得月份枚举,从0开始
        Month month1 = DateUtil.monthEnum(date);


/*开始和结束时间
有的时候我们需要获得每天的开始时间、结束时间，每月的开始和结束时间等等，DateUtil也提供了相关方法：*/

        String dateStr = "2021-02-01 22:33:23";
        Date dateNow = DateUtil.parse(dateStr);

        //一天的开始，结果：2017-03-01 00:00:00
        Date beginOfDay = DateUtil.beginOfDay(DateUtil.offsetDay(dateNow, 1));
        System.out.println("beginOfDay = " + beginOfDay);
        //一天的结束，结果：2017-03-01 23:59:59
        Date endOfDay = DateUtil.endOfDay(DateUtil.offset(dateNow, DateField.WEEK_OF_YEAR,30));
        System.out.println("endOfDay = " + endOfDay);


/*日期时间偏移*/
        String dateStr2 = "2017-03-01 22:33:23";
        Date date2 = DateUtil.parse(dateStr2);

        //结果：2017-03-03 22:33:23
        Date newDate = DateUtil.offset(date2, DateField.DAY_OF_MONTH, 2);

        //常用偏移，结果：2017-03-04 22:33:23
        DateTime newDate2 = DateUtil.offsetDay(date2, 3);

        //常用偏移，结果：2017-03-01 19:33:23
        DateTime newDate3 = DateUtil.offsetHour(date2, -3);
    }
}

package Chapter10.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 演示日历类的常用方法
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 17:01
 * @copyright 老九学堂
 * @remark TODO
 */
public class CalendarDemo {
    public static void main(String[] args) throws ParseException {
        //Calender是一个抽象类，一般由子类GregorianCalendar实现
        Calendar calendar = Calendar.getInstance();
        //使用日历打印当前的时间
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int milliSecond = calendar.get(Calendar.MILLISECOND);
        System.out.println("当前时间：");
        String strTime = String.format("%d年%d月%d日 %d时%d分%d:%s",
                year, month, day, hour, minute, second, milliSecond
                );
        System.out.println(strTime);

//        //为日历对象设定时间
//        calendar.set(2012,5,12,14,28,4);
//        Date date = calendar.getTime();
//        System.out.println(date.toLocaleString());
//
//        //日期格式化类
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//        String strDate = format.format(date);
//        System.out.println(strDate);
//
//        //将字符串转换为Date类型
//        Date newDate = format.parse("2017-12-30 23:59:59:999");
//        System.out.println(newDate.toLocaleString());

        //时间相差
        GregorianCalendar calendar1 = new GregorianCalendar(2017,8 - 1,19);
        long diff =Math.abs(calendar.getTimeInMillis() - calendar1.getTimeInMillis());
        int diffDay = (int)(diff / 1000 / 60 / 60 / 24);
        System.out.println("相差：" + diffDay + "天");

        //时间加法
        calendar.add(Calendar.YEAR,3);
        System.out.println(calendar.get(Calendar.YEAR));

        //当前月份某个字段的最大值
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}

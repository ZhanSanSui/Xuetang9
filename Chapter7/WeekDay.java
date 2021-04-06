package Chapter7;

import java.util.Scanner;

/**
 * 书写方法，将数字星期转换为文字版并输出
 * @author：Wen
 * @version：1.0
 * @date：2021/4/6 18:40
 * @copyright 老九学堂
 * @remark TODO
 */
public class WeekDay {
    public static void main(String[] args) {
        System.out.print("请输入今天星期几：");
        int dayOfWeek = new Scanner(System.in).nextInt();
        //中文
        ShowWeekDayByChinese(dayOfWeek - 1);
        //日文
        ShowWeekDayByJapanese(dayOfWeek - 1);
        //英文
        ShowWeekDayByEnglish(dayOfWeek - 1);
    }

    /**
     * 用来判断传入的参数是否在1-7之间
     * @param dayOfWeek 要判断的整型数字：星期几
     * @return 如果合法，返回true，非法返回false
     */
    private static boolean isWeekDayValidate(int dayOfWeek){
        if (dayOfWeek < 1 || dayOfWeek > 7){
            return false;
        }
        return true;
    }

    /**
     * 以中文的方式，打印星期几
      * @param dayOfWeek
     */
    public static void ShowWeekDayByChinese(int dayOfWeek){
        if (!isWeekDayValidate(dayOfWeek)){
            System.out.println("必须输入1-7之间的数字");
            return;
        }
        String[] weekDays = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"} ;
        System.out.println(weekDays[dayOfWeek]);
    }

    /**
     * 以日文的方式，打印星期几
     * @param dayOfWeek
     */
    public static void ShowWeekDayByJapanese(int dayOfWeek){
        if (!isWeekDayValidate(dayOfWeek)){
            System.out.println("必须输入1-7之间的数字");
            return;
        }
        String[] weekDays = {"月耀日", "火耀日", "水曜日", "木曜日", "金曜日", "土耀日", "日曜日"};
        System.out.println(weekDays[dayOfWeek]);
    }

    /**
     * 以英文的方式，打印星期几
     * @param dayOfWeek 1-7之间的整型数字，用来表示星期几
     */
    public static void ShowWeekDayByEnglish(int dayOfWeek){
        if (!isWeekDayValidate(dayOfWeek)){
            System.out.println("必须输入1-7之间的数字");
            return;
        }
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(weekDays[dayOfWeek]);
    }
}

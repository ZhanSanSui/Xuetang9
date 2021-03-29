package Chapter5;


/**
 * 打印1997年7月的日历
 * @author：Wen
 * @version：1.0
 * @date：2021/3/29 16:24
 * @copyright 老九学堂
 * @remark TODO
 */
public class MyCalender {
    /**
     * 打印月历
     * 请使用循环打印1997年7月的月历
     * 已知：1997年7月1日（星期二），香港回归举国同庆
     */

    public static void main(String[] args) {

        System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
        System.out.print("\t\t");
//        星期二相当于在星期一前打了一个\t
//        System.out.print("\t\t1\t\t2\t\t3\t\t4\t\t5\t\t6");

        int dayOfMonth = 31; //1997年的7月一共有31天
        for (int i =1;i <= dayOfMonth;i++){
            System.out.print(i);
            //判断何时\t何时\n（周日那天）
            //已知：1号是星期二,因为1号是星期二，所以用下标的方式来算日期的判断值
            //把星期一到星期二以0-6的下标来记，原本应该是从下标0开始，现在是从下标1开始，再原先的基础之上+1
            if ((i + 1) % 7 == 0){
                System.out.print("\n");
            }else {
                System.out.print("\t\t");
            }
        }
    }
}

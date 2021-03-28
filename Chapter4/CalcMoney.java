package Chapter4;

/**
 * 某宝双十一2015年的交易额为800亿，每年递增25%
 * 问：按此速度哪年交易额达到2000亿？
 * @author：Wen
 * @version：1.0
 * @date：2021/3/28 19:00
 * @copyright 老九学堂
 * @remark TODO
 */
public class CalcMoney {
    public static void main(String[] args) {
        //确定循环变量
        double money = 800; //交易额
        int sum = 0;
        int year = 2015; //年份
        while (money <= 2000){
//            sum += ((money * 0.25) + money);
//            year++;
            year++;
            money *= 1.25;
        }
        System.out.println(year + "年交易额达到2000亿" );
    }
}

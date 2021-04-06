package Chapter5;

import java.util.Scanner;

/**
 * 循环输入5个玩家的消费，统计消费额低于500的玩家数量
 * 如果消费大于等于500，则跳过；小于500则计数器+1
 * @author：Wen
 * @version：1.0
 * @date：2021/3/29 21:24
 * @copyright 老九学堂
 * @remark TODO
 */
public class MoneyTotal {
    public static void main(String[] args) {
        //1.循环录入5个玩家的消费金额
        //2.录入后立刻判断是否小于500
        //3.累加小于500的总次数
        Scanner input = new Scanner(System.in);
        //玩家消费额,赋一个不可能的值，方便后面的判断
        int money = Integer.MAX_VALUE;
        //消费额低于500的玩家数量
        int total = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("请输入第" + (i + 1) + "位玩家的消费额：");
            money = input.nextInt();
            if (money >= 500){
                continue;
            }else {
                total++;
            }
        }
        System.out.println("消费额低于500的玩家数量：" + total);
    }
}

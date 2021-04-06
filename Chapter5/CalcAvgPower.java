package Chapter5;

import java.util.Scanner;

/**
 * 求游戏公会玩家的平均战斗力
 * @author：Wen
 * @version：1.0
 * @date：2021/3/29 16:07
 * @copyright 老九学堂
 * @remark TODO
 */
public class CalcAvgPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //玩家的战斗力
        int power = 0;
        //输入三个战斗力，求平均值
        int sum = 0;
        double avg = 0;

        //强烈建议：一个循环最好只做一件事
        //在以后学习数组后，使用单独循环求战力之和

        for (int i = 0;i < 3;i++){
            System.out.print("请输入第" + (i + 1) + "位玩家的战斗力:");
            power = input.nextInt();
            sum += power;
        }
        avg = sum / 3;
        System.out.printf("玩家的平均值为：%.2f",avg);
    }
}

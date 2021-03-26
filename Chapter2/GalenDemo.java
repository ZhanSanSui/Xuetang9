package Chapter2;

import java.util.Scanner;

/**
 *随堂练习 实现从控制台输出多行信息
 * @author：Wen
 * @version：1.0
 * @date：2021/3/26 20:00
 * @copyright 老九学堂
 * @remark TODO
 */
public class GalenDemo {
    public static void main(String[] args){
        System.out.println("生 命 值：■■■■■□□□□");
        System.out.println("物理攻击：■■■■■■□□□");
        System.out.println("技能伤害：■□□□□□□□");
        System.out.println("上手难度：■■■■□□□□");

        //个人方法
//        double attack = 57.88; //攻击伤害
//        double attackDistance = 172; //攻击距离
//        double armor = 27.536; //护甲值
//        double magicResist = 32.1; //魔抗值
//        double hp = 616.28; //生命值
//        double hpResume = 7.84; //生命回复
//        double mp = 0.0; //法力值
//        double mpResume = 0.0; //法力回复
//        int speed = 340; //移速
//        String loc = "上单 辅助 打野"; //定位
//        int money = 450; // 点券
//        int gold = 1000; //金币

//        System.out.printf("伤害：%.2f(+4.5)\t\t攻击距离：%.2f\n",attack,attackDistance);
//        System.out.printf("护甲：%.2f(+3.0)\t\t魔抗：%.2f(+1.25)\n",armor,magicResist);
//        System.out.printf("生命值：%.2f(+84.25)\t生命回复：%.2f(+0.5)\n",hp,hpResume);
//        System.out.printf("法力值：%.2f(+0.0)\t\t法力回复：%.2f(+0.0)\n",mp,mpResume);
//        System.out.printf("移速：%d\t\t\t\t定位：%s\n",speed,loc);
//        System.out.printf("点券：%d\t\t\t\t金币：%d",money,gold);

//        //课上方法，举例两个变量值来说明
//        double attack = 57.88;
//        double attackGrowth = 4.5;
//        System.out.printf("伤害：%.2f(+%.2f)\n",attack,attackGrowth);
        //利用String.format来实现打印
//        String line1 = String.format("伤害：%.2f(+%.2f)\n",attack,attackGrowth);
//        System.out.println(line1);

        //加入Scanner
        double attack = 57.88;
        double attackGrowth = 4.5;
        Scanner input = new Scanner(System.in);
        System.out.print("伤害：");
        attack = input.nextDouble();
        System.out.print("伤害成长值：");
        attackGrowth = input.nextDouble();
        String line1 = String.format("伤害：%.2f(+%.2f)\n",attack,attackGrowth);
        System.out.println(line1);
    }
}

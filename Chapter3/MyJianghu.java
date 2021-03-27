package Chapter3;

import java.util.Scanner;

/**
 * 根据角色的内力值打印角色的能力描述
 * @author：Wen
 * @version：1.0
 * @date：2021/3/27 15:41
 * @copyright 老九学堂
 * @remark TODO
 */
public class MyJianghu {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入角色的内力值：");
//        int power = input.nextInt();
//        if(power >= 0 && power <=1000){
//            System.out.println("不堪一击！");
//        }else if (power > 1000 && power <=3000){
//            System.out.println("毫不足虑！");
//        }else if (power > 3000 && power <=5000) {
//            System.out.println("不足挂齿！");
//        }else if (power > 5000 && power <=8000) {
//            System.out.println("初学乍练！");
//        }else if (power > 8000 && power <=10000) {
//            System.out.println("粗通皮毛！");
//        }else if (power > 10000 && power <=20000) {
//            System.out.println("平平常常！");
//        }else if (power > 20000 && power <=30000) {
//            System.out.println("普普通通！");
//        }else if (power > 30000 && power <=50000) {
//            System.out.println("马马虎虎！");
//        }else if (power > 50000 && power <=80000) {
//            System.out.println("略有小成！");
//        }else if (power > 80000 && power <=100000) {
//            System.out.println("举重若轻！");
//        }else if (power > 100000 && power <=200000) {
//            System.out.println("驾轻就熟！");
//        }else if (power > 200000 && power <=300000) {
//            System.out.println("已有小成！");
//        }else if (power > 300000 && power <=400000) {
//            System.out.println("心领神会！");
//        }else if (power > 400000 && power <=500000) {
//            System.out.println("略有大成！");
//        }else if (power > 500000 && power <=600000) {
//            System.out.println("了然于胸！");
//        }else if (power > 600000 && power <=700000) {
//            System.out.println("已有大成！");
//        }else if (power > 700000 && power <=800000) {
//            System.out.println("豁然贯通！");
//        }else if (power > 800000 && power <=900000) {
//            System.out.println("出类拔萃！");
//        }else if (power > 900000 && power <=1000000) {
//            System.out.println("无可匹敌！");
//        }else if (power > 1000000 && power <=1200000) {
//            System.out.println("技冠群雄！");
//        }else if (power > 1200000 && power <=1400000) {
//            System.out.println("神乎其技！");
//        }else if (power > 1400000 && power <=1600000) {
//            System.out.println("出神入化！");
//        }else if (power > 1600000 && power <=1800000) {
//            System.out.println("登峰造极！");
//        }else if (power > 1800000 && power <=2000000) {
//            System.out.println("所向无敌！");
//        }else if (power > 2000000 && power <=2200000) {
//            System.out.println("举世无双！");
//        }else if (power > 2200000 && power <=2400000) {
//            System.out.println("一代宗师！");
//        }else if (power > 2400000 && power <=2600000) {
//            System.out.println("震古烁今！");
//        }else if (power > 2600000 && power <=2800000) {
//            System.out.println("天不可测！");
//        }else if (power > 2800000 && power <=3000000) {
//            System.out.println("奇迹再现！");
//        }else if (power > 3000000){
//            System.out.println("天人合一");
//        }else {
//            System.out.println("输入错误，终止程序！");
//        }

        //改变程序
        String info = null; //角色信息
        Scanner input = new Scanner(System.in);
        System.out.print("请输入角色的内力值：");
        int power = input.nextInt();
        //只做一件事->判断内力值
        if (power <= 1000){
            info = "不堪一击";
        }else if (power < 3000){
            info = "毫不足虑";
        }
        //打印
        System.out.println("燕南飞大侠" + info);

    }
}

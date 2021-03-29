package Chapter5;

import java.util.Scanner;

/**
 * 幸运53猜商品价格游戏
 * 根据猜的次数给予不同的奖励
 * 1次：Iphone12
 * 2-3次：华为（HUAWEI）荣耀收获zero
 * 5次以内：小米蓝牙耳机青春版
 * @author：Wen
 * @version：1.0
 * @date：2021/3/29 17:01
 * @copyright 老九学堂
 * @remark TODO
 */
public class GuessDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //随机常量1000-9000
//        final int guessNum =(((int)Math.random() * 1000) % 9 + 1) * 1000;
        final int guessNum = 5000; //定义一个常量
        //方法一：
//        int num = 0; //用户输入的数字
//        int count = 0; //用户猜的总次数
//        for (int i = 0;i < 5;i++){
//            System.out.print("神秘商品的价格是第(" + ++count +")次：");
//            num = input.nextInt();
//
//            //在猜测正确的情况下，再判断猜测的次数
//            if (num == guessNum && count == 0){
//                System.out.println("恭喜，猜对了！");
//                System.out.println("恭喜您中了头奖：Iphone12一部！");
//                break;
//            }else if (num == guessNum && (count >=2 && count <= 3)){
//                System.out.println("恭喜您中了二等奖：华为（HUAWEI）荣耀收获zero！");
//                break;
//            }else if (num == guessNum && (count >=4 && count <= 5)){
//                System.out.println("恭喜您中了三等奖：小米蓝牙耳机青春版");
//                break;
//            }
//
//            if (num > guessNum){
//                System.out.println("大了！");
//            }else if (num < guessNum){
//                System.out.println("小了！");
//            }
//        }
//        System.out.println("5次机会已用完了，下次再接再厉！");


        //方法二
        int guessPrice = -1; //用户猜测的单价
        int count = 0; //用户猜的总次数
        String prizeName = null; //奖品名称
        for (int i = 0;i < 5;i++){
            System.out.print("神秘商品的价格是第(" + ++count +")次：");
            guessPrice = input.nextInt();
            if (guessPrice == guessNum){
                if (count == 1){
                    System.out.println("牛逼了，一次就猜对了！");
                    prizeName = "Iphone12";
                }else if (count >=2 && count <= 3){
                    prizeName = "华为（HUAWEI）荣耀收获zero";
                }else
                    prizeName = "小米蓝牙耳机青春版";
                break;
            }else if (guessPrice < guessNum){
                System.out.println("小了！请继续");
            }else if(guessPrice > guessNum){
                System.out.println("大了！请继续");
            }
        }

        //判断中奖奖品，以及次数是否到达5次
        if (null == prizeName){
            System.out.println("5次机会已用完了，下次再接再厉！");
        }else{
            System.out.println("恭喜您中奖了，奖品是：" + prizeName);
        }
    }
}

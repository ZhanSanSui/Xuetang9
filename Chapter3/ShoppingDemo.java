package Chapter3;

import java.util.Scanner;

/**
 * 刚好是打折季，如果总价大于50000救打7折，否则9折
 * 计算最后应付金额
 * @author：Wen
 * @version：1.0
 * @date：2021/3/27 13:06
 * @copyright 老九学堂
 * @remark TODO
 */
public class ShoppingDemo {
    public static void main(String[] args){
//    //1.让用户输入三种商品的单价和数量
//        Scanner input = new Scanner(System.in);
//        double price;   //商品的单价
//        int count;      //商品的数量
//        double total;   //商品的总价
//
//        System.out.print("请输入路易斯威登中号手袋的单价：");
//        price = input.nextDouble();
//        System.out.print("请输入购买的数量：");
//        count = input.nextInt();
//        total = price * count; //计算第一次总价
//
//        System.out.print("请输入爱马仕时尚休闲皮带的单价：");
//        price = input.nextDouble();
//        System.out.print("请输入购买的数量：");
//        count = input.nextInt();
//        total += price * count; //计算两个商品的总价
//
//        System.out.print("请输入香奈儿东方屏风香水的单价：");
//        price = input.nextDouble();
//        System.out.print("请输入购买的数量：");
//        count = input.nextInt();
//        total += price * count; //计算三个商品的总价
//    //2.计算总价
//    //3.根据总价判断是否打折
//        if(total >= 50000){
//            total *= 0.7;
//        System.out.println("打7折！");
//        }else {
//            total *= 0.9;
//        System.out.println("打9折！");
//        }
//    //4.打印打折后应支付的金额
//        System.out.printf("最后应付金额：%.2f",total);

    /**
     * 商家更改享受折扣的规则：
     * 如果购买的三种商品每种商品的总价大于5000或三种商品总金额大于35000
     * 折扣率为30%，否则折扣率为80%
    */
        //1.让用户输入三种商品的单价和数量
        Scanner input = new Scanner(System.in);
        double price1,price2,price3;   //商品的单价
        int count1,count2,count3;      //商品的数量
        double total = 0,total1 = 0,total2 = 0,total3 = 0;   //商品的总价

        System.out.print("请输入路易斯威登中号手袋的单价：");
        price1 = input.nextDouble();
        System.out.print("请输入购买的数量：");
        count1 = input.nextInt();
        total1 = price1 * count1; //计算第一次总价

        System.out.print("请输入爱马仕时尚休闲皮带的单价：");
        price2 = input.nextDouble();
        System.out.print("请输入购买的数量：");
        count2 = input.nextInt();
        total2 += price2 * count2; //计算两个商品的总价

        System.out.print("请输入香奈儿东方屏风香水的单价：");
        price3 = input.nextDouble();
        System.out.print("请输入购买的数量：");
        count3 = input.nextInt();
        total3 += price3 * count3; //计算三个商品的总价

        total = total1 + total2 + total3;
        //2.计算总价
        //3.根据总价判断是否打折
        if((total1 >= 5000 && total2 >= 5000 && total3 >= 5000)|| total>=35000){
            total *= 0.3;
            System.out.println("打3折！");
        }else {
            total *= 0.8;
            System.out.println("打7折！");
        }
        //4.打印打折后应支付的金额
        System.out.printf("最后应付金额：%.2f",total);

    }
}

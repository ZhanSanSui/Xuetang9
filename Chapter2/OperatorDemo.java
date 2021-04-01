package Chapter2;

import java.util.Scanner;

/**
 * 运算符实例
 * @author：Wen
 * @version：1.0
 * @date：2021/4/1 21:24
 * @copyright 老九学堂
 * @remark TODO
 */
public class OperatorDemo {
    public static void main(String[] args) {
        //1.赋值运算符
        int num = 998; //声明了一个int类型的变量num，将整数998赋值给整型变量num

        //2.复合赋值运算符
        //为什么需要：在实际开发时，经常做一些数字的累加
        num += 10; // num = num + 10;

        //取模（取余数）：%
        //取模后，结果的符号与第一个操作数相同
        num = 9;
        System.out.printf("%d %% %d = %d\n",num,5,num % 5);

        //2.算术运算符
        //1.一元运算符：++ / --
        int num3 = 1024;
//        num3++; //如果单独一条语句，++/--是前置还是后置，结果都是一样的

        //num++/--后置运算，先取变量的值进行计算，然后变量再自增/自减
        System.out.println("num3++ = " + num3++);
//        等价于：先打印num3 = 1024 ，再计算1024++
        //++/--num前置运算：先计算自增/自减，然后取计算后的结果继续后续的计算
        System.out.println("++num3 = " + ++num3);
//        等价于：先计算1024++，再打印1024++后的结果


        //3.三元运算符
        System.out.print("小明拿出多少钱请客吃饭：");
        int money = new Scanner(System.in).nextInt();
        String food = money >= 5000 ? "满汉全席" : "天妇罗盖浇饭"; //简单版if语句
        System.out.println("小明拿出" + money + "块钱请你吃：" + food);

    }
}

package Chapter4;

import java.util.Scanner;

/**
 * 书写Java程序实现简单的计算器功能
 * @author：Wen
 * @version：1.0
 * @date：2021/3/28 20:39
 * @copyright 老九学堂
 * @remark TODO
 */
public class CalcDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choice = "y"; //用户的选择是否继续

        //若使用double类型，则打印使用printf()

        int num1 = 0,num2 = 0; //定义两个操作数
        int sum = 0; //定义运算结果
        String str = null; //定义运算符
        do {
            System.out.println("请输入两个操作数：");
            num1 = input.nextInt();
            num2 = input.nextInt();
            System.out.println("请输入运算符：");
            str = input.next();
            if ("*".equals(str)){
                sum = num1 * num2;
            }else if ("/".equals(str)){ //判断被除数是否为0
                if (num2 == 0){
                    System.out.println("除数不能为0！");
                    sum = 0;
                }else{
                sum = num1 / num2;
                }
            }else if ("+".equals(str)){
                sum = num1 + num2;
            }else if ("-".equals(str)){
                sum = num1 - num2;
            }else if ("%".equals(str)){
                sum = num1 % num2;
            }else {
                System.out.println("未知运算符，运算失败！");
                sum = 0;
            }

            //还可以使用switch-case结构
//            switch (str){
//                case "*":
//                    sum = num1 * num2;
//            }

            System.out.println(num1 + str + num2 + "=" + sum);
            System.out.println("是否继续计算（y/n）:");
            choice = input.next();
        }while ("y".equalsIgnoreCase(choice));

        System.out.println("程序结束!");
        System.exit(0);
    }
}

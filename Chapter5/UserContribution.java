package Chapter5;

import java.util.Scanner;

/**
 * 循环输入玩家的个贡献值，如果为负则停止输入，提示输入错误
 * 一旦输入为负值，使用break跳出循环
 * @author：Wen
 * @version：1.0
 * @date：2021/3/29 16:46
 * @copyright 老九学堂
 * @remark TODO
 */
public class UserContribution {
    public static void main(String[] args) {
        //输入玩家的个人贡献值
        Scanner input = new Scanner(System.in);
        int userCtr = 0;
        int sum = 0;

        //方法一
//        for (;;){ //死循环
//            System.out.print("请输入本次的个人贡献值：");
//            userCtr = input.nextInt();
//            userCtr = new Scanner(System.in).nextInt(); //匿名的方式调用对象方法，只可使用一次
//            if (userCtr < 0){
//                System.out.println("个人贡献值不能为负！程序强制退出！");
//                break;
//            }
//            sum += userCtr;
//        }

        //方法二
        for (int i = 0;i < Integer.MAX_VALUE;i++){
            System.out.print("请输入本次的个人贡献值：");
            userCtr = input.nextInt();

            if (userCtr < 0){
                System.out.println("个人贡献值不能为负！程序强制退出！");
                break; //跳出整个循环->不能跳出if语句
            }

            sum += userCtr;
        }
        System.out.print("当前玩家个人贡献度为：" + sum);
    }
}
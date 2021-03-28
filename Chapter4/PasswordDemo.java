package Chapter4;

import java.util.Scanner;

/**
 * 计算输入的整形数字中每位数字之和
 * @author：Wen
 * @version：1.0
 * @date：2021/3/28 18:38
 * @copyright 老九学堂
 * @remark TODO
 */
public class PasswordDemo {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int i = 1;
//        while(i <= 3){
//            System.out.print("请输入密码：");
//            String str1 = input.next();
//            System.out.print("请再次输入密码：");
//            String str2 = input.next();
//            if(str1 == str2){
//                System.out.println("验证成功！");
//            }else {
//                System.out.println("验证失败，请重新输入");
//            }
//            i++;
//        }
//        if (i > 3) {
//            System.out.println("输入3次错误，系统自动退出");
//            System.exit(0);
//        }
        final String PASSWORD = "123456"; //常量

        Scanner input = new Scanner(System.in);
        String password = null; //密码
        String userName = ""; //NULL nullptr
        int i = 0;
        while (i < 3) {
            System.out.print("请输入密码：");
            password = input.next();
            //JAVA中的字符串不允许这样判断：if(password == "123456")
            i++;
            if (!PASSWORD.equals(password)) {//判断字符串相等的固定方式！！
                System.out.println("密码输入错位，请重新输入！");
                if(i == 3){
                    System.out.println("密码输入错误已达三次，强行退出！");
                    System.exit(0);
                }
            }else { //输入密码相等的情况
                i = Integer.MAX_VALUE; //让i的值为整型里的最大值！
            }
        }
        System.out.println("密码正确！");
    }
}
package Chapter8.UserDemo;

import java.util.Scanner;

/**
 * 以下代码实现用户注册
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 21:24
 * @copyright 老九学堂
 * @remark TODO
 */
public class UserMain {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

//        System.out.print("请输入用户名：");
//        String userName = input.next();

        System.out.print("请输入密码：");
        String passWord = input.next();
        System.out.println(StringUtil.validatePassWord(passWord));

//        System.out.print("\n请输入电子邮箱地址：");
//        String email = input.next();

    }
}

package Chapter11;

import java.util.Scanner;

/**
 * 用户输入的年龄只能是整型数字，使用异常处理机制捕获并处理异常情况
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 16:35
 * @copyright 老九学堂
 * @remark TODO
 */
public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年龄（必须是整型）：");
        int age = -1;
        try{
            age = input.nextInt();
        }catch (Exception e){
            //一般在开发的时候使用：（用堆栈的方式打印异常信息）
            e.printStackTrace();
            //获取异常信息：
            //System.out.println(e.getMessage());
        }
        System.out.println("输入的年龄是：" + age);
    }
}

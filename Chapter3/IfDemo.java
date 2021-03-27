package Chapter3;

import java.util.Scanner;

/**
 * if案例
 * @author：Wen
 * @version：1.0
 * @date：2021/3/27 12:39
 * @copyright 老九学堂
 * @remark TODO
 */
public class IfDemo {
    public static void main(String[] agrs){
//        //1.可以省略大括号
//        //2.省略大括号后if结构后只能影响到下一行
//        if(5 > 9)
//            System.out.println("大于");
//        else
//            System.out.println("小于");

        //随堂练习：硬盘盘符一般采用A-Z大写字母表示
        //使用程序判断用户输入的字符是否是合法的硬盘盘符

        System.out.println("请输入硬盘盘符：");
        Scanner input = new Scanner(System.in);
        char  disk = input.next().charAt(0);//取用户输入字符串的第一个字符
        if (disk >= 'A' && disk <= 'Z'){ //等价写法!(ch < 'A' || ch > 'Z')
            System.out.println("是合法盘符");
        }else {
            System.out.println("不是合法盘符");
        }
    }
}

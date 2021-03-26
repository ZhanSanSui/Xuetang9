package Chapter2;

import java.util.Scanner;

/**
 使用Scanner-计算一个圆的面积
 * @author：Wen
 * @version：1.0
 * @date：2021/3/25 14:43
 * @copyright 老九学堂
 * @remark TODO
 */
public class CalcCircleArea {
    public static void main(String[] agrs){
//        //需要用户手工输入半径
//        double radius = 2.5; // 半径
//        double area = 3.14 * radius * radius;
//        System.out.println("圆面积为：" + area);

        //使用Scanner工具
        //扫描对象，用来扫描系统的输入
        Scanner input = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        double radius = input.nextDouble(); //读取用户输入下一个double类型数据，赋值给左边的radius变量
        double area = 3.14 * radius * radius;
        System.out.println("圆面积为：" + area);
    }
}

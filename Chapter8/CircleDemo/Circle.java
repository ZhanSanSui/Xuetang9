package Chapter8.CircleDemo;

import java.util.Scanner;

/**
 * 使用面向对象的方式创建一个圆类，分别计算周长和面积
 * 1.定义类：Circle
 * 2.抽取属性
 * 3.定义方法
 * 4.调用方法并打印结果
 * @author：Wen
 * @version：1.0
 * @date：2021/4/9 10:44
 * @copyright 老九学堂
 * @remark TODO
 */
public class Circle {
    /**
     * 圆的半径
     */
    public double radius;

    /**
     * 圆的周长
     */
    public double perimeter;

    /**
     * 圆的面积
     */
    public double area;

    public void inputRadius(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        radius = input.nextInt();
        input.close();
    }

    public void ShowPerimeter(){
        if (radius <= 0){
            //如果用户输入不正确的值，强制在重新输入
            System.out.print("请重新输入圆的半径：");
            inputRadius();
        }
        perimeter = 2 * Math.PI * radius;
        System.out.printf("圆的周长为：%.2f\n",perimeter);
    }

    public void ShowArea(){
        if (radius <= 0){
            //如果用户输入不正确的值，强制在重新输入
            System.out.print("请重新输入圆的半径：");
            inputRadius();
        }
        area = Math.PI * Math.pow(radius, 2);
        System.out.printf("圆的面积为：%.2f",area);
    }
}

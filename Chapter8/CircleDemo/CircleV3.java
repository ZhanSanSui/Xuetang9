package Chapter8.CircleDemo;

import java.util.Scanner;

/**
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/9 11:02
 * @copyright 老九学堂
 * @remark TODO
 */
public class CircleV3 {
    /**
     * 圆的半径
     */
    private double radius;

    /**
     * 圆的周长
     */
    private double perimeter;

    /**
     * 圆的面积
     */
    private double area;

    public double getRadius(){
        return radius;
    }

    /**
     * 封装的好处：可以对传入的属性进行简单的验证
     * @param radius
     */
    public void setRadius(double radius){
        if (radius <= 0){
            radius = 1;
        }else {
            //this->自指针
            this.radius = radius;
        }

    }

    public CircleV3(){
        inputRadius();
    }

    public CircleV3(double radius){
        this.radius = radius;
    }

    public void inputRadius(){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入圆的半径：");
        radius = input.nextInt();
        input.close();
    }

    public void show(){
        System.out.printf("周长为：%.2f\n", this.getPerimeter());
        System.out.printf("面积为：%.2f", this.getArea());
    }

    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double getArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

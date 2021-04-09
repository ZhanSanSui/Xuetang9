package Chapter8.CircleDemo;

/**
 * Circle测试类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/9 10:51
 * @copyright 老九学堂
 * @remark TODO
 */
public class CircleTest {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        circle.inputRadius();
//        circle.ShowPerimeter();
//        circle.ShowArea();

        //加入构造后
//        Circle circleV2 = new Circle();
//        circleV2.ShowArea();

        //封装之后
        CircleV3 circleV3 = new CircleV3();
        circleV3.show();
    }
}

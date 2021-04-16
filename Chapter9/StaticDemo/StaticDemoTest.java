package Chapter9.StaticDemo;

/**
 * 使用单例模式 - 都是同一个对象
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 16:33
 * @copyright 老九学堂
 * @remark TODO
 */
public class StaticDemoTest {
    public static void main(String[] args) {
        StaticDemo staticDemo1 = StaticDemo.getInstance();
        System.out.println(staticDemo1.static_number);

        StaticDemo staticDemo2 = StaticDemo.getInstance();
        staticDemo2.normal_number = 1024;


        StaticDemo staticDemo3 = StaticDemo.getInstance();
        System.out.println(staticDemo3.normal_number);

        System.out.println(staticDemo1 == staticDemo2);
    }
}

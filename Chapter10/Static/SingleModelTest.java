package Chapter10.Static;

import Chapter10.Static.SingleModelDemo;

/**
 * 单例模式的测试类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 16:54
 * @copyright 老九学堂
 * @remark TODO
 */
public class SingleModelTest {
    public static void main(String[] args) {
        SingleModelDemo single1 = SingleModelDemo.getInstance();
        System.out.println(single1.count);
        single1.count++;

        SingleModelDemo single2 = SingleModelDemo.getInstance();
        System.out.println(single2.count);

        System.out.println(single1 == single2);
    }
}

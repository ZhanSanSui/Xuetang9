package Chapter10.Static;

/**
 * 单例模式 - 套路
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 16:51
 * @copyright 老九学堂
 * @remark TODO
 */
public class SingleModelDemo {
    /**
     * 用来保存唯一的本类的实例
     */
    private static SingleModelDemo me = null;

    public int count = 0;

    private SingleModelDemo() {
        count++;
    }

    /**
     * 获得本类唯一的一个实例 -- 单例模式的核心方法
     *
     * @return
     */
    public static SingleModelDemo getInstance() {
        if (null == me) {
            me = new SingleModelDemo();
        }
        return me;
    }

//    public static void main(String[] args) {
//        SingleModelDemo single1 = new SingleModelDemo();
//        System.out.println(single1.count);
//        SingleModelDemo single2 = new SingleModelDemo();
//        System.out.println(single2.count);
//        SingleModelDemo single3 = new SingleModelDemo();
//        System.out.println(single3.count);
//        SingleModelDemo single4 = new SingleModelDemo();
//        System.out.println(single4.count);
//
//
//
//
//
//    }
}

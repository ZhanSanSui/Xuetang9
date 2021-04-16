package Chapter9.StaticDemo;

/**
 * 静态 - 生命周期
 * 使用静态关键字实现了单例模式，只能获得某个类唯一一个实例
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 16:25
 * @copyright 老九学堂
 * @remark TODO
 */
public class StaticDemo {
    /**
     * 单例模式
     */
    private static StaticDemo me = null;

    /**
     * 构造方法私有，一边实现外部无法使用new进行实例化的效果
     */
    private StaticDemo(){
        //将构造方法定义为私有的
        me = this;
    }

    /**
     * 得到当前类的实例，只能调用本方法
     * @return
     */
    public static StaticDemo getInstance(){
        if (me == null){
            //唯一的一次实例化
            me = new StaticDemo();
        }
        return me;
    }

    //静态属属性/方法是先于类的实例存在的
    public static int static_number = 1;

    public int normal_number = 1;

    /**
     * 静态方法中只能调用静态属性和静态方法
     */
    public static void test(){
        static_number++;
        //normal_number++;
    }

    public static void main(String[] args) {
        StaticDemo staticDemo1 = new StaticDemo();
        staticDemo1.test();

        System.out.println(StaticDemo.static_number);
        System.out.println(staticDemo1.normal_number);

        StaticDemo staticDemo2 = new StaticDemo();
        staticDemo2.test();

        System.out.println(StaticDemo.static_number);
        System.out.println(staticDemo1.normal_number);

        staticDemo2.test();
        System.out.println(StaticDemo.static_number);
    }
}

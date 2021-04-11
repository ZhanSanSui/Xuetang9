package Chapter8.Hero;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 13:29
 * @copyright 老九学堂
 * @remark TODO
 */
public class Hero {
    String name = "默认值";
    public void test1(){
        //局部变量—优先级高
        String name = "盖伦";
        System.out.println(name);
    }

    public static void main(String[] args) {
        new Hero().test1();
    }
}

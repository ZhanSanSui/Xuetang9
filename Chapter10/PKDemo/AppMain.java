package Chapter10.PKDemo;

/**
 * 用来模拟游戏核心业务逻辑层的代码
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 14:12
 * @copyright 老九学堂
 * @remark TODO
 */
public class AppMain {
    public static void main(String[] args) {
        Hero hero1 = new Warrior(1, "曹操", 0, 0);
        Castle castle = new Castle("温莎古堡", 10, 10, 750);

        hero1.PK(castle);
    }
}

package Chapter10.ModelDemo;

/**
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 10:19
 * @copyright 老九学堂
 * @remark TODO
 */
public class HeroTest {
    public static void main(String[] args) {
        //两个战士的对战
        Hero hero1 = new Warrior(1, "盖伦", 0, 0);
        Hero hero2 = new Warrior(2, "貂蝉", 50,50);
        hero1.PK(hero2);
    }
}

package Chapter10.PKDemo;

/**
 * 战士类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 10:14
 * @copyright 老九学堂
 * @remark TODO
 */
public class Warrior extends Hero {

    public Warrior() {
        super();
        setName("默认英雄");
    }

    public Warrior(long id, String name, int x, int y) {
        super(id, name);
        setX(x);
        setY(y);
    }

    @Override
    public boolean isFightByDistance(Assailable hero) {
        double distance = getDistance(getX(), getY(), hero.getX(), hero.getY());
        return distance <= 100;
    }

    @Override
    public void fight(Assailable hero) {
        //1.生成随机的攻击力 20-70之间的随机数
        //2.减掉传入英雄对象的hp
        int attack  = ((int)(Math.random() * 1000)) % 51 + 20;
        setAttack(attack);
        hero.setHp(hero.getHp() - attack);
        System.out.println(getName() + "成功实施了一次近战攻击！");
    }

}

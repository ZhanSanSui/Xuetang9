package Chapter10.ModelDemo;

/**
 * 法师类 - 继承自远程攻击英雄
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 10:29
 * @copyright 老九学堂
 * @remark TODO
 */
public class Magical extends LongRangeHero{

    public Magical(){
        super();
    }

    public Magical(long id, String name, int attackRange, int x, int y){
        super(id, name, attackRange, x, y);
    }

    @Override
    public boolean isFightByDistance(Hero hero) {
        double distance = getDistance(this.getX(), this.getY(), hero.getX(), hero.getY());
        //攻击范围内
        if (Math.abs(distance) <= getAttackRange()) {
            return true;
        }
        System.out.println("目标距离过远，无法攻击！");
        return false;
    }

    @Override
    public void fight(Hero hero) {
        setAttack((int)Math.round(Math.random() * 5) + 5);
        hero.setHp(hero.getHp() - getAttack());
        System.out.println();
        System.out.println(getName() + "成功实施了一次远程攻击！");
    }
}

package Chapter10.PKDemo;

/**
 * 城堡类 - 不是英雄
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 14:07
 * @copyright 老九学堂
 * @remark TODO
 */
public class Castle implements Assailable{
    /**
     * 城堡的名字
     */
    private String name;
    /**
     * 城堡的坐标x，y
     */
    private int x;
    private int y;

    /**
     * 城堡的最大生命值
     */
    private int maxHp;

    /**
     * 城堡的生命值
     */
    private int hp;

    /**
     * 城堡的远程攻击伤害
     */
    private int attackRange;

    public Castle(String name, int x, int y, int attackRange){
        setName(name);
        setX(x);
        setY(y);
        setAttackRange(attackRange);
        setMaxHp(100);
        setHp(100);
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public boolean isFightByDistance(Assailable assailable) {
        //1.计算另一个可攻击对象之间的距离
        //2.如果攻击距离合法，就进行攻击
        return false;
    }

    @Override
    public void fight(Assailable assailable) {
        //假设城堡的攻击力固定
        int attack = 15;
        assailable.setHp(assailable.getHp() - attack);
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }
}

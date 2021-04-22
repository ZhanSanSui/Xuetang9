package Chapter10.PKDemo;

/**
 * 箭楼类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 14:17
 * @copyright 老九学堂
 * @remark TODO
 */
public class WatchTower implements Assailable{
    /**
     * 箭楼的名字
     */
    private String name;
    /**
     * 箭楼的坐标x，y
     */
    private int x;
    private int y;

    /**
     * 箭楼的最大生命值
     */
    private int maxHp;

    /**
     * 箭楼的生命值
     */
    private int hp;

    /**
     * 箭楼的远程攻击伤害
     */
    private int attackRange;

    public WatchTower(String name, int x, int y, int attackRange){
        setName(name);
        setX(x);
        setY(y);
        setAttackRange(attackRange);
        setMaxHp(100);
        setHp(100);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public void setX(int x) {

    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setY(int y) {

    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public boolean isFightByDistance(Assailable assailable) {
        return false;
    }

    @Override
    public void fight(Assailable assailable) {
        //假设箭楼的攻击力固定
        int attack = 15;
        assailable.setHp(assailable.getHp() - attack);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }
}

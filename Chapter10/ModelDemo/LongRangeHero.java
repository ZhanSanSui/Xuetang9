package Chapter10.ModelDemo;

/**
 * 远程英雄类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 10:22
 * @copyright 老九学堂
 * @remark TODO
 */
public abstract class LongRangeHero extends Hero{
    /**
     * 攻击距离
     */
    private int attackRange;

    public LongRangeHero() {
        super();
    }

    public LongRangeHero(long id, String name, int attackRange, int x, int y) {
        super(id, name);
        setAttackRange(attackRange);
        setX(x);
        setY(y);
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }
}

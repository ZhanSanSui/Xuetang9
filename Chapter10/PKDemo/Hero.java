package Chapter10.PKDemo;

/**
 * 实现了可攻击接口的英雄类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 13:58
 * @copyright 老九学堂
 * @remark TODO
 */
public abstract class Hero implements Assailable{
    /**
     * 英雄的id
     */
    private long id;
    /**
     * 英雄的名称
     */
    private String name;
    /**
     * 英雄的等级
     */
    private int level;
    /**
     * 英雄的最大生命值
     */
    private int maxHp;
    /**
     * 当前的生命值
     */
    private int hp;
    /**
     * 英雄的攻击力
     */
    private int attack;
    /**
     * 英雄的距离坐标
     */
    private int x;
    private int y;

    public Hero(){
        setMaxHp(100);
        setHp(100);
    }

    public Hero(long id, String name) {
        this();
        setId(id);
        setName(name);
    }

    /**
     * 计算两个英雄的距离
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    protected double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(Math.abs(x2 - x1), 2) + Math.pow(Math.abs(y2 - y1), 2));
    }

    /**
     * 英雄之间的PK
     * 1.判断两者之间的距离
     * 2.如果距离满足，就进行攻击
     * @param assailable
     */
    public void PK(Assailable assailable){
        if (isFightByDistance(assailable) && hp > 0 && assailable.getHp() > 0){
            fight(assailable);
        }else {
            System.out.println("由于攻击距离或其他原因攻击失败！");
        }
        //3.在控制台打印对战后的结果(控制台专用)
        System.out.println("两位英雄的当前状态");
        System.out.println("昵称\tHp\tX坐标\tY坐标");
        System.out.printf("%s\t%d\t%d\t\t%d",
                assailable.getName(), assailable.getHp(), assailable.getX(), assailable.getY());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
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
}

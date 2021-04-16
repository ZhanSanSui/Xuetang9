package Chapter10.ModelDemo;

import java.awt.*;

/**
 * 英雄类 - 父类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 9:58
 * @copyright 老九学堂
 * @remark TODO
 */
public abstract class Hero {
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
    /**
     * 英雄的图片属性
     */
    private Image image;

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
     * 判断当前英雄是否能够攻击传入的英雄对象
     * @param hero 要攻击的英雄对象
     * @return 是否能够攻击
     */
    public abstract boolean isFightByDistance(Hero hero);

    /**
     * 攻击传入的英雄对象，默认根据随机生成的攻击力减扣hp值
     * @param hero
     */
    public abstract void fight(Hero hero);

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
     * 使用模板模式实现的对战方法
     * 规定了默认情况下对战的流程
     * @param hero
     */
    public void PK(Hero hero){
        //1.计算距离判断是否能够攻击对方
        if (isFightByDistance(hero) && hp > 0 && hero.getHp() > 0){
            //2.如果可以攻击，就调用攻击方法
            fight(hero);
        }else {
            System.out.println("由于攻击距离或其他原因攻击失败！");
        }
        //3.在控制台打印对战后的结果(控制台专用)
        System.out.println("两位英雄的当前状态");
        System.out.println("昵称\tHp\tX坐标\tY坐标");
        System.out.printf("%s\t%d\t%d\t\t%d",
                hero.getName(), hero.getHp(), hero.getX(), hero.getY());
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
        if (level < 0 || level > 100){
            this.level = 1;
        }
        this.level = level;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}

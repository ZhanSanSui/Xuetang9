package Chapter9.RPGDemo;

/**
 * 英雄类 - 父类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 8:02
 * @copyright 老九学堂
 * @remark TODO
 */
public class Hero {
    /**
     * 英雄名称
     */
    private String nickName;

    /**
     * 英雄等级
     */
    private int level;

    /**
     * 英雄最大生命值
     */
    private int maxLife;

    /**
     * 英雄当前生命值
     */
    private int currLife;

    public Hero(){
        super();
    }

    public Hero(String nickName, int level, int maxLife, int currLife) {
        this.nickName = nickName;
        this.level = level;
        this.maxLife = maxLife;
        this.currLife = currLife;
    }

    /**
     * 英雄的移动方法
     */
    public void move(){
        System.out.println("Hero的move方法");
    }

    /**
     * 对象数组的排序方法
     * @param hero 按名字排序
     * @return
     */
    public int compareToByName(Hero hero){
        return getNickName().compareTo(hero.getNickName());
    }

    /**
     * 比较当前英雄对象和传入的英雄对象大小相等
     * @param hero 要比较的英雄对象
     * @return
     */
    public int compareTo(Hero hero){
        //只比较级别
        if (this.level > hero.getLevel()){
            return 1;
        }else if (this.level == hero.getLevel()){
            return 0;
        }else {
            return -1;
        }
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getMaxLife() {
        return maxLife;
    }

    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    public int getCurrLife() {
        return currLife;
    }

    public void setCurrLife(int currLife) {
        this.currLife = currLife;
    }
}

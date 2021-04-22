package Chapter11;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 17:05
 * @copyright 老九学堂
 * @remark TODO
 */
public class ThrowDemo {
    public static void main(String[] args) {
        Hero hero = new Hero("貂蝉");
        try {
            hero.setExp(1000);
            hero.setHealth(40);
            hero.rideHorse();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("当前英雄的经验值：" + hero.getExp());
    }
}

class Hero{
    private String name;
    private long exp;
    private int health;

    /**
     * 英雄的骑马方法 - 当英雄的健康值低于50时，不允许骑马
     */
    public void rideHorse() throws RideHorseException {
        if (health >= 50){
            System.out.println(name + "正在快乐骑着马！");
        }else {
            throw new RideHorseException(health);
        }

    }

    public Hero(String name){
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getExp() {
        return exp;
    }

    public void setExp(long exp) throws Exception {
        if (exp >= 0){
            this.exp = exp;
        }else {
            throw new LessThanZeroException((int)exp);
        }


    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}

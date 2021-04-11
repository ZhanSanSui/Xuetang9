package Chapter8.GameRole;

/**
 * 设计游戏的英雄类 - 了解封装的作用
 * 1.玩家的名称创建后不能更改
 * 2.级别在1-999之间
 * 3.玩家每级升级所需经验公式：
 *（（等级 - 1） ^ 3 + 60） / 5 （（等级 - 1） * 2 +60）
 * @author：Wen
 * @version：1.0
 * @date：2021/4/10 21:58
 * @copyright 老九学堂
 * @remark TODO
 */
public class Hero {
    /**
     * 玩家的ID
     */
    private long id;

    /**
     * 玩家的昵称
     */
    private String nicName;

    /**
     * 玩家的等级
     */
    private int level;

    /**
     * 当前玩家的升级所需经验值 - 固定值
     */
    private long exp;

    /**
     * 当前玩家的经验值
     */
    private long currExp;


    public Hero(String nicName){
        this.nicName = nicName;
    }

    public Hero(){
        super();
    }

    public Hero(long id, String nicName, int level, long exp){
        this.id = id;
        this.nicName = nicName;
        this.level = level;
        this.exp = exp;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id <= 0){
            id = 1;
        }
        this.id = id;
    }

//    public String getNicName() {
//        return nicName;
//    }
//
//    public void setNicName(String nicName) {
//        if (null == nicName){
//            nicName = "未知英雄";
//        }else {
//            this.nicName = nicName;
//        }
//
//    }

    public int getLevel() {
        if (level < 1 || level > 999){
            //如果级别超限，就重新从1级开始
            this.level = 1;
        }else {
            this.level = level;
        }
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getExp() {
//        3.玩家每级升级所需经验公式：
//        （（等级 - 1） ^ 3 + 60） / 5 （（等级 - 1） * 2 +60）
        exp = (long)((Math.pow(level - 1, 3) + 60) / 5 * (Math.pow(level - 1, 2) + 60));
        return exp;
    }

    public long getCurrExp() {
        return currExp;
    }

    public void setCurrExp(long currExp) {
        this.currExp = currExp;
    }
}

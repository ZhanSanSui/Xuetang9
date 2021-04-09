package Chapter8.Role;

/**
 * 游戏的角色类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/9 10:20
 * @copyright 老九学堂
 * @remark TODO
 */
public class Role {
    /**
     * 游戏角色的名称属性
     */
    public String name;
    /**
     * 等级
     */
    public int level;
    /**
     * 职业
     */
    public String job;

    /**
     * 默认构造方法，不带参数
     */
    public Role(){}

    /**
     * 构造方法/构造器(可带参）-重载
     * 1.没有返回值
     * 2.方法名和类名一致
     */
    public Role(String name1, int level1, String job1){
        name = name1;
        level = level1;
        job = job1;
    }

    public void show(){
        System.out.println(name + "\t" + level + "\t" + job);

    }

    /**
     * 释放技能
     */
    public void sendSkill(){
        if (name.equals("劳拉")){
            System.out.println("劳拉经典技能：双枪老太婆");
        }else if (name.equals("孙悟空")){
            System.out.println("吃俺老孙一棒");
        }else {
            System.out.println("发出了一记必杀");
        }
    }
}

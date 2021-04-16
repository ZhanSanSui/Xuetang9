package Chapter9.RPGDemo;

import Chapter9.RPGDemo.Hero;

/**
 * 战士类 - 继承了Hero类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 8:06
 * @copyright 老九学堂
 * @remark TODO
 */
public class Warrior extends Hero {
    /**
     * 战士类的静态属性，每实例化一个新的展示对象，ID++
     */
    public static int ID = 1;

    /**
     * 战士特有属性，物理攻击
     */
    private int physicalAttack;

    public Warrior(){
        setNickName("默认战士" + ID);
        setLevel(1);
        setMaxLife(100);
        setCurrLife(100);
        setPhysicalAttack(99);
        ID++;
    }

    public Warrior(String nicName, int physicalAttack){
        setNickName(nicName);
        setPhysicalAttack(physicalAttack);
    }

    /**
     * 重写了父类的移动方法
     * @Override 注解：重写
     */
    @Override
    public void move(){
        System.out.println(getNickName() + "战士移动基本靠腿！");
    }

    /**
     * 重写Object类的equals方法，以便比较两个对象是否相等
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        /**
         * 如果传入的obj是Warrior类的实例
         */
        if (!(obj instanceof Warrior)){
            return false;
        }
        Warrior newWarrior = (Warrior)obj;
        //比较
        if (getNickName().equals(newWarrior.getNickName()) && getPhysicalAttack() == newWarrior.getPhysicalAttack()){
            return true;
        }
        return false;
    }

    /**
     * 重写Object类的toString方法
     * @return
     */
    @Override
    public String toString() {
        StringBuffer str = new StringBuffer(getLevel());
        str.append(getLevel());
        str.append("\t");
        str.append(getNickName());
        str.append("\t");
        str.append(getMaxLife());
        str.append("\t\t");
        str.append(getCurrLife());
        str.append("\t\t");
        str.append(getPhysicalAttack());
        return str.toString();
    }

    public int getPhysicalAttack() {
        return physicalAttack;
    }

    public void setPhysicalAttack(int physicalAttack) {
        this.physicalAttack = physicalAttack;
    }
}

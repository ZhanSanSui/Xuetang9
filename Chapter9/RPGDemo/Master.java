package Chapter9.RPGDemo;


/**
 * 法师类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 8:55
 * @copyright 老九学堂
 * @remark TODO
 */
public class Master extends Hero{
    /**
     * 法师类的静态属性，每实例化一个新的展示对象，ID++
     */
    public static int ID = 1;

    private int magicAttack;

    public Master() {
        setNickName("默认法师" + ID);
        setLevel(1);
        setMaxLife(100);
        setCurrLife(100);
        setMagicAttack(99);
        ID++;
    }

    public Master(String nicName){
        //调用本类的默认构造
        this();
        setNickName(nicName);
    }

    /**
     * 法师的施法方法
     */
    public void biubiubiu(){
        System.out.println("大法师" + getNickName() + "正在搓火球");
    }

    /**
     * 重写toString方法,封装打印角色信息的逻辑
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
        str.append(getMagicAttack());
        return str.toString();
    }

    public int getMagicAttack() {
        return magicAttack;
    }

    public void setMagicAttack(int magicAttack) {
        this.magicAttack = magicAttack;
    }
}

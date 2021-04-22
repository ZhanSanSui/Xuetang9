package Chapter10.PKDemo;

/**
 * 可攻击接口 - 只要实现了笨接，就相当于具备了可实施攻击对象的基本特征
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 13:55
 * @copyright 老九学堂
 * @remark TODO
 */
public interface Assailable {
    String getName();

    int getX();

    void setX(int x);

    int getY();

    void setY(int y);

    int getHp();

    void setHp(int hp);

    /**
     * 根据距离判断，是否能够成功攻击另一个具备攻击能力的对象
     * @param assailable
     * @return
     */
    boolean isFightByDistance(Assailable assailable);

    /**
     * 攻击另一个具备攻击能力的对象（也可以理解成军事单位）
     * @param assailable
     */
    void fight(Assailable assailable);
}

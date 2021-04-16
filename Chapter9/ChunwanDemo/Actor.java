package Chapter9.ChunwanDemo;

/**
 * 演员父类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 15:56
 * @copyright 老九学堂
 * @remark TODO
 */
public abstract class Actor {
    private String name;

    public Actor(){}

    public Actor(String name) {
        this.name = name;
    }

    /**
     * 演员的表演方法
     */
    public void performs(){
        System.out.println("演员" + name + "正在表演精彩的节目");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

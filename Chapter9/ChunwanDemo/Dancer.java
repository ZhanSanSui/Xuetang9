package Chapter9.ChunwanDemo;

/**
 * 舞蹈演员
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 15:59
 * @copyright 老九学堂
 * @remark TODO
 */
public class Dancer extends Actor{
    public Dancer() {
    }

    public Dancer(String name) {
        super(name);
    }

    @Override
    public void performs() {
        System.out.println("舞蹈演员" + getName() + "正在展现她那婀娜多姿的舞蹈");
    }
}

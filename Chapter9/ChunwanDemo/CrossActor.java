package Chapter9.ChunwanDemo;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 16:06
 * @copyright 老九学堂
 * @remark TODO
 */
public class CrossActor extends Actor{
    public CrossActor() {
    }

    public CrossActor(String name) {
        super(name);
    }

    @Override
    public void performs() {
        System.out.println(getName() + "现在相声不景气了");
    }
}

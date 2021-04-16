package Chapter9.ChunwanDemo;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 16:08
 * @copyright 老九学堂
 * @remark TODO
 */
public class CrossActorV2 extends Actor{
    public CrossActorV2() {
    }

    public CrossActorV2(String name) {
        super(name);
    }

    @Override
    public void performs() {
        System.out.println(getName() + "相声讲究说学逗唱！");
    }
}

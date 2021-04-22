package Chapter10.Eat;

/**
 * 吃接口
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 14:24
 * @copyright 老九学堂
 * @remark TODO
 */
public interface Eat {
    String name = "接口中定义的数据域";

    default public void eating(){
        System.out.println("Eat接口的默认实现");
    }
}

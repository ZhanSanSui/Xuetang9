package Chapter11;

/**
 * 自定义异常 - 小于零时触发
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 17:13
 * @copyright 老九学堂
 * @remark TODO
 */
public class LessThanZeroException extends Exception{
    //重写父类的两个构造方法即可
    private int value;


    public LessThanZeroException(){
        super("数字不能小于零");
    }

    public LessThanZeroException(int value){
        super("输入的数字：" + value + "不能小于零");
    }
}

package Chapter11;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 17:19
 * @copyright 老九学堂
 * @remark TODO
 */
public class RideHorseException extends Exception{
    public RideHorseException(int health){
        super("当前健康值为" + health + "骑马失败！");
    }
}

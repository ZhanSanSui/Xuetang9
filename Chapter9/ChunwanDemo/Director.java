package Chapter9.ChunwanDemo;

/**
 * 导演类 -- 相当于项目中的核心业务类
 * 主要功能：让演员就位，开始表演
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 16:00
 * @copyright 老九学堂
 * @remark TODO
 */
public class Director {
    /**
     * 导演的“Action”方法，让演员就位开始表演节目
     * @param actor
     */
    public void action(Actor actor){
        actor.performs();
    }
}

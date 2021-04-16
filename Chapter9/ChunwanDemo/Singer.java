package Chapter9.ChunwanDemo;

/**
 * 歌唱演员
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 15:58
 * @copyright 老九学堂
 * @remark TODO
 */
public class Singer extends Actor{
    public Singer() {
    }

    public Singer(String name) {
        super(name);
    }

    @Override
    public void performs(){
        System.out.println("歌唱演员" + getName() + "正在表演节目《在这桃花盛开的地方》");
    }
}

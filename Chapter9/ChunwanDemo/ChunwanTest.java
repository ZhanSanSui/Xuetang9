package Chapter9.ChunwanDemo;

import java.io.IOException;
import java.util.Properties;

/**
 * 测试类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 16:02
 * @copyright 老九学堂
 * @remark TODO
 */
public class ChunwanTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Director 张艺谋 = new Director();

        Singer 宋祖英 = new Singer("宋祖英");
        Dancer 杨丽萍 = new Dancer("杨丽萍");

        张艺谋.action(宋祖英);
        张艺谋.action(杨丽萍);

        Actor 张鹤伦 = new CrossActorV2();

        //1.模拟程序的升级：要求添加相声演员，核心业务层代码不变
        CrossActor 冯巩 = new CrossActor("冯巩");
        张艺谋.action(冯巩);

        //2.要求main方法中的代码也不修改的情况下，实现某个角色升级
        //解决方案：使用反射+多态技术实现无缝升级
        Properties properties = new Properties();
        //读取配置文件
        properties.load(ChunwanTest.class.getResourceAsStream("ActorConfig.properties"));
        //System.out.println(properties.getProperty("crossactor"));
        //通过反射实例化配置文件中配置的类
        Actor actor = (Actor)Class.forName(properties.getProperty("crossactor")).newInstance();
        actor.setName("郭德纲");
        张艺谋.action(actor);

    }
}

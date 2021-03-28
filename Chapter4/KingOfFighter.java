package Chapter4;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Scanner;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/3/28 19:34
 * @copyright 老九学堂
 * @remark TODO
 */
public class KingOfFighter {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        Scanner input = new Scanner(System.in);
        //播放音乐代码 ps：mp3格式Java不支持
//        File sound1 = new File("sounds/拳皇98选人画面.wav");
//        AudioClip sound_choose = Applet.newAudioClip(sound1.toURL());
//        sound_choose.play();

        //随机数字
        //Math.random(); //[0.0,1.0)
        //(int)(Math.random() * 10000) % 10; //[0-9]
        //(int)(Math.random() * 10000） % 10 + 5; //[5-14]
        //(int)(Math.random() * 10000) % 11 + 5; //[5-15]
        //推导出随机数字公式：a-b (int)(Math.random() * 10000) % (b - a + 1)

        //1.让双方选名字：（只需要让用户选择即可）
        System.out.print("请输入玩家名称：");
        String userName = input.next();
        String comName = "大蛇"; //电脑名称
        System.out.println(userName + "VS" + comName);
//        sound_choose.stop();
//        File sound1 = new File("sounds/拳皇98格斗开始.wav");
//        AudioClip sound_choose = Applet.newAudioClip(sound1.toURL());
//        sound_choose.play();
//        Thread.sleep(3000);




        //2.初始化双方的数据（体力值默认100）
        int hp1 = 100, hp2 = 100; //双方的hp
        int attack1 = 0, attack2 = 0; //双方的攻击力
        //3.使用循环模拟对战过程
        while (hp1 > 0 && hp2 >= 0){
            attack1 = (int)(Math.random() * 10000) % 11 + 5;

            attack2 = (int)(Math.random() * 10000) % 11 + 5;

            //让玩家先攻击
            hp2 -= attack1; //玩家攻击，电脑掉血
            //播放音乐代码

            //描述玩家状态
            if (attack1 >= 0 && attack1 <= 5){
                System.out.println(comName + "被重重的打了一拳");
            }//else if 后期可以自行完成

            //描述玩家技能过程
            System.out.println(comName + "打出了一记-百里八式 八酒杯，" +userName + "掉血" + attack2 + "滴");
            hp1 -= attack2;
            //播放音乐代码

            System.out.println(comName + "打出了一记-百里八式 八酒杯，" +userName + "掉血" + attack1 + "滴");
        }
        //4.打印最终结果
        System.out.println("OK!");
        System.out.println("玩家姓名\t血量");
        System.out.println(comName + "\t" + hp2);
        System.out.println(userName + "\t" + hp1);

        System.out.println("请输入任意键继续！");
        input.nextLine();
    }
}

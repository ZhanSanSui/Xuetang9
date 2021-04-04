package Chapter6.ConcubineDemo;

import javax.swing.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;
import java.time.Year;
import java.util.Calendar;
import java.util.Scanner;

/**
 * 后宫选妃第一弹
 * @author：Wen
 * @version：1.0
 * @date：2021/4/3 0:28
 * @copyright 老九学堂
 * @remark TODO
 */
public class AppMain {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        Scanner input = new Scanner(System.in);

        AudioClip sound = Applet.newAudioClip(new File("sounds/背景音乐.wav").toURL());

        /**
         * 存放当前娘娘的总数
         */
        int count = 5;

        /**
         * 游戏当前进行到了第几天
         */
        int gameDay = 0;

        /**
         * 游戏一共10天
         */
        final int DAY_COUNT = 10;

        /**
         * 用来存放用户的选择
         */
        int choice;

        /**
         * 临时变量，用来存放好感度低于60的个数
         */
        int tempCount;

        /**
         * 用来存放删除、查找时的索引
         */
        int index = -1;

        /**
         * 用来存放用户输入的姓名
         */
        String name;

        /**
         * 姓名数组，最多容纳6个字符串，每个字符串的最大长度为8个字符（英文）
         */
        String[] names = {"西施", "貂蝉", "王昭君", "杨玉环", "赵飞燕", ""};

        /**
         * 级别数组，最多容纳5个字符串，每个字符串最大长度为8个字符（英文）
         */
        String[] levelNames = {"贵人", "嫔妃", "贵妃", "皇贵妃", "皇后", ""};

        /**
         * 用来存放每个妃子的等级，与levelNames连用。用-1表示未启用
         */
        int level[] = {0, 2, 0, 0, 0, -1};

        /**
         * 用来存放每个妃子的好感度，-1表示未启用
         */
        int loves[] = {100, 100, 100, 100, 100, -1};

        do {
            sound.stop();
            sound = Applet.newAudioClip(new File("sounds/背景音乐.wav").toURL());
            sound.play();

            System.out.printf("第%d天：\n",++gameDay);
            String strMenu = "1、皇帝下旨选妃\n";
            strMenu += "2、翻牌宠幸\n";
            strMenu += "3、打入冷宫\n";
            strMenu += "4、朕的爱妃呢？\n";
            JOptionPane.showInputDialog(null, strMenu);

            for (int i = 0; i < strMenu.length(); i++) {
                System.out.print(strMenu.charAt(i));
                Thread.sleep(20); //休眠20毫秒
            }

            System.out.print("陛下请选择：");
            choice = input.nextInt();
            switch (choice){
                /**
                 * 新增妃子，其他人好感度-10
                 */
                case 1:
                    sound.stop();
                    sound = Applet.newAudioClip(new File("sounds/选妃.wav").toURL());
                    sound.play();
                    /**
                     * 首先判断数组长度是否可以增加元素
                     */
                    if (count >= level.length){
                        System.out.println("后宫人满为患，陛下还再等等吧！");
                        break;
                    }
                    System.out.println("爱江山更爱美人，万千佳丽一点红~");
                    System.out.print("娘娘名讳：");
                    name = input.next();

                    /**
                     * 将新增元素放在count处
                     */
                    names[count] = name;
                    level[count] = 0;
                    loves[count] = 100;
                    System.out.println("新增妃子，其他的好感度-10！");
                    for (int i = 0; i < count; i++) {
                        loves[i] -= 10;
                    }

                    count++;
                    break;
                /**
                 * 翻牌子宠幸，宠幸的妃子好感度+20，其他人-10
                 */
                case 2:
                    sound.stop();
                    sound = Applet.newAudioClip(new File("sounds/翻牌.wav").toURL());
                    sound.play();

                    System.out.print("陛下请输入要宠幸的姓名：");
                    name = input.next();
                    for (int i = 0; i < count; i++) {
                        if (name.equals(names[i])){
                            index = i;
                            continue;
                        }
                        loves[i] -= 10;
                    }
                    /**
                     * 没有找到
                     */
                    if (index == -1){
                        System.out.println("江山尚未统一，怎能儿女情长！");
                    }else {
                        loves[index] += 20;

                        /**
                         * 每临幸一次，级别提升1级，最高为4级
                         */
                        if (level[index] == 4){
                            level[index] = 4;
                        }else {
                            level[index]++;
                        }
                        System.out.println("**************************************");
                        System.out.printf("Duang~%s提升等级为：%s\n",names[index], levelNames[level[index]]);
                        System.out.println("**************************************");
                        System.out.println("憔悴容华怯对春，寂寥宫殿锁闭门，此身却羡宫中树，不失芳时雨露恩。");
                        System.out.println("所有娘娘的好感度-10");
                    }
                    index = -1;
                    break;

                /**
                 * 打入冷宫，执行删除操作，其他妃子好感度统一+10
                 */
                case 3:
                    sound.stop();
                    sound = Applet.newAudioClip(new File("sounds/冷宫.wav").toURL());
                    sound.play();

                    System.out.print("陛下要讲哪位娘娘打入冷宫：");
                    name = input.next();
                    for (int i = 0; i < count; i++) {
                        if (name.equals(names[i])){
                            index = i;
                            break;
                        }
                    }

                    /**
                     * 没找到要删除的姓名
                     */
                    if (index == -1){
                        System.out.println("虚惊一场，无人打入冷宫，该吃吃该喝喝~");
                        break;
                    }

                    /**
                     * 执行删除操作
                     */
                    for (int i = index; i < count; i++) {
                        names[i] = names[i + 1];
                        level[i] = level[i + 1];
                        loves[i] = loves[i + 1];
                    }
                    count--;//总人数-1
                    //变量用完重置为初始化，方便下次使用
                    index = 1;
                    System.out.printf("%s已被打入冷宫，人情冷暖，所有娘娘好感度+10!",name);

                    for (int i = 0; i < count; i++) {
                        loves[i] += 10;
                    }

                    index = -1;
                    break;

                /**
                 * 根据姓名查找，好感度+10
                 */
                case 4:
                    sound.stop();
                    sound = Applet.newAudioClip(new File("sounds/一笑倾城.wav").toURL());
                    sound.play();

                    System.out.print("请输入要查找的姓名：");
                    name = input.next();
                    for (int i = 0; i < count; i++) {
                        if (name.equals(names[i])){
                            System.out.printf("微微一笑很倾城，%s的好感度+10\n\n",name);
                            loves[i] += 10;
                            break;
                        }
                    }
                    break;
            }//end of switch
            System.out.println("姓名\t\t等级\t\t好感度");
            System.out.println("----------------------");
            for (int i = 0; i < count; i++) {
                System.out.printf("%s\t\t%s\t\t%d\n",names[i],levelNames[level[i]],loves[i]);
            }

            /**
             * 每天结算好感度，一旦有三个或三个以上的嫔妃好感度低于60，则发生暴乱，游戏结束
             */
            tempCount = 0;//临时变量，用来存放好感度低于60的个数
            for (int i = 0; i < count; i++) {
                if (loves[i] < 60){
                    tempCount++;
                }
            }
            if (tempCount >= 3){
                System.out.println("觉醒的嫔妃：姐妹们，组队刷皇上去了！");
                //时间函数的固定用法->日历类
                Calendar cal = Calendar.getInstance();
                System.out.printf("公元%d年%d月%d日，皇帝卒！共执政%d天\n",
                        cal.get(Calendar.YEAR),
                        cal.get(Calendar.MONTH) + 1,
                        cal.get(Calendar.DATE),
                        gameDay
                );
                System.exit(0);
            }
        }while (gameDay < DAY_COUNT);

        System.out.println("皇帝登基10天来，五谷丰登、风调雨顺、妻妾成群·······");
        System.out.println("没羞没臊的生活继续进行着········");
        System.out.println("姓名\t\t等级\t\t好感度");
        System.out.println("----------------------");
        for (int i = 0; i < count; i++) {
            System.out.printf("%s\t%s\t%d\n",names[i],levelNames[level[i]],loves[i]);
        }

    }
}

package Chapter6.ConcubineDemo;

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

/**
 * 后宫选妃第二弹->加入图形界面
 * @author：Wen
 * @version：1.0
 * @date：2021/4/3 19:41
 * @copyright 老九学堂
 * @remark TODO
 */
public class AppMainV2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /**
         * 待选嫔妃的姓名数组
         */
        String[] newNameArray = {"褒姒", "陈圆圆", "苏小小", "甄嬛", "钟无艳"};

        /**
         * 待选嫔妃的总数
         */
        int newNameCount = newNameArray.length;

        /**
         * 后宫娘娘的姓名数组，预留了5个空间
         */
        String[] nnNameArray = {"西施", "貂蝉", "王昭君", "杨玉环", "赵飞燕", "", "", "", "", ""};

        /**
         * 后宫娘娘的级别数组
         */
        String[] levelNames = {"贵人", "嫔妃", "贵妃", "皇贵妃", "皇后"};

        /**
         * 对应每个娘娘的级别
         */
        int[] level = new int[10];

        /**
         * 对应每个娘娘的好感度
         */
        int[] loves = new int[10];

        /**
         * 娘娘的初始数量为5
         */
        int nnCount = 5;

        /**
         * 游戏默认允许10天
         */
        int gameDays = 1;

        //设定默认好感度
        for (int i = 0; i < nnCount; i++) {
            loves[i] = 100;
        }

        //游戏的主界面
        JOptionPane.showMessageDialog(null,"陛下，您来啦","欢迎来到XXX后宫选妃游戏",0,new ImageIcon("images/title.jpg"));

        while (gameDays <= 10){
//            System.out.println("游戏进行到第" + gameDays + "天");
//            System.out.println("1、皇帝下旨选妃\t\t（增加）");
//            System.out.println("2、翻牌宠幸\t\t\t（修改状态）");
//            System.out.println("3、打入冷宫\t\t\t（删除）");
//            System.out.println("4、朕的爱妃呢？\t\t（查找、修改状态）");
//            System.out.print("陛下请选择：");
//            int choice = input.nextInt();

            String strMenu = "1、皇帝下旨选妃\n";
            strMenu += "2、翻牌宠幸\n";
            strMenu += "3、打入冷宫\n";
            strMenu += "4、朕的爱妃呢？\n";
            strMenu += "陛下请选择：";
            Object objResult = JOptionPane.showInputDialog(null,strMenu,"游戏进行到第" + gameDays + "天",0,
                    new ImageIcon("images/宝座.jpg"),
                    new String[]{"1", "2", "3", "4"},4);

            //判断用户选择取消的情况 - 目前省略

            /**
             * 将用户的选择（1-4之间的字符串）转换成整型
             */
            //int choice = Integer.parseInt(objResult.toString());
            switch (objResult.toString()){
                case "1"://1、皇帝下旨选妃（增加）
                    if (nnCount == nnNameArray.length){
                        System.out.println("皇帝陛下，后宫已经人满为患，皇帝家也没有米下锅了！");
                        break;
                    }

//                    System.out.print("请输入新进娘娘的名讳：");
//                    String  newName = input.next();

                    objResult = JOptionPane.showInputDialog(null, "请选择秀女", "选妃", 0,
                            new ImageIcon("images/timg.jpg"),
                            newNameArray,null
                    );

                    if (objResult == null){//用户选择了取消
                        continue; //大家可以自行测试下，break和continue在这里的区别
                    }

                    JOptionPane.showMessageDialog(null,objResult.toString(),"选中嫔妃",0, new ImageIcon("images/" + objResult.toString() + ".jpg"));

                    //增加：姓名、级别(默认为0,可不添加)、好感度
                    nnNameArray[nnCount] = objResult.toString();
                    loves[nnCount] = 100;

                    //其他娘娘的好感度-10
                    for (int i = 0; i < nnCount; i++) {
                        loves[i] -= 10;
                    }

                    nnCount++;
                    break;

                case "2"://2、翻牌宠幸（修改状态） 好感度+20，其他-10
//                    System.out.print("请输入娘娘的名讳：");
//                    String name = input.next();
                      objResult = JOptionPane.showInputDialog(null,"陛下请选择", "翻牌",0,
                              new ImageIcon("images/选妃翻牌.jpg"),
                              nnNameArray,null

                      );

                    if (objResult == null){
                        continue;
                    }

                    String name = objResult.toString();
                    //查找
                    int searchIndex = -1; //要查找字符串的下标
                    for (int i = 0; i < nnCount; i++) {
                        //姓名相等的情况
                        //字符串的比较 name.compareTo("abc") == 0;
                        if (name.compareTo(nnNameArray[i]) == 0){
                            searchIndex = i;
                            break;
                        }
                    }

                    if (searchIndex == -1){
                        System.out.println("陛下，不要活在梦中，要面对现实！");
                    }

                    //找到的情况：当前的好感度+20并升一级，其他人好感度-10
                    loves[searchIndex] += 20;

                    if (level[searchIndex] == levelNames.length - 1){
                        System.out.println(nnNameArray[searchIndex] + "娘娘已经母仪天下，升级失败！");
                        loves[searchIndex] += 10;
                        //break;
                    }else {
                        level[searchIndex]++;

                        for (int i = 0; i < nnCount; i++) {
                            if (i == searchIndex){
                                continue;
                            }
                            loves[i] -= 10;
                        }
                        //System.out.println("宠幸" + nnNameArray[searchIndex] + ",好感度+20,升级为" + levelNames[level[searchIndex]] + ",其他娘娘好感度-10");
                        JOptionPane.showMessageDialog(null,"宠幸" + nnNameArray[searchIndex] + ",好感度+20,升级为" + levelNames[level[searchIndex]] + ",其他娘娘好感度-10",
                                "翻牌的结果", 0, new ImageIcon("images/" + nnNameArray[searchIndex] + ".jpg"));
                    }

                    break;

                case "3"://3、打入冷宫（删除）

                case "4"://朕的爱妃呢？（查找、修改状态）
                default:
                    System.out.println("必须输入1-4之间的整数");
                    continue;
            }
//            System.out.println("姓名\t\t\t级别\t\t\t好感度");
//            for (int i = 0; i < nnCount; i++) {
//                System.out.println(nnNameArray[i] + "\t\t\t" + levelNames[level[i]] + "\t\t\t" + loves[i]);
//            }

            //如果有3个以上的妃子好感度都低于60，那么发生暴乱，游戏强制退出
            int count = 0;
            for (int i = 0; i < nnCount; i++) {
                if (loves[i] <= 60){
                    count++;
                }
            }
            String resultValue = "后宫有3个以上的娘娘好感度低于60,发生暴乱";
            resultValue += new Date().toLocaleString();
            if (count >= 3){
                JOptionPane.showMessageDialog(null,resultValue, "突发事件，发生暴乱",0, new ImageIcon("images/皇上被害.jpg"));
                System.exit(0);
            }

            //每日结算
            String value = "没羞没躁的生活又过了一天，后宫情况如下：\n";
            for (int i = 0; i < nnCount; i++) {
                value += String.format("%s   %s   %d\n",nnNameArray[i],levelNames[level[i]], loves[i]);
            }
            JOptionPane.showMessageDialog(null,value, "每日结算",0, new ImageIcon("images/嬉戏.jpg"));
            gameDays++;
        }
    }
}

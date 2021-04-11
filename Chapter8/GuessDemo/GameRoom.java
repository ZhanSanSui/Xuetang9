package Chapter8.GuessDemo;

import com.sun.deploy.security.SandboxSecurity;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;
import java.util.function.Supplier;

/**
 * 游戏房间
 * @author：Wen
 * @version：1.0
 * @date：2021/4/10 22:42
 * @copyright 老九学堂
 * @remark TODO
 */
public class GameRoom {
    //属性：记分牌(暂时不实现)、道具(暂时不实现)、参与游戏的玩家、房间号、房间名称、房间密码

    private HumanPlayer player1 = null;
    private ComPlayer player2 = null;
    /**
     * 房间ID
     */
    private int roomId;

    /**
     * 房间名称
     */
    private String roomName;

    /**
     * 房间密码
     */
    private String roomPass;

     public GameRoom(String rongName, String roomPass){
         if (!("蜡笔小新的".equals(rongName) && "1234".equals(roomPass))){
             System.out.println("房间密码错误，游戏强制退出！");
             return;
         }
         this.setRoomName(rongName);
         initGame();
         startGame();
         endGame();
     }

    //方法：开始游戏、初始化游戏、显示菜单、选择人物、判断输赢（可以在裁判类中）

    /**
     * 初始化游戏
     */
    public void initGame(){
        //1.实例化游戏玩家对象
        player1 = new HumanPlayer();
        player2 = new ComPlayer();
        //2.初始化游戏的其他属性
        //比如：游戏中的花花草草等，相当于加载过程
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n游戏加载成功");
    }

    /**
     * 开始游戏
     */
    public void startGame() {
        showMenu();
        choiceRole();
        gaming();
    }

    /**
     * 游戏中
     */
    public void gaming(){
        while (true){
            //双方出拳
            System.out.print(player1.getName() + "请出拳：");
            Scanner input = new Scanner(System.in);
            player1.setFist(input.nextInt());
            int fist1 = player1.getFist();
            player2.getFist();
            int fist2 = player2.getFist();
            //判断输赢 - 调用方法判断结果
            int result = judge(fist1,fist2);

            //如果返回-1，玩家1赢；返回0，打平；返回1，玩家2赢
            if (result == -1){
                System.out.println("【吉永老师】：" + player1.getName() + "赢了！");
                player1.sendMessage(HumanPlayer.MessageTypeWin);
                player2.sendMessage(ComPlayer.MessageTypeLose);
            }else if (result == 0){
                System.out.println("【吉永老师】：双方打平！");
                player1.sendMessage(HumanPlayer.MessageTypeFist);
                player2.sendMessage(ComPlayer.MessageTypeFist);
            }else {
                System.out.println("【吉永老师】：" + player2.getName() + "赢了！");
                player2.sendMessage(ComPlayer.MessageTypeWin);
                player1.sendMessage(HumanPlayer.MessageTypeLose);
            }
            //打印结束
            System.out.print("是否继续游戏？(y/n)");
            String answer = new Scanner(System.in).next();
            if (!"y".equalsIgnoreCase(answer)){
                break;
            }
        }
    }

    /**
     * 显示菜单
     */
    public void showMenu(){
        System.out.println("欢迎进入" + roomName + "游戏房间");
        System.out.println("出拳规则：1-剪刀；2-布；3-石头");

    }

    /**
     * 选择角色
     */
    public void choiceRole(){
        System.out.println("对方角色：1-风间；2-妮妮；3-正南；4-阿呆。。");
        System.out.print("请选择：");
        int choice = new Scanner(System.in).nextInt();
        String[] namesArray = {"风间", "妮妮", "正南", "阿呆"};
        player2.setName(namesArray[choice - 1]);
        player1.setName("野原新之助");
        System.out.println(player1.getName() + "\tVS\t" + player2.getName());
    }

    /**
     * 判断出拳
     * @return 输或赢
     */
    public int judge(int fist1, int fist2){
        if (fist1 == fist2){
            return 0;
        }
        if(fist1 == 1 && fist2 == 3 || fist1 ==2 && fist2 ==1 || fist1 == 3 && fist2 == 2){
            //玩家1胜利，分数+1，玩家2的分数-1
            player1.setScore(player1.getScore() + 1);
            player2.setScore(player2.getScore() - 1);
            return -1;
        }
        //玩家2胜利，分数+1，玩家1的分数-1
        player1.setScore(player1.getScore() - 1);
        player2.setScore(player2.getScore() + 1);
        return 1;
    }

    /**
     * 结束游戏-打印积分
     */
    public void endGame(){
        System.out.println(player1.getName() + "\t" + player2.getName());
        System.out.println(player1.getScore() + "\t\t\t" + player2.getScore());
        System.out.println("游戏已结束，欢迎下次再来！");
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomPass() {
        return roomPass;
    }

    public void setRoomPass(String roomPass) {
        this.roomPass = roomPass;
    }
}

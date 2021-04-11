package Chapter8.GuessDemo;

/**
 * 人类玩家
 * @author：Wen
 * @version：1.0
 * @date：2021/4/10 22:20
 * @copyright 老九学堂
 * @remark TODO
 */
public class HumanPlayer {
    /**
     * 静态常量：
     * 出拳类型的信息
     */
    public static final int MessageTypeFist = 1;
    /**
     * 静态常量：
     * 赢得比赛的信息
     */
    public static final int MessageTypeWin = 2;
    /**
     * 静态常量：
     * 输掉比赛的信息
     */
    public static final int MessageTypeLose = 3;

    //属性：名称、分数、所出的拳、角色对应的音效，角色个性化台词
    /**
     * 玩家的名称
     */
    private String name;
    private int score;
    private int fist;
    /**
     * 角色在出拳的时候，所说的个性化台词
     */
    private String[] fistWords = {
            "动感光波~biubiu~~~",
            "大象大象你的鼻子为什么这么长~~~",
            "必杀：露PP外星人",
            "大姐姐你喜欢吃青椒吗？",
            "胸部扁扁的欧巴桑，吃我一拳"
    };

    private String[] winWords = {
            "还有谁",
            "猜拳，有点意思~~",
            "超~~~~神",
            "全军出击~~~",
            "吃着火锅唱着歌，然后你就输了"
    };

    private String[] loseWords = {
            "通往成功的路总再施工中",
            "等到潮水退去，就知道谁在裸泳了",
            "夏天就是不好，穷的时候我连西北风都没喝",
            "将来我死了，吧QQ捐给希望工程",
            "众人皆醉我独醒，举世皆浊我独清"
    };

    //方法：设置和得到名称、分数、播放音效、说个性化台词、出拳

    /**
     * 根据传入的消息类型，随机打印对应类型的消息
     * @param messageType 对应HumanPlayer类中定义的静态常量
     */
    public void sendMessage(int messageType){
        //生成一个0-4之间的随机数字
        int index =((int)(Math.random() * 1000)) % 5;
        //要打印的消息
        String message = null;
        switch (messageType){
            case MessageTypeFist:
                message = fistWords[index];
                break;
            case MessageTypeWin:
                message = winWords[index];
                break;
            case MessageTypeLose:
                message = loseWords[index];
                break;
            default:
                break;
        }
        System.out.println(message);
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getFist() {
        return fist;
    }

    public void setFist(int fist) {
        this.fist = fist;
    }
}

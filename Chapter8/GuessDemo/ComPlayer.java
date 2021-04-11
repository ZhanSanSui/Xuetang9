package Chapter8.GuessDemo;

/**
 * 人类玩家
 * @author：Wen
 * @version：1.0
 * @date：2021/4/10 22:20
 * @copyright 老九学堂
 * @remark TODO
 */
public class ComPlayer {
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
     * 电脑的名称
     */
    private String name;
    private int score;
    private int fist;
    /**
     * 电脑在出拳的时候，所说的个性化台词
     */
    private String[] fistWords = {
            "必杀：摇摇晃晃真拳！",
            "像我这么帅的人就可以在床上赚钱！",
            "给你一记左勾拳！",
            "我叫你一声你敢答应吗？",
            "大王叫我来巡山咯！"
    };

    /**
     * 电脑赢得比赛的时候，所说的个性化台词
     */
    private String[] winWords = {
            "子曾经曰过：“Y挺的LJYOYO，一板砖呼死你Y的！！”",
            "真相只有一个，你已经死了!",
            "在这一刻" + name + "被灵魂附体，他不是一个人！！！",
            "抽，是一种生活艺术；找抽，是一种生活态度！！",
            "“刚和我朋友下棋，他把我帅吃了。”“你想表达什么?”“我帅死了”"
    };

    /**
     * 电脑输掉比赛的时候，所说的个性化台词
     */
    private String[] loseWords = {
            "等有一天我修成正果，把你们这些妖孽全收了",
            "人生最大的悲哀是青春不在,青春痘却还在",
            "别逼我 ，再逼我就装死给你看",
            "再牛逼百度咋搜索不到你呢?再牛逼你能憋住尿吗?",
            "我和超人的唯一区别就是：我把内裤穿在了里面",
            "众人皆醉我独醒，举世皆浊我独清。。。"
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
        //电脑的出拳实际上就是生成了1-3之间的随机数字
        fist = ((int)(Math.random() * 30000)) % 3 + 1;
        return fist;
    }

}

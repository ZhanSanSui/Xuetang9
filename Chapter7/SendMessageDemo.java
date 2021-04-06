package Chapter7;

import java.util.concurrent.TimeUnit;

/**
 * 使用方法模拟实现网络游戏中的世界喊话功能
 * 可选参数：喊话者、频道、喊话内容、喊话次数、喊话的时间间隔等
 * @author：Wen
 * @version：1.0
 * @date：2021/4/6 19:04
 * @copyright 老九学堂
 * @remark TODO
 */
public class SendMessageDemo {
    public static void main(String[] args) {
        SendMessage("王二狗","世界频道", "公会狩猎（40人团），有空的++", 5 ,1);
    }

    /**
     * 实现游戏中的喊话功能
     * @param name 喊话者
     * @param channelName 喊话频道
     * @param message 喊话内容
     * @param count 喊话次数
     * @param interval 喊话的时间间隔(单位：秒）
     */
    public static void SendMessage(String name, String channelName, String message, int count, int interval){
        if (interval < 5){
            interval = 5;
        }

        //喊话的总体逻辑：拼接字符串以后打印出来
        String value = String.format("【%s】 %s, %s",
                channelName,name,message);

        for (int i = 0; i < count; i++) {
            System.out.println(value);
            try { //休眠多少秒
                //Thread.sleep(interval * 1000);
                TimeUnit.SECONDS.sleep(interval);
                //TimeUnit.HOURS.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

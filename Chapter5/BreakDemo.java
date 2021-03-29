package Chapter5;

/**
 * 演示break的基本用法
 * @author：Wen
 * @version：1.0
 * @date：2021/3/29 16:16
 * @copyright 老九学堂
 * @remark TODO
 */
public class BreakDemo {
    public static void main(String[] args) {
        long count = 0;

        //1970-1-1到现在的毫秒数
        long startTime = System.currentTimeMillis();
        while (true){ //死循环
            if (count++ == Long.MAX_VALUE){ //最大值 + 1 = 最小值
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("循环已结束"  + count);
        System.out.println("循环用时：" + (endTime - startTime) + "毫秒！");
    }
}

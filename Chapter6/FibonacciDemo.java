package Chapter6;

/**
 * 斐波那契数列
 * @author：Wen
 * @version：1.0
 * @date：2021/3/30 22:41
 * @copyright 老九学堂
 * @remark TODO
 */
public class FibonacciDemo {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 21 34 55 89 144
        //规律：前两个元素值固定，第三个开始，是前两个元素之和
        int[] nums = new int[20];
        int sum = 0;
        double avg;
        //前两个元素值固定
        nums[0] = 0;
        nums[1] = 1;
        //第三个开始，是前两个元素之和
        for (int i = 2; i < nums.length; i++){
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        System.out.println("打印结果");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + ",");
            sum += nums[i];
        }
        System.out.println(); //打印换行
        System.out.println(sum / 1.0 / nums.length);
    }
}

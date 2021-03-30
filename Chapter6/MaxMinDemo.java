package Chapter6;

/**
 * 求数组中的最大值和最小值
 * @author：Wen
 * @version：1.0
 * @date：2021/3/30 22:47
 * @copyright 老九学堂
 * @remark TODO
 */
public class MaxMinDemo {
    public static void main(String[] args) {
        //随机生成一个数组，求里面的最大值和最小值
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++){
            nums[i] =((int)(Math.random() * 10000)) % 1001; //0-1000的随机数
        }
        System.out.println("数组元素：");
        for (int i = 0; i < nums.length; i++){
            System.out.print(nums[i] + "\t");
        }
        System.out.println();
        //求最大值和最小值
        //1.假设第一个元素是最大值/最小值
        //2.拿最大值/最小值在数组中逐个比较，如果某个元素比最大值还大/最小值还小，则该元素覆盖了假设的最大值/最小值
        int max = nums[0];
        int min = nums[0];

        //还可以换一种写法
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++){ //如果某个元素比最大值还大
            if (nums[i] > max){
                max = nums[i];
            }
            if (nums[i] < min){
                min = nums[i];
            }
        }


        System.out.println("数组中的最大值是：" + max);
        System.out.println("数组中的最小值是：" + min);
    }
}

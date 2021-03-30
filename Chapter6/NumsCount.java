package Chapter6;

/**
 * 定义一个整形数组，赋值后，求出奇数个数和偶数个数
 * @author：Wen
 * @version：1.0
 * @date：2021/3/30 22:57
 * @copyright 老九学堂
 * @remark TODO
 */
public class NumsCount {
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

        int count1 = 0;//奇数个数
        int count2 = 0;//偶数个数

        for(int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                count2++;
            }else {
                count1++;
            }
        }
        System.out.println("奇数个数为：" + count1);
        System.out.println("偶数个数为：" + count2);
    }
}

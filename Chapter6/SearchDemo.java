package Chapter6;

import java.util.Scanner;

/**
 * 重点：查找输入的数字在数组的下标，没有找到则下标为-1
 * @author：Wen
 * @version：1.0
 * @date：2021/3/30 23:01
 * @copyright 老九学堂
 * @remark TODO
 */
public class SearchDemo {
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

        //让用户输入要查找的数字
        //循环查找 ：遍历数组，查找对应的元素，如果找到了，打印下标；没找到，打印-1
        System.out.print("请输入要查找的元素：");
        int searchNum = new Scanner(System.in).nextInt();
        int searchIndex = -1; //套路：一般要找的下标初值为-1
        //遍历数组
        //方法一
//        for (int i = 0; i < nums.length; i++) {
//            if (searchNum == nums[i]){
//                //找到后，记录下要查找元素的下标
//                searchIndex = i;
//                break;
//            }
//        }

        //方法二,使用foreach简化数组的遍历
        for (int i : nums){
            if (searchNum == nums[i]){
                //找到后，记录下要查找元素的下标
                searchIndex = i;
                break;
            }
        }

        //在循环后进行判断
        if (searchIndex == -1) {
            System.out.println("很遗憾，没有找到这个元素！");
        }else {
            System.out.println("要查找的元素下标：" + searchIndex);
        }
    }
}
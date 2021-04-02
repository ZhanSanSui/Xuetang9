package Chapter6;

import java.util.Arrays;

/**
 * 冒泡排序算法、选择排序算法、Array.sort()方法
 * @author：Wen
 * @version：1.0
 * @date：2021/4/1 19:11
 * @copyright 老九学堂
 * @remark TODO
 */
public class SortDemo {
    public static void main(String[] args) {
        //1.一共会比较数组元素个数-1轮
        //2.每一轮，比较的次数比上一轮少1
        //3.如果前面一个数组大于/小于后面一个数字，那么交换

        final int N = 50000; //常量
        int[] nums1 = new int[N];
        int[] nums2 = new int[N];
        int[] nums3 = new int[N];
        for (int i = 0; i < nums1.length; i++){
            nums1[i] = (int)(Math.random() * 100000);
            nums2[i] = nums1[i];
            nums3[i] = nums1[i];
            //错误写法 num2 = num1；
        }

//        int[] nums = {45,33,55,90,21};

        long startTime = System.currentTimeMillis();

        //冒泡排序的核心算法
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = 0; j < nums1.length - i -1; j++) {
                if (nums1[j] > nums1[j + 1]) { //num[j] < nums[j + 1] 降序排列
                    int temp; //每一次循环都要产生临时变量，再销毁
                    temp = nums1[j];
                    nums1[j] = nums1[j + 1];
                    nums1[j + 1] = temp;
                }
            }
        }

        long endTime = System.currentTimeMillis();

        //打印结果
//        System.out.println("排序后：");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i]);
//            if ((i + 1) % 15 == 0){
//                System.out.println();
//            }else {
//                System.out.print(",");
//            }
//         }

        System.out.println("冒泡排序共耗时：" + (endTime - startTime) + "毫秒");

        startTime = System.currentTimeMillis();
        //选择排序的核心算法：每次循环，交换i的值和最小数的小标的值
        for (int i = 0; i < nums2.length; i++) {
            int min = nums2[i]; //假设第i个值是最小值
            int minIndex = i;
            //内循环就找最小值和最小值的下标
            for (int j = i + 1; j < nums2.length; j++) {
                if (min > nums2[j]){
                    min = nums2[j];
                    minIndex = j;
                }
            }
            //交换次数是固定的
            int temp = nums2[i];
            nums2[i] = nums2[minIndex];
            nums2[minIndex] = temp;
        }

        //打印结果
//        System.out.println("排序后：");
//        for (int i = 0; i < nums2.length; i++) {
//            System.out.print(nums2[i]);
//            if ((i + 1) % 15 == 0){
//                System.out.println();
//            }else {
//                System.out.print(",");
//            }
//         }

        endTime = System.currentTimeMillis();
        System.out.println("选择排序排序共耗时：" + (endTime - startTime) + "毫秒");


        startTime = System.currentTimeMillis();
        //快速排序：使用java.util.Arrays.sort()方法进行排序
        Arrays.sort(nums3);
        endTime = System.currentTimeMillis();
        System.out.println("Arrays.sort()方法排序共耗时：" + (endTime - startTime) + "毫秒");
        //怎么逆序Arrays.sort()方法进行排序->首尾交换
        for (int i = 0; i < nums3.length / 2; i++) {
            int temp = nums3[i];
            nums3[i] = nums3[nums3.length - i - 1];//结论
            nums3[nums3.length - i - 1] = temp;
        }
    }
}

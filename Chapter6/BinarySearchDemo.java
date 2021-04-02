package Chapter6;

import java.util.Scanner;

/**
 * 二分查找法：
 * 使用前提：数组已经按有序排列
 * @author：Wen
 * @version：1.0
 * @date：2021/4/2 22:59
 * @copyright 老九学堂
 * @remark TODO
 */
public class BinarySearchDemo {
    public static void main(String[] args) {
//      基本原理：首先将要查找的元素（key）与数组的中间元素比较
//      核心算法：
//      1.如果key小于中间元素，只需要在数组的前一半元素中继续查找key
//      2.如果key和中间元素相等，匹配成功，查找结束
//      3.如果key大于中间元素，只需要在数组的后一半元素中继续查找key
        Scanner input = new Scanner(System.in);
        int[] array = {2, 5, 8, 10, 15, 25, 35, 45, 55, 65, 75, 95};
        System.out.print("请输入要查找的数字：");
        int searchNum = input.nextInt();
        int deleteIndex = -1; // 要删除元素的下标
        int count = array.length; // 当前数组元素的总个数

        //普通查找
//        for (int i = 0; i < array.length; i++) {
//            if (searchNum == array[i]){
//                System.out.println("找到了！");
//            }
//        }

        boolean isFind = false; //是否找到
        int lowIndex = 0; //下界下标
        int highIndex = array.length - 1; //上界下标

        //不知道要查找多少次！
        while (highIndex >= lowIndex){
            //计算中点下标
            int midIndex = (highIndex + lowIndex) / 2;
            //核心算法：
            //1.如果key小于中间元素，只需要在数组的前一半元素中继续查找key
            if (searchNum < array[midIndex]){
                highIndex = midIndex - 1;
            //3.如果key大于中间元素，只需要在数组的后一半元素中继续查找key
            }else if(searchNum > array[midIndex]){
                lowIndex = midIndex + 1;
            }else {
                //如果key和中间元素相等，匹配成功，查找结束
                System.out.println("找到了，数字下标为：" + midIndex);
                isFind = true;
                deleteIndex = midIndex;
                break;
            }
        }
        if (!isFind || deleteIndex == -1){
            System.out.println("没有找到您输入的数字！");
            System.exit(0);
        }

//        删除算法：
//        1.找到要删除元素的下标
//        2.从要删除的下标开始，后面一个元素赋值给前面一个元素（覆盖）
//        3.数组总长度-1
        count--;
        for (int i = deleteIndex; i < count; i++) {
            array[i] = array[i + 1]; //数组下标越界
        }

        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}

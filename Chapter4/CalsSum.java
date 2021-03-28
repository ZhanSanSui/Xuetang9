package Chapter4;

import java.util.Scanner;

/**
 * 计算输入的整形数字中每位数字之和（重点）
 * @author：Wen
 * @version：1.0
 * @date：2021/3/28 18:29
 * @copyright 老九学堂
 * @remark TODO
 */
public class CalsSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数字，计算各位之和：");
        //1.得到要计算的整型数字
        int num = input.nextInt(); //要拆分计算的整型数字
        int tempNum = num; //临时变量
        //2.声明相关变量
        int i = 0;
        int sum = 0;
        //3.循环操作计算累加和
        while(tempNum > 0){
            sum += tempNum % 10; //每次循环累加个位
            tempNum /= 10; //去掉个位数字

        }
        //4.打印计算结果
        System.out.println(num + "的各位数字之和为：" + sum);
    }
}

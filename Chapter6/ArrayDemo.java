package Chapter6;

import java.util.Scanner;

/**
 * 要求用户动态录入5个学生的成绩，求平均成绩
 * @author：Wen
 * @version：1.0
 * @date：2021/3/30 22:34
 * @copyright 老九学堂
 * @remark TODO
 */
public class ArrayDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] scores = new double[5];
        double sum = 0,avg; //总成绩和平均成绩
        //scores.length 数组的长度
        for (int i = 0; i < scores.length; i++){
            System.out.print("请输入第" + (i + 1) + "位同学的成绩：");
            //将用户输入的double类型数字，赋值给数组中的第i个元素
            scores[i] = input.nextDouble();
        }

        //打印录入的元素
        for (int i = 0; i < scores.length; i++){
            sum += scores[i]; //累加
        }

        System.out.printf("%d位同学的平均成绩为：%.2f",scores.length,sum / scores.length);
    }
}

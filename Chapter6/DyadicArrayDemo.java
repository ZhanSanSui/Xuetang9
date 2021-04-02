package Chapter6;

import java.util.Scanner;

/**
 * 二维数组的动态赋值
 * @author：Wen
 * @version：1.0
 * @date：2021/4/2 23:43
 * @copyright 老九学堂
 * @remark TODO
 */
public class DyadicArrayDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] stuName = {"刘备", "关羽", "张飞"};
        String[] courseName = {"语文", "数学", "英语"};

        final int ROW = stuName.length;
        final int COL = courseName.length;

        double[][] scores = new double[ROW][COL];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print(stuName[i] + "的" + courseName[j] + "成绩：");
                scores[i][j] = input.nextDouble();
            }
        }

        System.out.print("\t语文\t\t\t数学\t\t\t英语");

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                if (j % 3 == 0) {
                    System.out.println();
                } else {
                    System.out.print("\t");
                }
                System.out.print(stuName[i] + scores[i][j] + "\t");
            }
        }
    }
}

package Chapter5;

/**
 * 双循环
 * @author：Wen
 * @version：1.0
 * @date：2021/3/29 21:40
 * @copyright 老九学堂
 * @remark TODO
 */
public class DoubleFor {
    public static void main(String[] args) {
        //行、列 - 双循环
        //外层循环控制行，内层循环控制列

//        //外层循环控制行：控制行数、控制换行
//        for (int i = 0; i < 5; i++){
//            //内层循环控制列：控制列数、控制列打印的符号！
//            for (int j = 0; j < 5; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //打印图形-题1
        //每行里面先打印空格，再打印*
//        for (int i = 0; i < 4; i++){
//            //一般用i来表示j的最大值
//            for (int j = 0; j <= 2 - i; j++){
//                System.out.print(" ");
//            }
//            //打印完空格之后，再打印*
//            for (int j = 0; j <= 2 * i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 3; i++){
//            //一般用i来表示j的最大值
//            for (int j = 0; j <= i; j++){
//                System.out.print(" ");
//            }
//            //打印完空格之后，再打印*
//            for (int j = 0; j <= 4 - 2 * i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //打印图形-题2
//        char ch = 'A';
//        for (int i = 0; i < 4; i++){
//            //一般用i来表示j的最大值
//            for (int j = 0; j <= 2 - i; j++){
//                System.out.print(" ");
//            }
//            //打印完空格之后，再打印A
//            for (int j = 0; j <= 2 * i; j++){
//                System.out.print((char)ch);
//            }
//            ch++;
//            System.out.println();
//        }
//
//        for (int i = 0; i < 3; i++){
//            //一般用i来表示j的最大值
//            for (int j = 0; j <= i; j++){
//                System.out.print(" ");
//            }
//            //打印完空格之后，再打印A
//            for (int j = 0; j <= 4 - 2 * i; j++){
//                System.out.print((char)ch);
//            }
//            ch++;
//            System.out.println();
//        }

        //打印图形-题3
//        for (int i = 0; i < 4; i++){
//            //一般用i来表示j的最大值
//            for (int j = 0; j <= 2 - i; j++){
//                System.out.print(" ");
//            }
//            //打印完空格之后，再打印*
//            for (int j = 0; j <= 2 * i; j++){
//                if (j == 0 || j == 2 * i){ //j是最大值或最小值打印*
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < 3; i++){
//            //一般用i来表示j的最大值
//            for (int j = 0; j <= i; j++){
//                System.out.print(" ");
//            }
//            //打印完空格之后，再打印*
//            for (int j = 0; j <= 4 - 2 * i; j++){
//                if (j == 0 || j == 4 - 2 * i){ //j是最大值或最小值打印*
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

        //还需要再进阶->打印幂次方
//        int a = 1;
//        for (int i = 0; i < 9; i++){
//            //一般用i来表示j的最大值
//            for (int j = 0; j <= 16 - 2 * i; j++){
//                System.out.print(" ");
//            }
//            //打印完空格之后，再打印*
//            for (int j = 0; j <= 2 * i ; j++){
//                System.out.printf("%2d",a);
//            }
//            System.out.println();
//        }

    }
}

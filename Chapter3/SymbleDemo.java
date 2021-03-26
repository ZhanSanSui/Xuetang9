package Chapter3;

/**
 * 运算符案例
 * @author：Wen
 * @version：1.0
 * @date：2021/3/26 20:45
 * @copyright 老九学堂
 * @remark TODO
 */
public class SymbleDemo {
    public static void main(String[] agrs){
        //定义两个变量
        int num1 = 5, num2 = 2;

        //定义4个整型变量用来存放计算机结果
        int result1 = num1 / num2; //除法
        int result2 = num1 % num2; //取模
        int result3 = num1++; //后置++
        int result4 = --num2; //前置--

        //打印计算结果
        System.out.println("num1 / num2 = " + result1);
        System.out.println("num1 % num2 = " + result2);
        System.out.println("num1++ = " + result3);
        System.out.println("--num2 = " + result4);
    }
}

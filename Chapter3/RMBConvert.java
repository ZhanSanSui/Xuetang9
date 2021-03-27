package Chapter3;

import java.util.Scanner;

/**
 * 将给定的钱数分成较小的货币单位
 * @author：Wen
 * @version：1.0
 * @date：2021/3/26 21:00
 * @copyright 老九学堂
 * @remark TODO
 */
public class RMBConvert {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入double类型的金额：");
        double RMB = input.nextDouble();

        //处理元部分：
        int Dollar = (int)RMB;
        int tenDollar = Dollar / 10;
        int fiveDollar = Dollar % 10 / 5;
        int oneDollar =  Dollar% 10 - 5;

        //处理角部分
        int Cents = ((int)(RMB * 10)) % 10;
        int fiveCents = Cents / 5;
        int oneCents = Cents - 5;
        System.out.println("十元纸币：" + tenDollar + "张");
        System.out.println("五元纸币：" + fiveDollar+ "张");
        System.out.println("一元纸币/硬币：" + oneDollar + "张/枚");
        System.out.println("五角纸币/硬币：" + fiveCents + "张/枚");
        System.out.println("一角纸币/硬币：" + oneCents + "张/枚");

    }
}

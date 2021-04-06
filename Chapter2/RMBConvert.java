package Chapter2;

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
        //过程拆解（思路整理）
        //用户输入钱的数量
        //如果要求我们使用心算的方式，将钱数进行分解，是怎样的过程？
        //应该从大到小去兑换纸币（10元->5元->2元->1元）

        //1.接收用户输入的钱数
        Scanner input = new Scanner(System.in);
        System.out.print("请输入double类型的金额：");
        double RMB = input.nextDouble();

        //2.由于需要分别计算小数点两边的数字，所以定义两个变量保存小数点两边的数字
        //处理元部分：
        int Dollar = (int)RMB; //通过强制类型转换，获取到小数点的左侧部分
        int tenDollar = Dollar / 10;
        int fiveDollar = Dollar % 10 / 5;
        int oneDollar =  Dollar% 10 - 5;

        //处理角部分
        //1.任何整数 % 10  => 取出数字的个位
        //2.任何整数 % 100 => 取出数字的最后两位
        int Cents = ((int)(RMB * 10)) % 10;
        int fiveCents = Cents / 5;
        int oneCents = Cents - 5;
        System.out.println("十元纸币：" + tenDollar + "张");
        System.out.println("五元纸币：" + fiveDollar+ "张");
        System.out.println("一元纸币/硬币：" + oneDollar + "张/枚");
        System.out.println("五角纸币/硬币：" + fiveCents + "张/枚");
        System.out.println("一角纸币/硬币：" + oneCents + "张/枚");

        //升级版
        //计算元部分
        System.out.println("十元纸币数量：" + (Dollar / 10 == 0 ? 0 : Dollar / 10) + "张");
        Dollar %= 10;
        System.out.println("五元纸币数量：" + Dollar / 5 + "张");
        Dollar %= 5;
        System.out.println("五元纸币数量：" + Dollar + "张");

        //计算小数部分
        System.out.println("五角纸币/硬币：" + Cents / 5 + "张/枚");
        Cents -= 5;
        System.out.println("一角纸币/硬币：" + Cents + "张/枚");
    }
}

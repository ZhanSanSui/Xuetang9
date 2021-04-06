package Chapter7;

import java.util.Scanner;

/**
 * 16进制和10进制之间的转换
 * @author：Wen
 * @version：1.0
 * @date：2021/4/6 19:18
 * @copyright 老九学堂
 * @remark TODO
 */
public class HexToDecimalDemo {
    public static void main(String[] args) {
        //1.让用户输入一个10进制数字
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整型数字");
        int decNum = input.nextInt();
        //2.调用方法10进制转换为16进制
        //3.再将16进制数字转换为10进制
    }

    /**
     * 2.调用方法10进制转换为16进制
     * @param decNum 要转换的10进制数字
     * @return 转换成16进制的数字（以字符串的方式返回）
     */
    public static String hexToDec(int decNum){
        //反取余数
        String hex = ""; // 转换好的16进制字符串
        while (decNum != 0){
            int temp = decNum % 16; //取余数

            //余数有可能是0-9之间的数字或10-15之间的数字
            if (temp >= 0 && temp <= 9){
                hex = temp + hex; //每取一个余数，就往前拼接
            }else if(temp >= 10 && temp <= 15){

            }
        }


        return hex;
    }


}

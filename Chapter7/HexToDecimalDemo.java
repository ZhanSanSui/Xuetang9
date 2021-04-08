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
        System.out.print("请输入一个整型数字:");
        int decNum = input.nextInt();
        //2.调用方法10进制转换为16进制
        System.out.println(decToHex(decNum));
        //3.再将16进制数字转换为10进制
        System.out.println(hexToDec(decToHex(decNum)));
    }

    /**
     * 十六进制转换为十进制
     * @param hex
     * @return
     */
    public static int hexToDec(String hex){
        int decNum = 0;
        //遍历16进制字符串
        //规律：如果数组中首元素下标为i，那么最后一个元素的下标为：length - i - 1
        for (int i = 0; i < hex.length(); i++) {
            char tempChar = hex.charAt(i);
            //两种情况
            if (tempChar >= '0' && tempChar <= 9) {
                decNum += (tempChar - '0') * Math.pow(16, hex.length() - i - 1);

            }else if(tempChar >= 'A' && tempChar <= 'F'){
                decNum += (tempChar - 'A' + 10) * Math.pow(16, hex.length() - i - 1);
            }
        }
        return decNum;
    }

    /**
     * 2.调用方法10进制转换为16进制
     * @param decNum 要转换的10进制数字
     * @return 转换成16进制的数字（以字符串的方式返回）
     */
    public static String decToHex(int decNum){
        //反取余数
        // 转换好的16进制字符串
        String hex = "";
        while (decNum != 0){
            //取余数
            int temp = decNum % 16;

            //余数有可能是0-9之间的数字或10-15之间的数字
            if (temp >= 0 && temp <= 9){
                //每取一个余数，就往前拼接
                hex = temp + hex;
            }else if(temp >= 10 && temp <= 15){
                hex = (char)(temp -10 + 'A') + hex;

            }
            //卸磨杀驴
            decNum /= 16;
        }
        return hex;
    }

}

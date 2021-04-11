package Chapter8.StringDemo;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 * 字符串实例
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 15:35
 * @copyright 老九学堂
 * @remark TODO
 */
public class StringDemo {
    /**
     * 判断传入的字符串是否是一个正确格式的小数
     * 判断字符串中只能有一个小数点，小数点不能在第一位，也不能在最后一位
     * @param str
     * @return
     */
    public static boolean isDecimal(String str){
        //1.判断字符串中的每个元素必须是数字或小数点
        boolean isDecimal = true;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                if (str.charAt(i) == '.'){
                    //如果当前字符不是数字并且也不是小数点，那么证明是非法字符，返回false
                    if (i == 0 || i == str.length() - 1){
                        isDecimal = false;
                        break;
                    }
                }else {
                    //如果当前字符不是数字并且也不是小数点，那么证明是非法字符，返回false
                    isDecimal = false;
                    break;
                }
            }
        }
        //判断字符串中只能有一个小数点
        //1.存在小数点
        //2.从前搜索的小标和从后往前搜索的下标刚好相等
        if (str.contains(".") && str.indexOf(".") == str.lastIndexOf(".")){
            return false;
        }
        //2.如果有小数点，那么小数点不能在第一位和最后一位，并且只能有一个小数点
//        if (str.indexOf('.') == 0 || str.indexOf(".") == str.length() - 1){
//
//        }
        return isDecimal;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
//        String str = "中国航母np";
//        //str += "老牛鼻子了！"; 相当于调用了value.concat()方法，会直接返回一个新的字符串对象空间
//        //拼接字符串
//        str = str.concat("老牛鼻子了！");
//        System.out.println(str);
//
//        //龚小京这个字符串就被存放在了字符串池中
//        String 刘强东老婆 = "龚小京";
//        //奶茶妹妹也是在字符串池中
//        刘强东老婆 = "奶茶妹妹";
//
//        //new String("奶茶妹妹@小强东");
//        刘强东老婆 = 刘强东老婆.concat("@小强东");
//
//        System.out.println(刘强东老婆);
//
//        String 刘强东前妻 = "龚小京";

        //演示常用的集中String对象的构建方式

//        String str1 = "你好，世界！";
//        //使用默认构造 String str2 = "";
//        String str2 = new String();
//
//        String str3 = new String(str1);
//        /**
//         * C中：字符数组和字符串的区别就在于最后一个元素是否为\0
//         */
//        char[] chArray = {'a', 'b', 'c'};
//        //将字符数组转换成String对象
//        String str4 = new String(chArray);
//        //将转换的String对象再转换回char型数组
//        chArray = str4.toCharArray();
//
//        System.out.println(str4);
//
//        //字节数组与字符串的转换
//        //byte : -128~127
//        byte[] byteArray = {104, 108, 108, 101, 111};
//        String str5 = new String(byteArray);
//        System.out.println(str5);
//
//        //字符串转码
//        String str6 = new String(str1.getBytes(),"UTF-8");
//        System.out.println(str6);

          //trim 方法：去掉字符串左右两侧的空格
          //建议：在用户输入用户名后使用
//        Scanner input = new Scanner(System.in);
//        System.out.println("请输入用户名：");
//        String uName = input.nextLine().trim();
//        System.out.println("--" + uName + "--");

//        System.out.println("abc".equals("abc"));
//        //逐个字符去比ASCII码
//        System.out.println("abc".compareTo("abc"));
//
//        System.out.println("abc".startsWith("ab"));
//        System.out.println("abcdefg".endsWith("fg"));
//
//        System.out.println("abcdefg".contains("de"));

    //indexOf方法
        Scanner input = new Scanner(System.in);
        String password = "123456abc";
        //System.out.println(password.indexOf('3'));
    //问题：判断字符串中只能有一个小数点，小数点不能在第一位，也不能在最后一位



    //substring [beginIndex， endIndex)
        System.out.println(password.substring(1, 3));
        System.out.println(password.substring(3));
    }
}

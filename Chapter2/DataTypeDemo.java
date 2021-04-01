package Chapter2;

import java.math.BigDecimal;

/**
 * 数据类型示例
 * @author：Wen
 * @version：1.0
 * @date：2021/4/1 19:52
 * @copyright 老九学堂
 * @remark TODO
 */
public class DataTypeDemo {
    public static void main(String[] args) {
      //整型：占4个字节，共32位，31个1(二进制) 最大值：Integer(java的工具类)
      // 整型的最大值->常量方式，一般会采用全班的大写的英文
        int max = Integer.MAX_VALUE;
//        int max1 = 2147483648; //编译错误 out of range(越界)

        int max2 = 2147483647 + 1; //变为最小值

        int min = Integer.MIN_VALUE;

        //说明：
        //1.赋值符号的运算顺序是从右向左
        //2.在Java中，一个整数常量，默认是int类型
        long max3 = 2147483648l; //右侧数字最后添加L后，表示长整型的常量(字面量)

        long max4 = 2147483647; //右侧并没有添加l，仍然是int类型->自动类型转换

        float num1 = 33; //自动类型转换：33整型可以自动转换为float类型

        float num2 = 3.14f; //在Java中，一个小数常量，默认是double类型

        //强制类型转换：大类型转小类型时
        //类型不匹配->需要强转
        int num4 = (int)36.56; //在要转换的数字前添加(数据类型名)

        //强制类型转换有缺点：会损失精度->带钱的千万别用
        //高精度：BigDecimal

    }
}

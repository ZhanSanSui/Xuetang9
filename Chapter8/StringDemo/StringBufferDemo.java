package Chapter8.StringDemo;

/**
 * 加强版字符串 - 带缓存的字符串
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 22:03
 * @copyright 老九学堂
 * @remark TODO
 */
public class StringBufferDemo {
    public static void main(String[] args) {
//        String str1 = "a";
//        String str2 = "b";
//        String str3 = str1 + str2;
//
//        //底层实现：
//        String str4 = new StringBuffer(String.valueOf(str1)).append(str2).toString();


        StringBuffer strBuffer1 = new StringBuffer("你好！成都！");
        StringBuffer strBuffer2 = new StringBuffer("你好！成都！");
        StringBuffer strBuffer3 = new StringBuffer("你好！成都！");

        System.out.println(strBuffer1.toString().equals(strBuffer2));

        strBuffer1.append('a');
        strBuffer1.append(123L);

        //反转
        System.out.println(strBuffer1.reverse());

        //在规定的下标处插入元素
        strBuffer2.insert(3,"abc");
        System.out.println(strBuffer2);

        //在规定的下标处删除元素
        strBuffer3.deleteCharAt(3);
        System.out.println(strBuffer3);

        //删除[2,4)下标之间的元素
        strBuffer3.delete(2, 4);
        System.out.println(strBuffer3);

        //在规定下标处之间插入元素
        strBuffer2.replace(2,4,"北京");
        System.out.println(strBuffer2);

        strBuffer1.setCharAt(3, '神');
        System.out.println(strBuffer1);

        //返回缓存大小
        System.out.println("缓存大小：" + strBuffer1.capacity());

        //相当于清空了字符串对象
        strBuffer1.setLength(0);

        //缓冲区
        strBuffer1.trimToSize();


//        final  int N = 500000;
//
//        long startTime = System.currentTimeMillis();
//        String str = "*";
//        for (int i = 0; i < N; i++) {
//            str += "*";
//        }
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("+=用时:" + (endTime - startTime));
//
//        //使用StringBuffer进行字符串拼接
//        startTime = System.currentTimeMillis();
//        StringBuffer str1 = new StringBuffer("*");
//        endTime = System.currentTimeMillis();
//        for (int i = 0; i < N; i++) {
//            str1.append("*");
//        }
//        System.out.println("StringBuffer用时:" + (endTime - startTime));
//
//        //StringBuilder
//        startTime = System.currentTimeMillis();
//        StringBuilder str2 = new StringBuilder("*");
//        endTime = System.currentTimeMillis();
//        for (int i = 0; i < N; i++) {
//            str2.append("*");
//        }
//        System.out.println("StringBuilder用时:" + (endTime - startTime));
    }
}

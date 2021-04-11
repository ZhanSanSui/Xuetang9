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

        final  int N = 500000;

        long startTime = System.currentTimeMillis();
        String str = "*";
        for (int i = 0; i < N; i++) {
            str += "*";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("+=用时:" + (endTime - startTime));

        //使用StringBuffer进行字符串拼接
        startTime = System.currentTimeMillis();
        StringBuffer str1 = new StringBuffer("*");
        endTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            str1.append("*");
        }
        System.out.println("StringBuffer用时:" + (endTime - startTime));

        //StringBuilder
        startTime = System.currentTimeMillis();
        StringBuilder str2 = new StringBuilder("*");
        endTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            str2.append("*");
        }
        System.out.println("StringBuilder用时:" + (endTime - startTime));
    }
}

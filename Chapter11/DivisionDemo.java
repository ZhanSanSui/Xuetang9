package Chapter11;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 16:58
 * @copyright 老九学堂
 * @remark TODO
 */
public class DivisionDemo {
    /**
     * 计算两个字符串数字的除法（需要类型转换）
     * @param strNum1
     * @param strNum2
     * @throws Exception
     */
    public static void division(String strNum1, String strNum2) throws Exception{
        int num1 = Integer.parseInt(strNum1);
        int num2 = Integer.parseInt(strNum2);
        int result = num1 / num2;
        System.out.println("result = " + result);
    }

    public static void main(String[] args) {
        try {
            //谁调用，谁处理
            division("123","abc");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("程序结束！");
    }
}

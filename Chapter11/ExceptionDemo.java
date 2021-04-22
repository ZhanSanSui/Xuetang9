package Chapter11;

/**
 * 异常处理
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 15:13
 * @copyright 老九学堂
 * @remark TODO
 */
public class ExceptionDemo {
    /**
     * 计算两个数字相除的商
     * @param num1
     * @param num2
     * @return
     */
    public static int division(int num1, int num2){
        System.out.println("计算除法前：");
        int result = Integer.MAX_VALUE;
        try{
            result = num1 / num2;
        }catch (Exception e){
            System.err.println("异常信息：" + e.getMessage());
        }
        System.out.println("计算除法后：");
        return result;
    }

    public static void main(String[] args) {
        int result = division(5, 0);
        System.out.println("result = " + result);
    }
}

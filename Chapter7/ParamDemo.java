package Chapter7;

/**
 * 不定长度的参数的传递
 * @author：Wen
 * @version：1.0
 * @date：2021/4/8 20:47
 * @copyright 老九学堂
 * @remark TODO
 */
public class ParamDemo {
    public static void main(String[] args) {
        paramTest("参数测试",1,2,3,4);
    }


    /**
     *
     * @param str
     * @param nums 默认传递一个长度为0的整型数组
     */
    public static void paramTest(String str, int... nums){
        System.out.println("第一个参数：" + str);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

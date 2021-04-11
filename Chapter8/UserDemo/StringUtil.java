package Chapter8.UserDemo;

/**
 * 字符串的工具类，封装了常用字符串的判断方法
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 21:27
 * @copyright 老九学堂
 * @remark TODO
 */
public class StringUtil {

    /**
     * 判断传入的用么字符串是否是合法的用户名
     * 用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊符号
     * @param userName
     * @return
     */
    public boolean isCorrectUserName(String userName){
        boolean isCorrect = true;

        if (userName == null){
            return  false;
        }

        if (userName.length() > 25){
            return false;
        }

        char[] unValidChar = {' ', '\'', '"', '?', '<', '>', ','};
        for (char ch: unValidChar) {
            if (userName.contains(Character.toString(ch))){
                isCorrect = false;
                break;
            }
        }
        return isCorrect;
    }

    /**
     * 密码6-18位，只能包含字母、数字、特殊符号（下划线、@、#、$、!）
     * 纯数字、纯字母时，密码强度都是弱 （★★☆☆☆☆）
     * 数字+密码、数字+符号、数字+字母，强度为中（★★★★☆☆）
     * 同时存在三种字符，强度为强（★★★★★★）
     * @param passWord
     * @return
     */
    public static String validatePassWord(String passWord){
        /**
         * 密码的强度
         * 如果返回值为空，那么密码验证失败，成功则返回密码强度
         */
        String power = "";
        if (passWord == null){
            return power;
        }

        if (passWord.length() < 6 || passWord.length() > 18){
            return power;
        }

        //String[] correctPart = {"_", "@", "#", "$", "!"};
        String part = "_@#$!";
        for (int i = 0; i < passWord.length(); i++) {
            if (Character.isLetterOrDigit(passWord.charAt(i))){
                //如果不是字母或数字，并且也不是合法的特殊符号，就证明是非法的格式
                if (part.contains(Character.toString(passWord.charAt(i)))){
                    return power;
                }
            }
        }

        //判断密码强度
        if (isDigit(passWord) || isLetter(passWord)){
            power = "★★☆☆☆☆";
        }else if(isDigitAndLetter(passWord)){
            power = "★★★★☆☆";
        }else if(isContainsSymble(passWord)){
            power = "★★★★★★";
        }

        return power;
    }


    /**
     * 字符串中保护的合法的字母和数字
     * @param value
     * @return
     */
    private static boolean isDigitAndLetter(String value){
        for (int i = 0; i < value.length(); i++) {
            if (Character.isLetterOrDigit(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断一个字符串是不是一个纯数字
     * @param value
     * @return
     */
    private static boolean isDigit(String value){
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断一个字符串是不是纯字母组成的
     * @param value
     * @return
     */
    private static boolean isLetter(String value){
        for (int i = 0; i < value.length(); i++) {
            if (Character.isLetter(value.charAt(i))){
                return false;
            }
        }
        return true;
    }

    /**
     * 判断字符串中是否一合法的特殊符号
      * @param value
     * @return
     */
    private static boolean isContainsSymble(String value){
        String part = "_@#$!";
        for (int i = 0; i < value.length(); i++) {
            if (part.contains(Character.toString(value.charAt(i)))){
                return true;
            }
        }
        return false;
    }

//   3、用户输入正确的email必须
//   包含@符号，且只能包含一个@和.
// 	 符号不能在开头，也不能在结尾

}

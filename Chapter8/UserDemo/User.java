package Chapter8.UserDemo;

/**
 * 实现用户注册功能
 * 	1、用户名最多25个字符长度、不能包含空格、单双引号、问号等特殊符号
 * 	2、密码6-18位，只能包含字母、数字、特殊符号（下划线、@、#、$、!）
 * 	纯数字、纯字母时，密码强度都是弱 （★★☆☆☆☆）
 * 	数字+密码、数字+符号、数字+字母，强度为中（★★★★☆☆）
 * 	同时存在三种字符，强度为强（★★★★★★）
 * 	3、用户输入正确的email必须
 * 	包含@符号，且只能包含一个@和.
 * 	符号不能在开头，也不能在结尾
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 21:22
 * @copyright 老九学堂
 * @remark TODO
 */
public class User {
    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户密码
     */
    private String passWord;

    /**
     * 用户邮箱
     */
    private String email;

    public User(){
        super();
    }

    public User(String userName, String passWord, String email){
        setUserName(userName);
        setPassWord(passWord);
        setEmail(email);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

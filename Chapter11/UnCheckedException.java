package Chapter11;

/**
 * 免检异常 - RuntimeException和Error
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 16:20
 * @copyright 老九学堂
 * @remark TODO
 */
public class UnCheckedException {
    public static void main(String[] args) {
        //String value = null;
        //System.out.println(value.toString());

//        String strValue = "123";
//        int value = Integer.parseInt(strValue);
//        System.out.println(value);

        Person p  = new Person();
        Student student = (Student)p;

    }
}

class Person {

}

class Student extends Person{

}
package Chapter9.RPGDemo;

/**
 * 英雄的测试类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 8:07
 * @copyright 老九学堂
 * @remark TODO
 */
public class HeroTest {
    public static void main(String[] args) {
        //左侧声明了一个Hero类型的变量，右侧是在堆内存中分配了空间，地址赋值给韩信
//        Hero 韩信 = new Warrior("韩信", 500);
//        System.out.println(韩信.getNickName());
//        韩信.move();

        //韩信的类型是什么？ - 父类类型



//        Warrior 曹操1 = new Warrior("曹操",1500);
//        Warrior 曹操2 = new Warrior("曹操",1500);
        //万物皆对象，Object - 所有类都默认继承了Object父类
//        System.out.println(曹操1 == 曹操2);
//        System.out.println(曹操1.equals(曹操2));
//
//        System.out.println(曹操1);

        Master 貂蝉 = new Master("貂蝉");
        貂蝉.biubiubiu();

        System.out.println(貂蝉);

    }
}

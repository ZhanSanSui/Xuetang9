package Chapter8.Role;

import Chapter8.Role.Role;

/**
 * 对Role的实例化
 * @author：Wen
 * @version：1.0
 * @date：2021/4/9 10:23
 * @copyright 老九学堂
 * @remark TODO
 */
public class RoleTest {
    public static void main(String[] args) {
        //实例化
//        Role role1 = new Role();
//        //在Java虚拟机分配的地址，不能真正的内存地址
//        //System.out.println(role1);
//        role1.name = "劳拉";
//        role1.level = 25;
//        role1.job = "摸金校尉";
//        role1.sendSkill();
//        role1.show();
//
//        //空指针异常，没有空间
//        //再声明对象的情况，一定要给空间
//        Role role2 = null;
////        role2.job = "神仙";
//        role2 = new Role();
//        role2.name = "孙悟空";
//        role2.level = 99;
//        role2.job = "神仙";
//        role2.sendSkill();
//        role2.show();
//
//        Role role3 = new Role();
//        role3.name = "至尊宝";
//        role3.sendSkill();
//        role3.show();


        Role role1 = new Role("侯亮平", 50 ,"检察官");
        role1.show();




    }
}

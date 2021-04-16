package Chapter9.RPGDemo;

/**
 * 对象数组的排序示例
 * @author：Wen
 * @version：1.0
 * @date：2021/4/15 10:01
 * @copyright 老九学堂
 * @remark TODO
 */
public class ObjectArraySortDemo {

    public static void sort(Hero[] heroArray){
        /**
         * 用来交换的英雄对象
         */
        Hero tempHero = null;
        for (int i = 0; i < heroArray.length; i++) {
            for (int j = 0; j < heroArray.length - i - 1; j++) {
                if (heroArray[j].compareToByName(heroArray[j + 1]) < 0){
                    tempHero = heroArray[j];
                    heroArray[j] =heroArray[j + 1];
                    heroArray[j + 1] = tempHero;
                }
            }
        }
    }


    public static void main(String[] args) {
        Warrior warrior1 = new Warrior();
        Warrior warrior2 = new Warrior();
        Warrior warrior3 = new Warrior();
        Warrior warrior4 = new Warrior();
        Warrior warrior5 = new Warrior();

        Master master1 = new Master();
        Master master2 = new Master();
        Master master3 = new Master();
        Master master4 = new Master();
        Master master5 = new Master();

        Hero[] heroArray = {
                warrior1, warrior2, warrior3, warrior4, warrior5,
                master1, master2, master3, master4, master5
        };

        System.out.println("排序前：");
        System.out.println("级别\t\t昵称\tmaxLife\t\tlife\t攻击力");
        for (Hero hero: heroArray) {
            System.out.println(hero);
        }

        sort(heroArray);

        System.out.println("排序后：");
        System.out.println("级别\t\t昵称\tmaxLife\t\tlife\t攻击力");
        for (Hero hero: heroArray) {
            System.out.println(hero);
        }
    }
}

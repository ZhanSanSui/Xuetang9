package Chapter4;

import java.util.Scanner;

/**
 * 使用do-while
 * @author：Wen
 * @version：1.0
 * @date：2021/3/28 20:12
 * @copyright 老九学堂
 * @remark TODO
 */
public class MyWuxiaWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = null;
        char choice = 0;
        String answer = "y"; //用户输入的是否继续

        do {
            System.out.println("欢迎进入老九武侠世界，请大侠起个响当当的名号闯荡江湖吧：");
            name = input.nextLine();
            System.out.println("头衔：【初入江湖】");
            System.out.println("名号：" + name);
            System.out.println(name + "大侠，满意您的江湖名号吗？（y/n）" + choice);
            choice = input.next().charAt(0);
        }while (choice == 'n');

        //1.!answer.equals("y")
        //2.!answer.equalsIgnoreCase("y"); //忽略大小写
        //3.建议写法：!"y".equalsIgnoreCase(answer)

        System.out.println(name + "大侠重出江湖，宵小之辈速速退避！");
    }
}

package Chapter11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 必检异常(会直接报错) - 除了RuntimeException和Error
 * @author：Wen
 * @version：1.0
 * @date：2021/4/22 16:21
 * @copyright 老九学堂
 * @remark TODO
 */
public class CheckedException {
    public static void main(String[] args) {



        File file = new File("e:/test.txt");
        //写入文件
        try {
            FileWriter fileWriter = new FileWriter(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //判断这个文件是否存在
        System.out.println(file.exists());
    }
}

package Chapter10.PrintDemo;

import Chapter10.PrintDemo.Impl.A4PaperImpl;
import Chapter10.PrintDemo.Impl.B5PaperImpl;
import Chapter10.PrintDemo.Impl.ColorInkBoxImpl;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 14:43
 * @copyright 老九学堂
 * @remark TODO
 */
public class PrintTest {
    public static void main(String[] args) {
        Printer printer = new Printer();


        //为打印机安装纸张和墨盒
        printer.setInkBox(new ColorInkBoxImpl());
        //printer.setPaper(new A4PaperImpl());
        printer.setPaper(new B5PaperImpl());

        printer.print("测试内容");
    }
}

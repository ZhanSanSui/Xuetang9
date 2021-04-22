package Chapter10.PrintDemo;

import Chapter10.PrintDemo.Iface.IInkBox;
import Chapter10.PrintDemo.Iface.IPaper;

/**
 * 打印机类 - 使用标准的墨盒和纸张进行打印
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 14:38
 * @copyright 老九学堂
 * @remark TODO
 */
public class Printer {
    /**
     * 打印机中的墨盒
     */
    private IInkBox inkBox = null;
    /**
     * 打印机中的纸张
     */
    private IPaper paper = null;

    /**
     * 打印机的打印方法 - 使用墨盒和纸张
     */
    public void print(String content){
        if (null == inkBox || null == paper){
            System.out.println("墨盒和纸张出现错误，请安装正确后重试！");
            return;
        }
        //打印过程
        String color = inkBox.getColor();
        String type = paper.getSize();
        System.out.println("以下文字是" + color + "颜色的！");
        System.out.println("使用纸张：" + type);
        System.out.println("打印内容：" + content);
    }

    public IInkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(IInkBox inkBox) {
        this.inkBox = inkBox;
    }

    public IPaper getPaper() {
        return paper;
    }

    public void setPaper(IPaper paper) {
        this.paper = paper;
    }
}

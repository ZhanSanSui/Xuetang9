package Chapter6.ConcubineDemo;

import javax.swing.*;

/**
 * 对话框示例
 * @author：Wen
 * @version：1.0
 * @date：2021/4/3 19:24
 * @copyright 老九学堂
 * @remark TODO
 */
public class DialogDemo {
    public static void main(String[] args) {
        /**
         * Java的选项面板类
         * 参数1：对话框的父窗体，参数2：对话框提示信息
         */
 //       JOptionPane.showMessageDialog(null,"提示信息！");

        /**
         * 参数3：对话框的标题信息，参数4：对话框的消息类型
         */
        //JOptionPane.showMessageDialog(null,"今天你吃了？","嘘寒问暖",JOptionPane.WARNING_MESSAGE);
        /**
         * 参数5：对话框中显示的图片对象，只需要填一个路径进去
         */
        //JOptionPane.showMessageDialog(null,"今天你吃了？","嘘寒问暖",JOptionPane.WARNING_MESSAGE, new ImageIcon("images/timg.jpg"));

//        JOptionPane.showInputDialog(null,"吃了吗？", "标题",0,new ImageIcon("images/timg.jpg"),
//                new String[]{"1.吃了","2.管你P事"},
//                "默认值");

        JOptionPane.showConfirmDialog(null,"到底去不去吃饭！");

    }
}

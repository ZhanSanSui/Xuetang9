package Chapter8.ProductDemo;

import javax.swing.*;

/**
 * 商品管理类
 * @author：Wen
 * @version：1.0
 * @date：2021/4/11 15:07
 * @copyright 老九学堂
 * @remark TODO
 */
public class ProductBiz {
    public static void main(String[] args) {
        /**
         * 用来保存每种商品的总量
         */
        int[] counts = new int[3];

        /**
         * 最终要支付的总金额
         */
        double total = 0;

        //改进方案:使用对象数组
        Product[] products = new Product[3];

        for (int i = 0; i < counts.length; i++) {
            //局部变量-循环结束，就没了
            //Product product = new Product();
            if (products[i] == null){
                products[i] = new Product();
            }
            //对象数组中的元素使用之前，一定要记得分配空间
            //products[i] = new Product();
            String name = JOptionPane.showInputDialog("请输入商品名称：");
            products[i].setName(name);
            //接收用户输入的商品单价，要注意，返回值是字符串类型
            String strPrice = JOptionPane.showInputDialog("请输入商品的单价：");
            //需要将字符串类型转换为double类型，再进行赋值
            //转换之前最好进行正确性验证，避免异常
            products[i].setPrice(Double.parseDouble(strPrice));
            String  strCount = JOptionPane.showInputDialog("请输入购买的数量：");
            counts[i] = Integer.parseInt(strCount);

            //累加总金额
            total += products[i].getPrice() * counts[i];
        }
        System.out.println("购物结算：");

        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getName() + "\t" + products[i].getPrice());
        }

        System.out.println("商品总金额为：" + total);
    }
}

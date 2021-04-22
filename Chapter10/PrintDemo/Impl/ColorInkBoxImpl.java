package Chapter10.PrintDemo.Impl;

import Chapter10.PrintDemo.Iface.IInkBox;

/**
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 14:44
 * @copyright 老九学堂
 * @remark TODO
 */
public class ColorInkBoxImpl implements IInkBox {


    @Override
    public String getColor() {
        return "红色";
    }
}

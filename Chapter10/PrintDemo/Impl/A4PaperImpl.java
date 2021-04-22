package Chapter10.PrintDemo.Impl;

import Chapter10.PrintDemo.Iface.IPaper;

/**
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 14:45
 * @copyright 老九学堂
 * @remark TODO
 */
public class A4PaperImpl implements IPaper {
    @Override
    public String getSize() {
        return "A4";
    }
}

package Chapter10.PrintDemo.Impl;

import Chapter10.PrintDemo.Iface.IPaper;

/**
 * TODO
 *
 * @author：Wen
 * @version：1.0
 * @date：2021/4/16 14:46
 * @copyright 老九学堂
 * @remark TODO
 */
public class B5PaperImpl implements IPaper {
    @Override
    public String getSize() {
        return "B5";
    }
}

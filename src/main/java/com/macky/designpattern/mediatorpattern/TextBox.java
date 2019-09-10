package com.macky.designpattern.mediatorpattern;

/**
 * @author Macky
 * @Title class TextBox
 * @Description: TODO
 * @date 2019/9/10 11:39
 */
public class TextBox extends Component {
    @Override
    public void update() {
        System.out.println("客户信息增加成功后文本框清空。");
    }

    public void setText() {
        System.out.println("文本框显示：小龙女。");
    }
}

package com.macky.designpattern.mediatorpattern;

/**
 * @author Macky
 * @Title class Label
 * @Description: TODO
 * @date 2019/9/10 13:55
 */
public class Label extends Component {
    @Override
    public void update() {
        System.out.println("文本标签内容改变，客户信息总数加1。");
    }
}

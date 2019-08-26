package com.macky.designpattern.decoratorparttern;

/**
 * @author Macky
 * @Title class TextBox
 * @Description: 文本框构件
 * @date 2019/8/26 10:11
 */
public class TextBox extends Component {
    @Override
    public void display() {
        System.out.println("显示文本框组件！");
    }
}

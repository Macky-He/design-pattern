package com.macky.designpattern.decoratorparttern;

/**
 * @author Macky
 * @Title class Window
 * @Description: 窗体构件
 * @date 2019/8/26 10:10
 */
public class Window extends Component {
    @Override
    public void display() {
        System.out.println("显示窗体组件！");
    }
}

package com.macky.designpattern.decoratorparttern;

/**
 * @author Macky
 * @Title class BlackBorderDecorator
 * @Description: 黑色边框具体装饰类
 * @date 2019/8/26 10:15
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    //装饰方法
    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框！");
    }
}

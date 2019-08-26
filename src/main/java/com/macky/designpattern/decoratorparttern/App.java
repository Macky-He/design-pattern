package com.macky.designpattern.decoratorparttern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/26 10:56
 */
public class App {
    public static void main(String[] args) {
        Component component, componentSB;
        component = new Window();
        componentSB = new BlackBorderDecorator(component);
        componentSB.display();
    }
}

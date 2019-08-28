package com.macky.designpattern.decoratorparttern.practice;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/26 20:10
 */
public class App {

    public static void main(String[] args) {
        new DesDecorator(new Base64()).encrypt();
    }
}

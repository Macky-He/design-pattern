package com.macky.designpattern.decoratorparttern.practice;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/26 20:10
 */
public class App {

    public static void main(String[] args) {
        Encrypt encrypt,encrypt1,encrypt2;
        encrypt = new Base64();
        encrypt1 = new DesDecorator(encrypt);
        encrypt1.encrypt();
    }
}

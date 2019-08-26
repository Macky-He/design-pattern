package com.macky.designpattern.decoratorparttern.practice;

/**
 * @author Macky
 * @Title class Base64
 * @Description: TODO
 * @date 2019/8/26 18:34
 */
public class Base64 extends Encrypt {
    @Override
    public void encrypt() {
        System.out.println("Base64加密！！！");
    }
}

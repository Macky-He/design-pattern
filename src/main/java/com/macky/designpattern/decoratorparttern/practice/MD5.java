package com.macky.designpattern.decoratorparttern.practice;

/**
 * @author Macky
 * @Title class MD5
 * @Description: TODO
 * @date 2019/8/26 18:19
 */
public class MD5 extends Encrypt {
    @Override
    public void encrypt() {
        System.out.println("MD5加密！！！");
    }
}

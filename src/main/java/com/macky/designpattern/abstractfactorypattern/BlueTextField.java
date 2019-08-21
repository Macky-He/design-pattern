package com.macky.designpattern.abstractfactorypattern;

/**
 * @author Macky
 * @Title class BlueTextField
 * @Description: TODO
 * @date 2019/8/19 10:45
 */
public class BlueTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示蓝色边框文本框！");
    }
}

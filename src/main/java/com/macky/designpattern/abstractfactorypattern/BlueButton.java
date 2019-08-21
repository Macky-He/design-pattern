package com.macky.designpattern.abstractfactorypattern;

/**
 * @author Macky
 * @Title class BlueButton
 * @Description: TODO
 * @date 2019/8/19 10:43
 */
public class BlueButton implements Button {
    @Override
    public void display() {
        System.out.println("显示蓝色按钮！");
    }
}

package com.macky.designpattern.abstractfactorypattern;

/**
 * @author Macky
 * @Title class SpringButton
 * @Description: TODO
 * @date 2019/8/19 10:42
 */
public class SpringButton implements Button{
    @Override
    public void display() {
        System.out.println("显示浅绿色按钮！");
    }
}

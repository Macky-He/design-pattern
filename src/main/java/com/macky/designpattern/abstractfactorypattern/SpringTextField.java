package com.macky.designpattern.abstractfactorypattern;

/**
 * @author Macky
 * @Title class SpringTextField
 * @Description: TODO
 * @date 2019/8/19 10:44
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示浅绿色边框文本框！");
    }
}

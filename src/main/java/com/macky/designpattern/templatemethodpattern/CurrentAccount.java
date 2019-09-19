package com.macky.designpattern.templatemethodpattern;

/**
 * @author Macky
 * @Title class CurrentAccount
 * @Description: TODO
 * @date 2019/9/19 17:00
 */
public class CurrentAccount extends Account {
    @Override
    public void read() {
        System.out.println("按照活期利率计算利息！");
    }
}

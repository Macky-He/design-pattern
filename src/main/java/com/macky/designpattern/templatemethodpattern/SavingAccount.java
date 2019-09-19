package com.macky.designpattern.templatemethodpattern;

/**
 * @author Macky
 * @Title class SavingAccount
 * @Description: TODO
 * @date 2019/9/19 17:00
 */
public class SavingAccount extends Account {
    @Override
    public void read() {
        System.out.println("按照定期利率计算利息！");
    }
}

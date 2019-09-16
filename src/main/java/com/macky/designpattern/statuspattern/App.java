package com.macky.designpattern.statuspattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/9/16 11:25
 */
public class App {
    public static void main(String args[]) {
        Account acc = new Account("段誉",0.0);
        acc.deposit(1000);
        acc.withdraw(2000);
        acc.deposit(3000);
        acc.withdraw(4000);
        acc.withdraw(1000);
        acc.computeInterest();
    }
}

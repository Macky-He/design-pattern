package com.macky.designpattern.templatemethodpattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/9/19 17:01
 */
public class App {
    public static void main(String[] args) {
        Account account;
        account = new CurrentAccount();
        account.Handle("张无忌","123456");
    }
}

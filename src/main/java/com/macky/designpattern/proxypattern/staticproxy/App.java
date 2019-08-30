package com.macky.designpattern.proxypattern.staticproxy;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/30 16:33
 */
public class App {
    public static void main(String[] args) {
        UserDaoProxy userDaoProxy = new UserDaoProxy(new UserDaoImpl());
        userDaoProxy.save();
    }
}

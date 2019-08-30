package com.macky.designpattern.proxypattern.cglibproxy;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/30 19:18
 */
public class App {
    public static void main(String[] args) {
        //目标对象
        UserDao target = new UserDao();
        //代理对象
        UserDao instance = (UserDao) new ProxyFactory(target).getInstance();
        //执行代理对象的方法
        instance.save();
    }
}

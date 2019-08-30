package com.macky.designpattern.proxypattern.dynamicproxy;

import com.macky.designpattern.proxypattern.staticproxy.IUserDao;
import com.macky.designpattern.proxypattern.staticproxy.UserDaoImpl;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/30 16:59
 */
public class App {
    public static void main(String[] args) {
        IUserDao proxyInstance = (IUserDao) new ProxyFactory(new UserDaoImpl()).getProxyInstance();
        proxyInstance.save();
    }
}

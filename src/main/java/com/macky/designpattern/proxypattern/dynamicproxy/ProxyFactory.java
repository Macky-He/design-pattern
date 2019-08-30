package com.macky.designpattern.proxypattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Macky
 * @Title class ProxyFactory
 * @Description: TODO
 * @date 2019/8/30 16:52
 */
public class ProxyFactory {
    private Object target;
    public ProxyFactory(Object target){
        this.target = target;
    }
    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("开始事务2");
            //执行目标对象方法
            Object returnValue = method.invoke(target, args);
            System.out.println("提交事务2");
            return returnValue;
        });
    }
}

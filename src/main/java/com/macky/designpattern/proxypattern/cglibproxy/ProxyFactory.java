package com.macky.designpattern.proxypattern.cglibproxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author Macky
 * @Title class ProxyFactory
 * @Description: TODO
 * @date 2019/8/30 19:13
 */
public class ProxyFactory implements MethodInterceptor {
    private Object proxy;

    public ProxyFactory(Object proxy) {
        this.proxy = proxy;
    }

    public Object getInstance() {
        //1.工具类
        Enhancer enhancer = new Enhancer();
        //2.设置父类
        enhancer.setSuperclass(proxy.getClass());
        //3.设置回调函数
        enhancer.setCallback(this);
        //4.创建子类（代理对象）
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始事务...");
        //执行目标对象的方法
        Object returnValue = method.invoke(proxy, objects);
        System.out.println("提交事务...");
        return returnValue;
    }
}

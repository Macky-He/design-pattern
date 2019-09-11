package com.macky.designpattern.observerpattern;

/**
 * @author Macky
 * @Title class Observer
 * @Description: TODO
 * @date 2019/9/11 20:46
 */
public interface Observer {
    public String getName();
    public void setName(String name);
    public void help(); //声明支援盟友方法
    public void beAttacked(AllyControlCenter acc); //声明遭受攻击方法
}

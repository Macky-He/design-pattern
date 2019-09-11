package com.macky.designpattern.observerpattern;

/**
 * @author Macky
 * @Title class Player
 * @Description: TODO
 * @date 2019/9/11 20:47
 */
public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    //支援盟友方法的实现
    @Override
    public void help() {
        System.out.println("坚持住，" + this.name + "来救你！");
    }

    //遭受攻击方法的实现，当遭受攻击时将调用战队控制中心类的通知方法notifyObserver()来通知盟友
    @Override
    public void beAttacked(AllyControlCenter acc) {
        System.out.println(this.name + "被攻击！");
        acc.notifyObserver(name);
    }
}

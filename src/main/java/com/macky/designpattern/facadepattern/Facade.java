package com.macky.designpattern.facadepattern;

/**
 * @author Macky
 * @Title class Facade
 * @Description: 单例
 * @date 2019/8/27 21:09
 */
public class Facade {
    private Light light;
    private Heater heater;
    private TV tV;

    public Facade(){
        light = new Light();
        heater = new Heater();
        tV = new TV();
    }
    public void open() {
        light.open();
        heater.open();
        tV.open();
    }
}

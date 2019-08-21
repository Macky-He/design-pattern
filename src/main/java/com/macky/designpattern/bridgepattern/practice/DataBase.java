package com.macky.designpattern.bridgepattern.practice;

/**
 * @author Macky
 * @Title class DataBase
 * @Description: TODO
 * @date 2019/8/21 14:41
 */
public abstract class DataBase {
    protected Data data;

    public void setData(Data data){
        this.data = data;
    }
    public abstract void connect();
}

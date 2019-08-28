package com.macky.designpattern.flyweightpattern;

/**
 * @author Macky
 * @Title class IgoChessman
 * @Description: TODO
 * @date 2019/8/28 17:47
 */
public abstract class IgoChessman {
    public abstract String getColor();

    public void display(Coordinates coords) {
        System.out.println("棋子颜色为：" + getColor() + ",棋子位置为：" + coords.getX() + "," + coords.getY());
    }
}

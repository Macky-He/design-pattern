package com.macky.designpattern.strategypattern;

/**
 * @author Macky
 * @Title class Discount
 * @Description: 折扣类：抽象策略类
 * @date 2019/9/20 15:58
 */
public interface Discount {
    public double calculate(double price);
}

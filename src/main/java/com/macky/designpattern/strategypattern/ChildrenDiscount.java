package com.macky.designpattern.strategypattern;

/**
 * @author Macky
 * @Title class ChildrenDiscount
 * @Description: 儿童票折扣类：具体策略类
 * @date 2019/9/20 15:59
 */
public class ChildrenDiscount implements Discount{
    @Override
    public double calculate(double price) {
        System.out.println("儿童票：");
        return price - 10;
    }
}

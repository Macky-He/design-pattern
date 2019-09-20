package com.macky.designpattern.strategypattern;

/**
 * @author Macky
 * @Title class StudentDiscount
 * @Description: 学生票折扣类：具体策略类
 * @date 2019/9/20 15:58
 */
public class StudentDiscount implements Discount {
    @Override
    public double calculate(double price) {
        System.out.println("学生票：");
        return price * 0.8;

    }
}

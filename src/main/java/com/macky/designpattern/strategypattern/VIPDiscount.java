package com.macky.designpattern.strategypattern;

/**
 * @author Macky
 * @Title class VIPDiscount
 * @Description: TODO
 * @date 2019/9/20 16:01
 */
public class VIPDiscount  implements Discount{
    @Override
    public double calculate(double price) {
        System.out.println("VIP票：");
        System.out.println("增加积分！");
        return price * 0.5;
    }
}

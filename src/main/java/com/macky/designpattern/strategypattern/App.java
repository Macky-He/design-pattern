package com.macky.designpattern.strategypattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/9/20 16:01
 */
public class App {

    public static void main(String[] args) {
        MovieTicket mt = new MovieTicket();
        double originalPrice = 60.0;
        double currentPrice;

        mt.setPrice(originalPrice);
        System.out.println("原始价为：" + originalPrice);
        System.out.println("---------------------------------");

        Discount discount;
        discount = new StudentDiscount();
        mt.setDiscount(discount); //注入折扣对象

        currentPrice = mt.getPrice();
        System.out.println("折后价为：" + currentPrice);

    }
}

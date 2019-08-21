package com.macky.designpattern.simplefactorypattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/17 16:21
 */
public class App {

    public static void main(String[] args) {
        Chart chart = null;
        chart = ChartFactory.getChart("pie");
        chart.display();

        
    }
}

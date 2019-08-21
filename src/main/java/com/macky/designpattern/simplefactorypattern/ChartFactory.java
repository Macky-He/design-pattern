package com.macky.designpattern.simplefactorypattern;

/**
 * @author Macky
 * @Title class ChartFactory
 * @Description: 静态工厂方法模式，创建模式
 * @date 2019/8/17 16:19
 */
public class ChartFactory {

    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        }
        return chart;
    }
}

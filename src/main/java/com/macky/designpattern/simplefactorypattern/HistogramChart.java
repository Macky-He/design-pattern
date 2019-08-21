package com.macky.designpattern.simplefactorypattern;

/**
 * @author Macky
 * @Title class HistogramChart
 * @Description: TODO
 * @date 2019/8/17 16:16
 */
public class HistogramChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示柱状图！");
    }

    public HistogramChart() {
        System.out.println("创建柱状图！");
    }
}

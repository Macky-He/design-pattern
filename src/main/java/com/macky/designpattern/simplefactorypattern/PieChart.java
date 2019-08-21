package com.macky.designpattern.simplefactorypattern;

/**
 * @author Macky
 * @Title class PieChart
 * @Description: TODO
 * @date 2019/8/17 16:18
 */
public class PieChart implements Chart {
    @Override
    public void display() {
        System.out.println("显示饼状图！");
    }

    public PieChart(){
        System.out.println("创建饼状图！");
    }
}

package com.macky.designpattern.visitorpattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Macky
 * @Title class FullTimeEmployee
 * @Description: 全职职工类
 * @date 2019/9/20 10:56
 */
@Data
@AllArgsConstructor
public class FullTimeEmployee implements Employee {
    private String name;
    private double weeklyWage;
    private int workTime;
    @Override
    public void accept(Department department) {
        department.visit(this);
    }
}

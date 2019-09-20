package com.macky.designpattern.visitorpattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Macky
 * @Title class PartTimeEmployee
 * @Description: 兼职职工类
 * @date 2019/9/20 10:56
 */
@Data
@AllArgsConstructor
public class PartTimeEmployee implements Employee{
    private String name;
    private double hourWage;
    private int workTime;

    @Override
    public void accept(Department department) {
        department.visit(this);
    }
}

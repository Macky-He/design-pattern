package com.macky.designpattern.visitorpattern;

/**
 * @author Macky
 * @Title class Employee
 * @Description: 员工类：抽象元素类
 * @date 2019/9/20 10:52
 */
public interface Employee {
    void accept(Department department);
}

package com.macky.designpattern.visitorpattern;

import java.util.ArrayList;

/**
 * @author Macky
 * @Title class EmployeeList
 * @Description: 员工列表类
 * @date 2019/9/20 14:34
 */
public class EmployeeList {
    //定义一个集合用于存储员工对象
    private ArrayList<Employee> list = new ArrayList<Employee>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    //遍历访问员工集合中的每一个员工对象
    public void accept(Department handler) {
        for (Object obj : list) {
            ((Employee) obj).accept(handler);
        }
    }
}

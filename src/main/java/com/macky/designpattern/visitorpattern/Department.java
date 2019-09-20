package com.macky.designpattern.visitorpattern;

/**
 * @author Macky
 * @Title class Department
 * @Description: 部门类:抽象访问者类
 * @date 2019/9/20 10:53
 */
public abstract class Department {
    public abstract void visit(FullTimeEmployee fullTimeEmployee);
    public abstract void visit(PartTimeEmployee partTimeEmployee);
}

package com.macky.designpattern.statuspattern;

/**
 * @author Macky
 * @Title class AccountState
 * @Description: 抽象状态类
 * @date 2019/9/16 11:16
 */
public abstract class BaseAccountState {
    protected Account acc;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}

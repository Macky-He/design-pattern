package com.macky.designpattern.statuspattern;

/**
 * @author Macky
 * @Title class NormalState
 * @Description: 正常状态
 * @date 2019/9/16 11:19
 */
public class NormalState extends BaseAccountState{
    public NormalState(Account acc) {
        this.acc = acc;
    }

    public NormalState(BaseAccountState state) {
        this.acc = state.acc;
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    @Override
    public void computeInterest()
    {
        System.out.println("正常状态，无须支付利息！");
    }

    //状态转换
    @Override
    public void stateCheck() {
        if (acc.getBalance() > -2000 && acc.getBalance() <= 0) {
            acc.setState(new OverdraftState(this));
        }
        else if (acc.getBalance() == -2000) {
            acc.setState(new RestrictedState(this));
        }
        else if (acc.getBalance() < -2000) {
            System.out.println("操作受限！");
        }
    }
}

package com.macky.designpattern.statuspattern;

/**
 * @author Macky
 * @Title class RestrictedState
 * @Description: TODO
 * @date 2019/9/16 11:23
 */
class RestrictedState extends BaseAccountState {
    public RestrictedState(BaseAccountState state) {
        this.acc = state.acc;
    }

    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("帐号受限，取款失败");
    }

    @Override
    public void computeInterest() {
        System.out.println("计算利息！");
    }

    //状态转换
    @Override
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        } else if (acc.getBalance() > -2000) {
            acc.setState(new OverdraftState(this));
        }
    }
}
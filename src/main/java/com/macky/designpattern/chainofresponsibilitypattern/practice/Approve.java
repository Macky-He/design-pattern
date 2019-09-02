package com.macky.designpattern.chainofresponsibilitypattern.practice;

/**
 * @author Macky
 * @Title class Approve
 * @Description: TODO
 * @date 2019/9/2 16:48
 */
public abstract class Approve {
    protected Approve approve;
    protected String name;

    public Approve(String name) {
        this.name = name;
    }

    public void setApprove(Approve approve) {
        this.approve = approve;
    }

    public abstract void request(LeaveRequest request);
}

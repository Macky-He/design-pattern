package com.macky.designpattern.chainofresponsibilitypattern.practice;

/**
 * @author Macky
 * @Title class ManagerApprove
 * @Description: TODO
 * @date 2019/9/2 17:10
 */
public class ManagerApprove extends Approve {
    public ManagerApprove(String name) {
        super(name);
    }

    @Override
    public void request(LeaveRequest request) {
        if (request.getNumber() < 10) {
            System.out.println(request.getName() + "审批通过，请假" + request.getNumber() + "天");
        } else {
            this.approve.request(request);
        }
    }
}

package com.macky.designpattern.chainofresponsibilitypattern.practice;

/**
 * @author Macky
 * @Title class DirectorApprove
 * @Description: TODO
 * @date 2019/9/2 16:58
 */
public class DirectorApprove extends Approve {
    public DirectorApprove(String name) {
        super(name);
    }

    @Override
    public void request(LeaveRequest request) {
        if (request.getNumber() < 3) {
            System.out.println(request.getName() + "审批通过，请假" + request.getNumber() + "天");
        } else {
            this.approve.request(request);
        }
    }
}

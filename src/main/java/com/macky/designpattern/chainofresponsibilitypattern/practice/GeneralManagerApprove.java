package com.macky.designpattern.chainofresponsibilitypattern.practice;

/**
 * @author Macky
 * @Title class GeneralManagerApprove
 * @Description: TODO
 * @date 2019/9/2 17:12
 */
public class GeneralManagerApprove extends Approve {
    public GeneralManagerApprove(String name) {
        super(name);
    }

    @Override
    public void request(LeaveRequest request) {
        if (request.getNumber()<30){
            System.out.println(request.getName() + "审批通过，请假" + request.getNumber() + "天");
        }else {
            System.out.println("拒绝请假！！！");
        }
    }
}

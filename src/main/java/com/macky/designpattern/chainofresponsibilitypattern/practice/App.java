package com.macky.designpattern.chainofresponsibilitypattern.practice;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/9/2 17:13
 */
public class App {

    public static void main(String[] args) {
        Approve approve1,approve2,approve3,approve4;
        approve1 = new DirectorApprove("主任");
        approve2 = new ManagerApprove("经理");
        approve3 = new GeneralManagerApprove("总经理");
        //创建责任链
        approve1.setApprove(approve2);
        approve2.setApprove(approve3);

        LeaveRequest request = new LeaveRequest(2,"小张");
        approve1.request(request);

        LeaveRequest request1 = new LeaveRequest(5,"小李");
        approve1.request(request1);

        LeaveRequest request2 = new LeaveRequest(15,"小明");
        approve1.request(request2);

        LeaveRequest request3 = new LeaveRequest(31,"小钱");
        approve1.request(request3);
    }
}

package com.macky.designpattern.chainofresponsibilitypattern;

/**
 * @author Macky
 * @Title class VicePresident
 * @Description: TODO
 * @date 2019/9/2 16:15
 */
public class VicePresident extends Approver {
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount()<80000){
            System.out.println("副董事长" + this.name + "审批采购单：" + request.getNumber() + "，金额：" + request.getAmount() + "元，采购目的：" + request.getPurpose() + "。");  //处理请求
        } else{
            this.successor.processRequest(request);//转发请求
        }
    }
}

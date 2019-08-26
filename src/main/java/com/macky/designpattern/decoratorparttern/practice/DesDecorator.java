package com.macky.designpattern.decoratorparttern.practice;

/**
 * @author Macky
 * @Title class DesDecorator
 * @Description: TODO
 * @date 2019/8/26 18:36
 */
public class DesDecorator extends EncryptDecorator {

    public DesDecorator(Encrypt encrypt) {
        super(encrypt);
    }

    @Override
    public void encrypt() {
        this.des();
        super.encrypt();
    }

    public void des(){
        System.out.println("新增des加密！！！");
    }
}

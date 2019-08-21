package com.macky.designpattern.bridgepattern;

/**
 * @author Macky
 * @Title class WindowsImp
 * @Description: TODO
 * @date 2019/8/21 14:19
 */
public class WindowsImp implements ImageImp {
    @Override
    public void doPain(Matrix m) {
        System.out.println("在windows操作系统中显示图像！");
    }
}

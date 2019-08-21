package com.macky.designpattern.bridgepattern;

/**
 * @author Macky
 * @Title class LinuxImp
 * @Description: TODO
 * @date 2019/8/21 14:20
 */
public class LinuxImp implements ImageImp {
    @Override
    public void doPain(Matrix m) {
        System.out.println("在Linux操作系统中显示图像");
    }
}

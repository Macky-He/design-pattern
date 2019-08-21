package com.macky.designpattern.bridgepattern.practice;

/**
 * @author Macky
 * @Title class TxtData
 * @Description: TODO
 * @date 2019/8/21 14:43
 */
public class TxtData implements Data {
    @Override
    public void exchange() {
        System.out.println("转换成TXT文件格式");
    }
}

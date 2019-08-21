package com.macky.designpattern.bridgepattern.practice;

/**
 * @author Macky
 * @Title class XmlData
 * @Description: TODO
 * @date 2019/8/21 14:43
 */
public class XmlData implements Data {
    @Override
    public void exchange() {
        System.out.println("转换为Xml格式数据");
    }
}

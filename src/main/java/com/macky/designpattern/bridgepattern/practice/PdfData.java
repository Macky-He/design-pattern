package com.macky.designpattern.bridgepattern.practice;

/**
 * @author Macky
 * @Title class PdfData
 * @Description: TODO
 * @date 2019/8/21 14:44
 */
public class PdfData implements Data {
    @Override
    public void exchange() {
        System.out.println("转换为PDF文件格式");
    }
}

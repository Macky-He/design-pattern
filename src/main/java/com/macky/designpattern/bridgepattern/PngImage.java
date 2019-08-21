package com.macky.designpattern.bridgepattern;

import java.util.regex.Matcher;

/**
 * @author Macky
 * @Title class PngImage
 * @Description: TODO
 * @date 2019/8/21 14:23
 */
public class PngImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageImp.doPain(matrix);
        System.out.println(fileName + "，格式为Png");
    }
}

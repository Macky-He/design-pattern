package com.macky.designpattern.bridgepattern;

/**
 * @author Macky
 * @Title class JpgImage
 * @Description: TODO
 * @date 2019/8/21 14:21
 */
public class JpgImage extends Image {
    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        imageImp.doPain(matrix);
        System.out.println(fileName + ",格式为JPG");
    }
}

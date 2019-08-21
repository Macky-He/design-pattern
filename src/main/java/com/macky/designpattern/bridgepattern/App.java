package com.macky.designpattern.bridgepattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/21 14:24
 */
public class App {
    public static void main(String[] args) {
        ImageImp image = new LinuxImp();
        Image imp = new PngImage();
        imp.setImageImp(image);
        imp.parseFile("小龙女");
    }
}

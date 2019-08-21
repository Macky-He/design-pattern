package com.macky.designpattern.bridgepattern;

/**
 * @author Macky
 * @Title class Image
 * @Description: TODO
 * @date 2019/8/21 14:16
 */
public abstract class Image {
    protected ImageImp imageImp;
    public void setImageImp(ImageImp imageImp){
        this.imageImp = imageImp;
    }
    public abstract void parseFile(String fileName);
}

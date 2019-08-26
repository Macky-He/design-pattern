package com.macky.designpattern.decoratorparttern.practice;

/**
 * @author Macky
 * @Title class EncryptDecorator
 * @Description: TODO
 * @date 2019/8/26 18:11
 */
public abstract class EncryptDecorator extends Encrypt {

    private Encrypt encrypt;

    public EncryptDecorator(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    @Override
    public void encrypt() {
        encrypt.encrypt();
    }
}

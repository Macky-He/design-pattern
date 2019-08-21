package com.macky.designpattern.abstractfactorypattern;

/**
 * @author Macky
 * @Title class SpringSkinFactory
 * @Description: TODO
 * @date 2019/8/19 10:49
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }
}

package com.macky.designpattern.abstractfactorypattern;

/**
 * @author Macky
 * @Title class BlueSkinFactory
 * @Description: TODO
 * @date 2019/8/19 10:50
 */
public class BlueSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new BlueButton();
    }

    @Override
    public TextField createTextField() {
        return new BlueTextField();
    }
}

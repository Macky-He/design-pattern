package com.macky.designpattern.builderpattern;

/**
 * @author Macky
 * @Title class AngelBuilder
 * @Description: TODO
 * @date 2019/8/20 10:36
 */
public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }
    @Override
    public void buildSex() {
        actor.setSex("女");
    }
    @Override
    public void buildFace() {
        actor.setFace("漂亮");
    }
    @Override
    public void buildCostume() {
        actor.setCostume("白裙");
    }
    @Override
    public void buildHairstype() {
        actor.setHairstyle("大波浪");
    }
}

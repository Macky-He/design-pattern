package com.macky.designpattern.builderpattern;

/**
 * @author Macky
 * @Title class HeroBuilder
 * @Description: TODO
 * @date 2019/8/20 10:32
 */
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }
    @Override
    public void buildSex() {
        actor.setSex("男");
    }
    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }
    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }
    @Override
    public void buildHairstype() {
        actor.setHairstyle("飘逸");
    }
}

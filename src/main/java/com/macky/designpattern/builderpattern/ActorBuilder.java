package com.macky.designpattern.builderpattern;

/**
 * @author Macky
 * @Title class ActorBuilder
 * @Description: TODO
 * @date 2019/8/20 9:59
 */
public abstract class ActorBuilder {
    protected Actor actor = new Actor();
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstype();
    public Actor createActor(){
        return actor;
    }
}

package com.macky.designpattern.builderpattern;

/**
 * @author Macky
 * @Title class ActorController
 * @Description: TODO
 * @date 2019/8/20 10:38
 */
public class ActorController {
    //逐步构建复杂产品对象
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstype();
        actor = ab.createActor();
        return actor;
    }
}

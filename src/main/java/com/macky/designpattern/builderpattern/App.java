package com.macky.designpattern.builderpattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/19 18:08
 */
public class App {

    public static void main(String[] args) {
        Actor construct = new ActorController().construct(new HeroBuilder());
        System.out.println(construct.toString());
    }
}

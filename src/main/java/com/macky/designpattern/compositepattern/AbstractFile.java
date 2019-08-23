package com.macky.designpattern.compositepattern;

/**
 * @author Macky
 * @Title class AbstractFile
 * @Description: 抽象构件
 * @date 2019/8/23 16:28
 */

public abstract class AbstractFile {
    public abstract void add(AbstractFile file);

    public abstract void remove(AbstractFile file);

    public abstract AbstractFile getChild(int i);

    public abstract void killVirus();
}
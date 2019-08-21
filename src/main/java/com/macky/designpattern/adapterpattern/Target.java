package com.macky.designpattern.adapterpattern;

/**
 * @author Macky
 * @Title class Target
 * @Description: TODO
 * @date 2019/8/20 11:39
 */
public interface Target {
    public int[] sort(int array[]); //成绩排序
    public int search(int array[],int key); //成绩查找
}

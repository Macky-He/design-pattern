package com.macky.designpattern.iteratorpattern;

/**
 * @author Macky
 * @Title class AbstractIterator
 * @Description: 抽象迭代器
 * @date 2019/9/5 19:35
 */
public interface AbstractIterator {
    void next(); //移至下一个元素

    boolean isLast(); //判断是否为最后一个元素

    void previous(); //移至上一个元素

    boolean isFirst(); //判断是否为第一个元素

    Object getNextItem(); //获取下一个元素

    Object getPreviousItem(); //获取上一个元素

}

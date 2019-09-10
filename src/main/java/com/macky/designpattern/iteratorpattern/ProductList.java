package com.macky.designpattern.iteratorpattern;

import java.util.List;

/**
 * @author Macky
 * @Title class ProductList
 * @Description: TODO
 * @date 2019/9/5 19:34
 */
public class ProductList extends AbstractObjectList {
    public ProductList(List products) {
        super(products);
    }

    //实现创建迭代器对象的具体工厂方法
    public AbstractIterator createIterator() {
        return new ProductIterator(this);
    }
}

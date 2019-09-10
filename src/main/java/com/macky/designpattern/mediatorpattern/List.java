package com.macky.designpattern.mediatorpattern;

/**
 * @author Macky
 * @Title class List
 * @Description: 具体同事类
 * @date 2019/9/10 11:37
 */
public class List extends Component{
    @Override
    public void update() {
        System.out.println("列表框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("列表框选中项：小龙女。");
    }
}

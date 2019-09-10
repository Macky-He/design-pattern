package com.macky.designpattern.mediatorpattern;

/**
 * @author Macky
 * @Title class ComboBox
 * @Description: TODO
 * @date 2019/9/10 11:38
 */
public class ComboBox extends Component{
    @Override
    public void update() {
        System.out.println("组合框增加一项：张无忌。");
    }

    public void select() {
        System.out.println("组合框选中项：小龙女。");
    }

}

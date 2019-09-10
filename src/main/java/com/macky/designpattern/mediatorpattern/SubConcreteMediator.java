package com.macky.designpattern.mediatorpattern;

/**
 * @author Macky
 * @Title class SubConcreteMediator
 * @Description: TODO
 * @date 2019/9/10 13:47
 */
public class SubConcreteMediator extends ConcreteMediator {
    //增加对Label对象的引用
    public Label label = new Label();

    @Override
    public void componentChanged(Component component) {
        //单击按钮
        if (component == addButton) {
            System.out.println("--单击增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
            label.update(); //文本标签更新
        }
        //从列表框选择客户
        else if (component == list) {
            System.out.println("--从列表框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
        //从组合框选择客户
        else if (component == cb) {
            System.out.println("--从组合框选择客户--");
            cb.select();
            userNameTextBox.setText();
        }
    }
}

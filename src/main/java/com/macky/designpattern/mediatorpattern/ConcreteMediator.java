package com.macky.designpattern.mediatorpattern;


/**
 * @author Macky
 * @Title class ConcreteMediator
 * @Description: 具体中介类
 * @date 2019/9/10 11:35
 */
public class ConcreteMediator extends Mediator {
    //维持对各个同事对象的引用
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;

    @Override
    public void componentChanged(Component component) {
        //封装同事对象之间的交互
        //单击按钮
        if (component == addButton) {
            System.out.println("--单击增加按钮--");
            list.update();
            cb.update();
            userNameTextBox.update();
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

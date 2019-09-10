package com.macky.designpattern.mediatorpattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/9/10 11:43
 */
public class App {
    public static void main(String[] args) {
        //定义中介者对象
        SubConcreteMediator mediator;
        mediator = new SubConcreteMediator();

        //定义同事对象
        Button addBT = new Button();
        List list = new List();
        ComboBox cb = new ComboBox();
        TextBox userNameTB = new TextBox();

        addBT.setMediator(mediator);
        list.setMediator(mediator);
        cb.setMediator(mediator);
        userNameTB.setMediator(mediator);

        mediator.addButton = addBT;
        mediator.list = list;
        mediator.cb = cb;
        mediator.userNameTextBox = userNameTB;

        addBT.changed();
        System.out.println("-----------------------------");
        list.changed();
    }
}

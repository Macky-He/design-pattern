package com.macky.designpattern.decoratorparttern;

/**
 * @author Macky
 * @Title class ComponentDecorator
 * @Description: TODO
 * @date 2019/8/26 10:12
 */
public class ComponentDecorator extends Component {
    //构造器注入Component
    private Component component;

    public ComponentDecorator(Component component) {
        this.component = component;
    }

    @Override
    public void display() {
        component.display();
    }
}

package com.macky.designpattern.mediatorpattern;

/**
 * @author Macky
 * @Title class Button
 * @Description: 具体同事类
 * @date 2019/9/10 11:36
 */
public class Button extends Component{
    @Override
    public void update() {
        System.out.println("按钮组件");
    }
}

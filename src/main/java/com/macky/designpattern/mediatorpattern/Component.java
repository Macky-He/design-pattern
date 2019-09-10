package com.macky.designpattern.mediatorpattern;

/**
 * @author Macky
 * @Title class Component
 * @Description: 抽象组件类：抽象同事类
 * @date 2019/9/10 11:32
 */
public abstract class Component {
    protected Mediator mediator;
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    public void changed(){
        mediator.componentChanged(this);
    }
    public abstract void update();
}

package com.macky.designpattern.mementopattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Macky
 * @Title class Chessman
 * @Description: 原发器：象棋棋子类
 * @date 2019/9/11 17:02
 */
@Data
@AllArgsConstructor
public class Chessman {
    private String label;
    private int x;
    private int y;
    //保存状态
    public ChessmanMemento save() {
        return new ChessmanMemento(this.label,this.x,this.y);
    }

    //恢复状态
    public void restore(ChessmanMemento memento) {
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }
}

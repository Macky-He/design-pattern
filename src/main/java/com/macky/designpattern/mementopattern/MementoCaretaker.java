package com.macky.designpattern.mementopattern;
import	java.security.Provider.Service;
import java.util.ArrayList;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Macky
 * @Title class MementoCaretaker
 * @Description: 负责人：象棋棋子备忘录管理类
 * @date 2019/9/11 17:07
 */

public class MementoCaretaker {
    //定义一个集合来存储多个备忘录
    private ArrayList mementolist = new ArrayList();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento)mementolist.get(i);
    }

    public void setMemento(ChessmanMemento memento) {
        mementolist.add(memento);
    }
}

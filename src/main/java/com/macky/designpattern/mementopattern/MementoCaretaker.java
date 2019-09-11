package com.macky.designpattern.mementopattern;
import	java.security.Provider.Service;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Macky
 * @Title class MementoCaretaker
 * @Description: 负责人：象棋棋子备忘录管理类
 * @date 2019/9/11 17:07
 */
@Getter
@Setter
public class MementoCaretaker {
    private ChessmanMemento memento;
}

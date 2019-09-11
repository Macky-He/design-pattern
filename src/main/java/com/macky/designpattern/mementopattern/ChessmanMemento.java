package com.macky.designpattern.mementopattern;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Macky
 * @Title class ChessmanMemento
 * @Description: 备忘录：象棋棋子备忘类
 * @date 2019/9/11 17:04
 */
@Data
@AllArgsConstructor
public class ChessmanMemento {
    private String label;
    private int x;
    private int y;
}

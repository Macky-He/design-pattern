package com.macky.designpattern.mementopattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/9/11 17:08
 */
public class App {

    public static void main(String[] args) {
        MementoCaretaker mc = new MementoCaretaker();
        Chessman chess = new Chessman("车",1,1);
        display(chess);
        mc.setMemento(chess.save()); //保存状态
        chess.setY(4);
        display(chess);
        mc.setMemento(chess.save()); //保存状态
        display(chess);
        chess.setX(5);
        display(chess);
        System.out.println("******悔棋******");
        chess.restore(mc.getMemento()); //恢复状态
        display(chess);

    }
    public static void display(Chessman chess) {
        System.out.println("棋子" + chess.getLabel() + "当前位置为：" + "第" + chess.getX() + "行" + "第" + chess.getY() + "列。");
    }
}

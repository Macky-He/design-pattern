package com.macky.designpattern.commandpattern;

/**
 * @author Macky
 * @Title class MinimizeCommand
 * @Description: TODO
 * @date 2019/9/3 15:35
 */
public class MinimizeCommand extends Command {
    private WindowHandler handler;

    public MinimizeCommand(WindowHandler handler) {
        this.handler = handler;
    }

    @Override
    public void execute() {
        handler.minimize();
    }
}

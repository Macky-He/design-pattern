package com.macky.designpattern.commandpattern;

/**
 * @author Macky
 * @Title class HelpCommand
 * @Description: TODO
 * @date 2019/9/3 14:13
 */
public class HelpCommand extends Command {
    private HelpHandler helpHandler;

    public HelpCommand(HelpHandler helpHandler) {
        this.helpHandler = helpHandler;
    }

    @Override
    public void execute() {
        helpHandler.display();
    }
}

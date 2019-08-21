package com.macky.designpattern.factorymethodpattern;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/17 17:24
 */
public class App {
    public static void main(String[] args) {
        new FileLoggerFactory().createLogger().writeLog();
        new DatabaseLoggerFactory().createLogger().writeLog();
    }
}

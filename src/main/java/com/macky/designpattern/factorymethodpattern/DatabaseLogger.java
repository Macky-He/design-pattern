package com.macky.designpattern.factorymethodpattern;

/**
 * @author Macky
 * @Title class DatabaseLogger
 * @Description: TODO
 * @date 2019/8/17 17:19
 */
public class DatabaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("写数据库日志！");
    }
}

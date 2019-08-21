package com.macky.designpattern.factorymethodpattern;

/**
 * @author Macky
 * @Title class FileLogger
 * @Description: TODO
 * @date 2019/8/17 17:20
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("写文件日志！");
    }
}

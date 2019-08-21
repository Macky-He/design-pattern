package com.macky.designpattern.factorymethodpattern;

/**
 * @author Macky
 * @Title class FileLoggerFactory
 * @Description: TODO
 * @date 2019/8/17 17:23
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}

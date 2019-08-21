package com.macky.designpattern.factorymethodpattern;

/**
 * @author Macky
 * @Title class DatabaseLoggerFactory
 * @Description: TODO
 * @date 2019/8/17 17:22
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DatabaseLogger();
    }
}

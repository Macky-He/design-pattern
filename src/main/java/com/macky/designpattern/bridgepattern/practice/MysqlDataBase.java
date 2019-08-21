package com.macky.designpattern.bridgepattern.practice;

/**
 * @author Macky
 * @Title class MysqlDataBase
 * @Description: TODO
 * @date 2019/8/21 14:44
 */
public class MysqlDataBase extends DataBase {
    @Override
    public void connect() {
        data.exchange();
        System.out.println("连接MySQL数据库");
    }
}

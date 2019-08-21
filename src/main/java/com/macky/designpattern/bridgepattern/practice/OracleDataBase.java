package com.macky.designpattern.bridgepattern.practice;

/**
 * @author Macky
 * @Title class OracleDataBase
 * @Description: TODO
 * @date 2019/8/21 14:45
 */
public class OracleDataBase extends DataBase {
    @Override
    public void connect() {
        data.exchange();
        System.out.println("连接Oracle数据库");
    }
}

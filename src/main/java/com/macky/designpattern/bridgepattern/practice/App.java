package com.macky.designpattern.bridgepattern.practice;

/**
 * @author Macky
 * @Title class App
 * @Description: TODO
 * @date 2019/8/21 14:46
 */
public class App {
    public static void main(String[] args) {
        Data data = new PdfData();
        DataBase dataBase = new OracleDataBase();
        dataBase.setData(data);
        dataBase.connect();
    }
}

package com.macky.designpattern.proxypattern.staticproxy;

/**
 * @author Macky
 * @Title class UserDaoImpl
 * @Description: TODO
 * @date 2019/8/30 16:31
 */
public class UserDaoImpl implements IUserDao {
    public void save() {
        System.out.println("数据已经存储！！！");
    }
}

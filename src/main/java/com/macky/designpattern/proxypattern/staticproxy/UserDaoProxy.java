package com.macky.designpattern.proxypattern.staticproxy;

/**
 * @author Macky
 * @Title class UserDaoProxy
 * @Description: TODO
 * @date 2019/8/30 16:31
 */
public class UserDaoProxy  implements IUserDao{
    private IUserDao userDao;
    public UserDaoProxy(IUserDao userDao){
        this.userDao = userDao;
    }

    public void save() {
        System.out.println("开启事务！！！");
        userDao.save();
        System.out.println("提交事务！！！");
    }
}

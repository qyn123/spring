package com.qiaoyn.spring.dao;

/**
 * @author qiaoyn
 **/
public class UserDaoMySqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("MySql获取用户数据");
    }
}

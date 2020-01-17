package com.qiaoyn.spring.dao;

/**
 * @author qiaoyn
 **/
public class UserDaoImpl implements UserDao {

    @Override
    public void getUser() {
        System.out.println("获取默认用户数据");
    }
}

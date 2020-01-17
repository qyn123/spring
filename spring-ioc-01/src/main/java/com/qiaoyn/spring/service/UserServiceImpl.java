package com.qiaoyn.spring.service;

import com.qiaoyn.spring.dao.UserDao;
import com.qiaoyn.spring.dao.UserDaoImpl;
import com.qiaoyn.spring.dao.UserDaoMySqlImpl;

/**
 * @author qiaoyn
 **/
public class UserServiceImpl implements UserService {



    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMySqlImpl();
    private UserDao userDao;
    //利用set注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public void getUser() {
        userDao.getUser();
    }
}

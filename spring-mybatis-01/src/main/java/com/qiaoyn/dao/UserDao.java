package com.qiaoyn.dao;

import com.qiaoyn.entity.User;

import java.util.List;

/**
 * @author qiaoyn
 **/
public interface UserDao {

    List<User> selectUser();
}

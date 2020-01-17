package com.qiaoyn.dao;

import com.qiaoyn.entity.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author qiaoyn
 **/
public class UserDaoImpl implements UserDao {

    //我们的所有操作都使用sqlSessionTemplate执行
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public List<User> selectUser() {
        UserDao mapper = sqlSessionTemplate.getMapper(UserDao.class);
        return mapper.selectUser();
    }
}

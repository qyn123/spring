package com.qiaoyn.javaconfig.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author qiaoyn
 * 使用javaConfig方式配置,无xml配置文件
 **/
//@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }
    @Value("tom")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + '}';
    }
}

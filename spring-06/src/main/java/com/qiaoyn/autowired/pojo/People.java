package com.qiaoyn.autowired.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import javax.annotation.Resource;

/**
 * @author qiaoyn
 **/
public class People {


    private String name;
    @Resource(name = "dog222")
    private Dog dog;
    @Resource
    private Cat cat;

    public String getName() {
        return name;
    }

    public Dog getDog() {
        return dog;
    }


    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "People{" + "name='" + name + '\'' + ", dog=" + dog + ", cat=" + cat + '}';
    }
}

package com.qiaoyn.autowired.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * 使用注解开发
 * @author qiaoyn
 * @Component组件相当于在xml文件中配置了
 * <bean class="com.qiaoyn.autowired.pojo.Student" id="student2"></bean>
 *  @Value("Tom")：相当于配置了 <property name="name" value="tom"></property>
 *
 **/
@Component
@Scope(scopeName = "singleton") //作用域:单例模式
public class Student {

    //private String name = "张三";
    @Value("Tom")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + '}';
    }
}

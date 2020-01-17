package com.qiaoyn.javaconfig.config;

import com.qiaoyn.javaconfig.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 通过java配置文件注册bean,不在使用xml文件
 * @author qiaoyn
 * @Configuration也会被spring容器托管，注册到容器中，因为
 * 本身就是@Component组件
 **/
@Configuration//代表一个配置类
//@ComponentScan("com.qiaoyn.javaconfig.pojo")
//@Import(MyTestConfig02.class)
public class MyConfig {

    @Bean
    public User getUser(){
        return new User();
    }
}

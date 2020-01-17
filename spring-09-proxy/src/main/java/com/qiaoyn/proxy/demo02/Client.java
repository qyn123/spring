package main.java.com.qiaoyn.proxy.demo02;

/**
 * @author qiaoyn
 **/
public class Client {
    public static void main(String args[]){
        //真实业务
        UserServiceImpl userService = new UserServiceImpl();
        //代理
        UserServiceProxy proxy = new UserServiceProxy();
        //实现日志功能
        proxy.setUserServiceImpl(userService);
        //执行新增功能
        proxy.add();

    }
}

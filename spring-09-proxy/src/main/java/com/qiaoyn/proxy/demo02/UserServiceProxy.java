package main.java.com.qiaoyn.proxy.demo02;

/**
 * @author qiaoyn
 **/
//代理角色，在这里面增加日志的实现
public class UserServiceProxy implements UserService{



    public void setUserServiceImpl(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    private UserServiceImpl userServiceImpl;

    @Override
    public void add() {
        log("add");
        userServiceImpl.add();
    }

    @Override
    public void delete() {
        log("delete");
        userServiceImpl.delete();
    }

    @Override
    public void update() {
        log("update");
        userServiceImpl.update();
    }

    @Override
    public void query() {
        log("query");
        userServiceImpl.query();
    }

    public void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }

}

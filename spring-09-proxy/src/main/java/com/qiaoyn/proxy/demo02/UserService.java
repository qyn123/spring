package main.java.com.qiaoyn.proxy.demo02;

/**
 * @author qiaoyn
 **/
//抽象角色：增删改查业务
public interface UserService {
    void add();
    void delete();
    void update();
    void query();
}

package test;

import com.qiaoyn.spring.dao.UserDaoImpl;
import com.qiaoyn.spring.dao.UserDaoMySqlImpl;
import com.qiaoyn.spring.service.UserService;
import com.qiaoyn.spring.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  通过set注入，已经发生了根本性的变化 , 很多地方都不一样了 . 仔细去思考一下 , 以前所有东西都是由程序去进
 *  行控制创建 ,而现在是由我们自行控制创建对象 , 把主动权交给了调用者 . 程序不用去管怎么创建,
 *  怎么实现了 . 它只负责提供一个接口 . 这种思想 , 从本质上解决了问题 , 我们程序员不再去管理
 *  对象的创建了 ,更多的去关注业务的实现 . 耦合性大大降低 . 这也就是IOC的原型 !
 *
 *
 *
 * @author qiaoyn
 **/
public class MyTest {
    public static void main(String args[]){
/*        UserService userService = new UserServiceImpl();
        userService.getUser();*/
       // UserServiceImpl userService = new UserServiceImpl();
        //userService.setUserDao(new UserDaoMySqlImpl());
        //userService.setUserDao(new UserDaoImpl());
        //userService.getUser();
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}

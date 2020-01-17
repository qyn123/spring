import com.qiaoyn.aop.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qiaoyn
 **/
public class MyTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理代理的是一个接口
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.delete();
    }
}

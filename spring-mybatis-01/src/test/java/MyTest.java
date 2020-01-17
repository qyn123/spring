import com.qiaoyn.dao.UserDao;
import com.qiaoyn.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qiaoyn
 **/
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserDao userMapper = (UserDao) context.getBean("userMapper");
       for (User user:userMapper.selectUser()){
           System.out.println(user);
       }

    }
}

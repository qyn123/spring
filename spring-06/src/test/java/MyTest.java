import com.qiaoyn.autowired.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qiaoyn
 * 使用注解实现自动装配
 **/
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        People people = context.getBean("people",People.class);
        people.getDog().shout();
        people.getCat().shout();
    }
}

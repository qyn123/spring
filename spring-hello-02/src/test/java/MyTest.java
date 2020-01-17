import com.qiaoyn.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qiaoyn
 **/
public class MyTest {
    public static void main(String args[]){
        //获取spring的bean的上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) applicationContext.getBean("hello");
        hello.show();
    }
}


import com.qiaoyn.javaconfig.config.MyConfig;
import com.qiaoyn.javaconfig.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author qiaoyn
 **/
public class MyTest {

    @Test
    public void test(){
        //如果完全使用了配置类方式，就只能使用AnnotationConfigApplicationContext上下文获取容器，通过配置类class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());

    }
}

import com.qiaoyn.autowired.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qiaoyn
 *  <!--开启属性注解开发-->
 *     <context:annotation-config/>
 *    <!--指定要扫描的包，这个包下的注解就会生效-->
 *     <context:component-scan base-package="com.qiaoyn.autowired"></context:component-scan>
 **/
public class MyTest {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }
}

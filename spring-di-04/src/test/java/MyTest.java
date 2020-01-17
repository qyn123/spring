import com.qiaoyn.pojo.Student;
import com.qiaoyn.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qiaoyn
 * DI:依赖注入：
 * 方式一：构造器注入(无参，有参)
 * 方式二：set注入
 * 方式三：其他方式注入
 *          p命名空间和c命名空间构造器注入，p和命名空间注入需要导入xml命名空间约束，不能直接使用
 * Bean scopes：Bean作用域
 *  singleton（单列模式）：创建的实例只有一个，默认是单例模式
 *      <bean name="user2" class="com.qiaoyn.pojo.User" c:name="李四" c:age="18" scope="singleton"></bean>
 *  prototype（原型模式）：每次从容器中获取的对象都不一样
 *  session
 *  request
 *  application
 *
 **/

public class MyTest {
    public static void main(String args[]){
        ApplicationContext applicationContext =  new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) applicationContext.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbean.xml");
        User user = (User) context.getBean("user2");
        User user2 = (User) context.getBean("user2");
        //System.out.println(user.toString());
        System.out.println(user.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user == user2);

    }
}

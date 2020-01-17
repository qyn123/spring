import com.qiaoyn.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qiaoyn
 * 1.ioc创建对象的方式：
 *    1>默认使用无参构造创建对象
 *    2>使用有参构造对象
 *       2.1下标赋值
 *       2.2通过类型创建
 *       2.3通过参数名设置
 *    总结：在配置文件加载的时候，容器中管理的对象就已经被创建了
 **/
public class MyTest {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        user.show();
    }
}

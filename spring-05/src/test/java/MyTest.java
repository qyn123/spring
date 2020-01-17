import com.qiaoyn.autowired.pojo.People;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author qiaoyn
 *
 * 自动装备Bean：
 * byName:    <!--byName：会自动在容器上下文中查找，和自己对象set方法后面的值对应的bean id-->
 * byType： <!--byType 会自动在容器上下文中查找，和自己对象属性类型相同的bean,保证类型全局唯一 -->
 **/
public class MyTest {

    @Test
    public void test(){
        ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) context.getBean("people");
        people.getCat().shout();
        people.getDog().shout();

    }
}

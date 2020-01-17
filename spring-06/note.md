##常用依赖
---
xml
<dependencies>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-webmvc</artifactId>
            <version>5.1.9.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.12</version>
        </dependency>
    </dependencies>

---

##
@Autowired:装备方式为byType
    1.自动装备(可以省略set方法)
    2.直接在属性上使用即可，也可以在set方法上使用
            @Autowired
            private Dog dog;
            @Autowired
            private Cat cat;
    3.如果@Autowired不能唯一自动装配属性，我们可以通过@Qualifier(value = "xxx")配合使用
     @Autowired
     @Qualifier(value = "dog222")
     private Dog dog;
     <bean id="dog" class="com.qiaoyn.autowired.pojo.Dog"></bean>
     <bean id="dog222" class="com.qiaoyn.autowired.pojo.Dog"></bean>
        
                
@Nullable:可以为空  
@Resource:功能更强大写（javax.annotation.Resource） 
##@Autowired和@Resource的异同点：
 ##相同点：
    都可以放在属性字段上，都是自动装备
 ##不同点：
    @Autowired：默认通过byType的方式实现
    @Resource:默认通过byName的方式实现,如果找不到，默认通过byType的方式
  ##执行顺序不同：
    @Autowired通过byType的方式实现
    @Resource:默认通过byName的方式实现
        
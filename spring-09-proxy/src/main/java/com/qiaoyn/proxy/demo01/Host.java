package main.java.com.qiaoyn.proxy.demo01;

/**
 * @author qiaoyn
 **/
public class Host implements Rent {

    //真实角色: 房东，房东要出租房子
    @Override
    public void rent() {
        System.out.println("房屋出租");
    }
}

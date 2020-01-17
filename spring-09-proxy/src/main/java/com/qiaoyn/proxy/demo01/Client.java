package main.java.com.qiaoyn.proxy.demo01;

/**
 * @author qiaoyn
 **/
//客户类，一般客户都会去找代理！
public class Client {
    public static void main(String args[]){
        //房东yaozufanh
        Host host = new Host();
        //中介帮住房东出租房子
        Proxy proxy = new Proxy(host);

        //客户找中介租房子
        proxy.rent();
    }
}

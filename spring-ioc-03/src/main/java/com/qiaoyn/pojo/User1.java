package com.qiaoyn.pojo;

/**
 * @author qiaoyn
 **/
public class User1 {
    private String name;

/*    public User() {
        System.out.println("无参构造");
    }*/

    public User1() {
        System.out.println("User1被创建了");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("name="+name);
    }
}

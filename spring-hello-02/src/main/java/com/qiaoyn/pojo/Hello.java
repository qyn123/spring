package com.qiaoyn.pojo;

/**
 * @author qiaoyn
 **/
public class Hello {
    private String str;

    public String getStr() {
        return str;
    }

    public void show(){
        System.out.println("Hello,"+ str );
    }
    public void setStr(String str) {
        this.str = str;
    }

}

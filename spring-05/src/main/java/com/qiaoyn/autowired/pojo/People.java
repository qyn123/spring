package com.qiaoyn.autowired.pojo;

/**
 * @author qiaoyn
 **/
public class People {
    private String name;
    private Dog dog;
    private Cat cat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "People{" + "name='" + name + '\'' + ", dog=" + dog + ", cat=" + cat + '}';
    }
}

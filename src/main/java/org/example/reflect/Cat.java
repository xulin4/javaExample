package org.example.reflect;

public class Cat {
    private int age;
    private String name;

    private Cat(){
        System.out.println("执行无参构造函数");
    }
    private Cat(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "cat {"+"name:"+name   +   "   "+"age:"+age+"}";
    }


}

package org.example.reflect;

public class Cat {
    public static int a;
    public static final String country="中国";
    private int age;
    private String name;

    private Cat(){
        System.out.println("执行无参构造函数");
    }
    public Cat(int age,String name){
        System.out.println("执行有参构造函数");
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


    private void run(){
        System.out.println("跑方法");
    }
    private void eat(){
        System.out.println("吃方法");
    }
    private String eat(String name){
        return "重写吃方法"+"猫儿最爱吃"+name;
    }




}

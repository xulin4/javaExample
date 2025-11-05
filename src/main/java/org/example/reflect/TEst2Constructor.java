package org.example.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TEst2Constructor {
    @Test
    public void test1() throws NoSuchMethodException {
        //第一步，获取这个类的对象
        Class c1=Cat.class;
        Constructor[] constructor1 = c1.getConstructors();
        for(Constructor constructor:constructor1){
            System.out.println("getConstructors()只能获取被public修饰的构造器"+constructor.getName()+"--->"+constructor.getParameterCount());
        }
        Constructor [] constructor2 = c1.getDeclaredConstructors();
        for(Constructor constructor:constructor2){
            System.out.println("getDecaredConstructors()获取所有的构造器"+constructor.getName()+"-->"+constructor.getParameterCount());
        }

    }
    @Test
    public void test2() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c1= Class.forName("org.example.reflect.Cat");
        Constructor constructor3 = c1.getDeclaredConstructor(int.class,String.class);
        constructor3.setAccessible(true);
        Cat cat=(Cat)constructor3.newInstance(4,"徐林");
        System.out.println(cat);
        System.out.println("使用getDeclaredConstructor()"+constructor3.getName()+"->"+constructor3.getParameterCount());
    }



}

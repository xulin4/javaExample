package org.example.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Test3Field {
    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = Cat.class;
        Class c1 = Class.forName("org.example.reflect.Cat");
        Constructor constructor = c1.getDeclaredConstructor();
        Cat cat =(Cat) constructor.newInstance();

        Class c2 = cat.getClass();
        Field [] fields = c2.getFields();
        Field [] fields1= c1.getFields();
        Field [] fields2= c.getDeclaredFields();
        System.out.println(fields == fields1);//两个数组是不一样的
        for(Field field:fields){
            System.out.println(field + "-->" + field.getType()+"--->"+"getFields()只能获取public修饰的成员变量");

        }
        for(Field field:fields1){
            System.out.println(field + "--->" + field.getType()+"--->"+"getFields()只能获取public修饰的成员变量");
        }
        for(Field field:fields2){
            System.out.println(field + "-->" + field.getType() + "---->"+"getDeclaredFields()可以获取所有的成员变量");
        }
    }



    @Test
    public void test2() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = Cat.class;
        //利用反射创建一个Cat对象
        Constructor constructor= c.getDeclaredConstructor();
        constructor.setAccessible(true);
        Cat cat= (Cat) constructor.newInstance();

        //设置成员变量的值
        Field field= c.getDeclaredField("name");
        field.setAccessible(true);
        field.set(cat,"加菲猫");
        System.out.println(cat);
        //取成员变量的值
        String name = (String) field.get(cat);
        System.out.println(name);


    }

}

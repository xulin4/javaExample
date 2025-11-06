package org.example.reflect;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestMethod {
    @Test
    public void test() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //获取类的对象
        Class c= Cat.class;
        //
        Method [] methods=c.getMethods();
        Method [] methods1= Class.forName("org.example.reflect.Cat").getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "--->" + method.getReturnType() + "--->" + method.getParameterCount()+"getMethod()还会获得继承的方法");
        }
        System.out.println("换行了");
        for (Method method : methods1) {
            System.out.println(method.getName() + "--->" + method.getReturnType() + "--->" + method.getParameterCount()+"getDeclaredMethod()不会获得继承的方法");
        }

        Constructor constructor = c.getDeclaredConstructor();
        constructor.setAccessible(true);
        Cat cat=(Cat)constructor.newInstance();
        Method run=c.getDeclaredMethod("run");
        run.setAccessible(true);
        String re= (String) run.invoke(cat);
        System.out.println(re);

        Method eat1=c.getDeclaredMethod("eat");
        eat1.setAccessible(true);
        String res= (String) eat1.invoke(cat);
        System.out.println(res);

        Method eat2=c.getDeclaredMethod("eat", String.class);
        eat2.setAccessible(true);
        String resu= (String) eat2.invoke(cat,"鱼");
        System.out.println(resu);



    }

}

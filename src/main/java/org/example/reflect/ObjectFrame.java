package org.example.reflect;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;

public class ObjectFrame {
    public static void saveObject(Object object) throws Exception {
        //写一个框架将不同的对象的成员变量及其值写入到文件当中去
        PrintStream printStream=new PrintStream(new FileOutputStream("C:\\Users\\xulin\\Desktop\\DT\\0925\\untitled\\src\\data.txt",true));
        //首先获取这个对象的类
        Class c= object.getClass();
        printStream.println("--------------"+c.getSimpleName()+"----------------------");
        //获取这个类的所有的成员变量
        Field[]fields=c.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);
            printStream.println(field.getName() +": "+ field.get(object));
        }
        printStream.close();
    }
}

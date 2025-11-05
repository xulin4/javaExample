package org.example.reflect;

public class TestClass {
    public static void main(String [] Args) throws ClassNotFoundException {
        Class c1=Student.class;
        System.out.println(c1.getName());//全类名
        System.out.println(c1.getSimpleName());

        Class c2=Class.forName("org.example.reflect.Student");
        System.out.println(c2);
        System.out.println(c1 == c2);

        Student s = new Student();
        Class c3=s.getClass();
        System.out.println(c3);
        System.out.println(c2 == c3);

    }
}

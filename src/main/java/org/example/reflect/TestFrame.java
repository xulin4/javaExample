package org.example.reflect;

import org.junit.Test;


public class TestFrame {
    Student student=new Student("徐林",21,'男',175.0,"篮球,乒乓球");
    Teacher teacher= new Teacher("阿林",15000);

    @Test
    public void test() throws Exception {
        ObjectFrame.saveObject(student);
        ObjectFrame.saveObject(teacher);
    }


}

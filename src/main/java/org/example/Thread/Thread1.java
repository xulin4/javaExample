package org.example.Thread;

public class Thread1 extends java.lang.Thread {

    @Override
    public void run(){
        System.out.println("当前线程的名字为"+Thread.currentThread().getName());

    }


}

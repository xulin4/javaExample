package org.example.Thread;

public class JoinTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{System.out.println("t1");});
        Thread t2 = new Thread(()->{try{t1.join();}catch(Exception e){System.out.println(Thread.currentThread().getName());}
        System.out.println("t2");});
        Thread t3 = new Thread(()->{try{t2.join();}catch(Exception e){System.out.println(Thread.currentThread().getName());}
        System.out.println("t3");});
        Thread t4 = new Thread(()->{System.out.println("t4");});
        Thread t5 = new Thread(()->{System.out.println("t5");});
        Thread t6 = new Thread(()->{System.out.println("t6");});
        Thread t7 = new Thread(()->{System.out.println("t7");});
        Thread t8 = new Thread(()->{System.out.println("t8");});
        Thread t9 = new Thread(()->{System.out.println("t9");});
        Thread t10 = new Thread(()->{System.out.println("t10");});
        Thread t11 = new Thread(()->{System.out.println("t11");});
        Thread t12 = new Thread(()->{System.out.println("t12");});
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
        t12.start();

    }
}

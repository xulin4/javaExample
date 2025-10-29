package org.example.Thread;

public class Threaddemo1 {
    public static void main(String[] args) {
        MyThraed t1 = new MyThraed();
        MyThraed t2 = new MyThraed();
        MyThraed t3 = new MyThraed();
        MyThraed t4 = new MyThraed();
        MyThraed1 t5 = new MyThraed1();
        MyThraed1 t6 = new MyThraed1();
        MyThraed1 t7 = new MyThraed1();
        MyThraed1 t8 = new MyThraed1();
        MyThraed1 t9 = new MyThraed1();


        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
        new Thread(t4).start();
        new Thread(t5).start();
        new Thread(t6).start();
        new Thread(t7).start();
        new Thread(t8).start();
        new Thread(t9).start();
    }



    static  class MyThraed1 extends Thread{
        int b= 10;
        public void run(){
            while(true) {
                System.out.println("ThreadTiket"+b--);
                if(b<6){
                    break;
                }
            }
        }
    }

    static class MyThraed implements Runnable {
        private int tiket=5;
        public void start() {


        }

        @Override
        public void run() {
            while(true) {
                System.out.println("ThreadTiket"+tiket--);
                if(tiket<0){
                    break;
                }
            }
        }
    }
}

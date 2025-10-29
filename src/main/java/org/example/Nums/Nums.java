package org.example.Nums;

import java.util.Arrays;

public class Nums {

    //不能去掉主方法，存疑
    public static void main(String[] args) {
        //JAVA方法调用是根据栈来实现的
        Nums b = new Nums();
        int[] a = {9, 2, 7, 4, 5, 8, 4};
        int k = 3;
        //静态方法中不能调用非静态方法，需要创建实例才能调用非静态方法
        int[] result = b.maxSlidingWindow(a, k);
        //直接打印result输出的结果是[I@14c265e
        //数组在 Java 中是引用类型，
        //[表示是一个数组  I表示数据类型为Integer  @14c265e表示result对象的哈希码  并不是数组的内容，而是数组对象的内存地址信息。
        //如果去掉了主方法在加载这个类的时候这个执行的方法编译器不知道应该放在哪里
        System.out.println(Arrays.toString(result));

    }

    public  int[] maxSlidingWindow(int[] nums, int k) {
            int count=nums.length-k+1;
            int [] b = new int [count];
            for(int left=0;left<=nums.length-k;left++){
                int right=left+k-1;
                int [] d = Arrays.copyOfRange(nums,left,right+1);
                int c = Arrays.stream(d).max().getAsInt();
                b[left]=c;
            }
            return b;
        }
}

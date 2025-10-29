package org.example.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class dequeTest {
    public static void main(String[] args) {

        Deque<Integer> deque = new LinkedList<Integer>();
        //在队列头部添加元素addFirst()
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);
        System.out.println(deque);
        System.out.println(deque.peek());//peek()查看队列头的第一个元素
    }
}

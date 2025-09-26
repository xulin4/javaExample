package org.example.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ForeachStream {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(6);
        list.add(789);
        list.add(33);
        List<Integer> a = list.stream().collect(Collectors.toList());
        List<Integer> b = list.stream().limit(3).collect(Collectors.toList());
        System.out.println(b);
    }
}

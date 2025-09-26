package org.example.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {


    public  static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(6);
        a.add(4);
        a.add(9);
        System.out.println(a);
        long c=a.stream().count();
        System.out.println(c);
        List<Integer> d = a.stream().filter(f->f>3)
                .collect(Collectors.toList());
        System.out.println(d);

        List<Integer> e =a.stream().sorted()
                .collect(Collectors.toList());
        System.out.println(e);


        List<Integer> b = new ArrayList<>();
        b.add(1);
        b.add(3);
        b.add(6);
        b.add(4);
        b.add(99);
        System.out.println(b);

    }

}

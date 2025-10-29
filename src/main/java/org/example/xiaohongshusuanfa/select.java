package org.example.xiaohongshusuanfa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.compare;

public class select {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while(in.hasNext()){
            int a=in.nextInt();
            int b=in.nextInt();
            List<fan> fanList=new ArrayList<fan>();
            for(int i=1;i<=a;i++){
                int z=0;
                int x=in.nextInt();
                int y=in.nextInt();
                fanList.add(new fan(i,x,y));
            }
            Collections.sort(fanList,(e,f)->{
                //如果相同的话就按照用户的id来排序
                if(e.support!=f.support){
                    return Integer.compare(f.support,e.support);
                }else if(e.collect!=f.collect){
                    return Integer.compare(f.collect,e.collect);
                }else{
                    return Integer.compare(e.id,f.id);
                }
            });
            for(int i=0;i<b;i++){

                System.out.println(fanList.get(i).id +" ");
            }
        }
    }
}

package com.arun.ArrayListTest;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(56);

        // print  list using for loop
       /* for(int i=0;i<list.size();i++)
        {

            System.out.println(list.get(i));
        }*/
        // print  list using for  enhanced loop
//        for(var n:list){
//            System.out.println(n);
//        }
        list.forEach(System.out::println);
        System.out.println("----------------");

        list.forEach(e->{
            System.out.println(e);
        });


    }
}

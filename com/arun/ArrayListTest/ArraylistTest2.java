package com.arun.ArrayListTest;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class person implements Comparable<person>{
    private String name;

    public person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(person o) {
        return name.compareTo(o.name);
    }
}

public class ArraylistTest2 {
    public static void main(String[] args) {


       var p= new ArrayList<person>();
      p.add(new person("raj"));
        p.add(new person("aju"));
        p.add(new person("ramesh"));
        p.add(new person("sita"));

        Collections.sort(p);
        p.forEach(System.out::println);



       List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(34);
        list.add(2);
        list.add(454);
        list.add(7);
        Collections.sort(list);
        list.forEach(System.out::println);
    }



}

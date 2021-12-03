package com.headfirst.chapter16;

import java.util.*;


public class Fruits {
    public static void main( String[] args){
        ArrayList<String> al= new ArrayList<String>();
        al.add("apple");
        al.add("mango");
        al.add("orange");
        Iterator<String> i= al.iterator();
        while ((i.hasNext())){
            System.out.println(i.next());

        }
al.get( 1);
       System.out.println(al);
        al.set(1,"ap");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);


    }
}

package com.headfirst.chapter16;

import java.util.*;
public class TestJavaCollection1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
 list.add("orange");
 list.add("apple");
 list.add("mango");
 Iterator<String>itr= list.iterator();
 while(itr.hasNext()){
     System.out.println("element" + itr.next());
 }
    }
}
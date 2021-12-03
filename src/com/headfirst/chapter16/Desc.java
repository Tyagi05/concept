package com.headfirst.chapter16;

import java.util.ArrayList;
import java.util.Collections;

public class Desc {
    public static void main(String[] args){

        ArrayList<String> as= new ArrayList<>();
        as.add("Orange");
        as.add("Apple");
        as.add("Mango");

        Collections.sort(as, Collections.reverseOrder());
        for(String a:as){
            System.out.println(a);
        }
    }
}

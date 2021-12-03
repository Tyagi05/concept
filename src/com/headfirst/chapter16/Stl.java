package com.headfirst.chapter16;

import java.util.*;

public class Stl {
    public static void main(String[] args){
        String[] array ={ "a","b","c"};
        System.out.println(Arrays.toString(array));
        List<String> ir= new ArrayList<>();
        for( String alpha:array){
            ir.add(alpha);

        }
        System.out.println(ir);
    }
}

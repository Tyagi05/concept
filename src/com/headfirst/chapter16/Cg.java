package com.headfirst.chapter16;
import java.util.*;
public class Cg {
    public static void main(String[] args){
    int s=0;
        List<Integer> ints= Arrays.asList(1,2,3);
        System.out.println(ints);
        for(int n:ints){s+=n ;}
        assert s == 7;
        System.out.println(s);
    }
}


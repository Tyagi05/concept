package com.headfirst.chapter16;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> as = new HashMap<Integer, String>();
        as.put(1, "Karan");
        as.put(2, "Deepak");
        as.put(3, "Rohan");
        for (Map.Entry m : as.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
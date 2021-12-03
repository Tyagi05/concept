package com.headfirst.chapter16;

import java.util.ArrayList;
import java.util.Collections;

public class Desc {
    public static void main(String[] args) {

        ArrayList<String> as = new ArrayList<String>();
        as.add("APPLE");
        as.add("CHEEKU");
        as.add("BANANA");


        Collections.sort(as, Collections.reverseOrder());
        for (String a : as) {
            System.out.println(a);
        }
    }
}

package com.headfirst.chapter16;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparator2 {
    public static void main(String[] args){

        Student1 a1= new Student1("deepak", 22,55);
        Student1 a2= new Student1("rohan", 24,56);
        Student1 a3= new Student1("hari", 26,85);
        ArrayList<Student1> m1= new ArrayList<Student1>();
        m1.add(a1);
        m1.add(a2);
        m1.add(a3);

        Collections.sort(m1, new AgeComparator());
        for(Student1 s1:m1){
            System.out.println(s1.roll_number+ " "+ s1.name+" "+ s1.age);
        }



    }

}

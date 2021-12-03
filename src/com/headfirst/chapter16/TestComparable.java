package com.headfirst.chapter16;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparable {
public static void main(String[] args){
    Student s1= new Student("rohan",22,23);
    Student s2=new Student("karan",25,44);
    Student s3= new Student("prateek",29,33);
    ArrayList<Student> a1= new ArrayList<Student>();
    a1.add(s1);
    a1.add(s2);
    a1.add(s3);
    Collections.sort(a1);
    for(Student st:a1){
        System.out.println(st.roll_number+ " "+st.name+ " "+st.age );
    }
}

}

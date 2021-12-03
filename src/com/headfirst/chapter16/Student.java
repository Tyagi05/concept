package com.headfirst.chapter16;

public class Student implements Comparable<Student> {
    String name;
    int age;
    int roll_number;

    public Student(String name, int age, int roll_number) {
        this.name = name;
        this.age = age;
        this.roll_number = roll_number;
    }

    public int compareTo(Student st){
        if(age==st.age)
            return 0;


        else if(age<st.age)
            return -1;


        else
            return +1;
    }
}
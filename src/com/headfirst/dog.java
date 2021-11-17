package com.headfirst;

public class dog extends Animal{
    void sound(){
        System.out.println("woof woof ");
    }

    public static void main(String[] args) {
        dog a=new dog();
        a.eats();
        a.roams();
        a.sound();
    }

}
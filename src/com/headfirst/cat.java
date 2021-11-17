package com.headfirst;

public class cat extends Animal{
    void eats(){
        System.out.println("likes to eat rats ");
    }

    public static void main(String[] args) {
        cat a=new cat();
        a.eats();
        a.roams();
        a.sound();
    }

}
package com.headfirst;

public class Animal {

    void eats() {
        System.out.println("Animal-requires to eat for survival");
    }

    void roams() {
        System.out.println("Animal-does not stay at one place ");
    }

    void sound() {
        System.out.println("Animal creates sound  ");
    }


    public static void main(String[] args) {
        Animal a=new Animal();
        a.eats();
        a.roams();
        a.sound();
    }

    }




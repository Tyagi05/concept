package com.headfirst;

public class TestMain {

    public static void main(String args[] ) {
        Animal a=new Animal();
        a.eats();
        a.roams();
        a.sound();
        System.out.println("******");
        dog dog = new dog();
        dog.eats();
        dog.roams();
        dog.sound();
        System.out.println("******");
        cat cat =new cat();
        cat.eats();
        cat.roams();
        cat.sound();
    }
}

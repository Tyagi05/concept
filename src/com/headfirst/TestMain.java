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
        System.out.println("******pet******");
        pet dog2 = new dog();
        dog2.beFriendly();
        dog2.play();
        System.out.println("***************");
        pet cat2= new cat();
        cat2.beFriendly();
        cat2.play();
        cat.eats();
    }
}

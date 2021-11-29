package com.headfirst;

public class dog extends Animal implements pet {
    @Override
    public void play() {
        System.out.println("likes to play with ball");
    }

    @Override
    public void beFriendly() {
        System.out.println("is very friendly");
    }

    void sound(){
        System.out.println("woof woof ");
    }


}
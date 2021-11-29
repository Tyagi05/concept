package com.headfirst;

public class cat extends Animal  implements pet{
    @Override
    public void beFriendly() {
        System.out.println("not very friendly");
    }

    @Override
    public void play() {
        System.out.println("likes to play");
    }

    void eats() {
        System.out.println("likes to eat rats ");
    }

}
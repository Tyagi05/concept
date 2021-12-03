package com.headfirst.chapter7;

import com.headfirst.dog;

public class Test extends Poly {
    public void run(int a){
        System.out.println("run"+ a);

    }
    public static void main(String[] args){
        dog d = new dog();
        d.run(3);

    }
}

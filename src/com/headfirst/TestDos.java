package com.headfirst;

public class TestDos {
    public static void main(String [] args){
        Dos d =new Dos();
        d.bark();
        Dos[] a=new Dos[2];
        a[0]= new Dos();
        a[1]= new Dos();
        a[0].name="frido";
        a[1].bark();
    }
}

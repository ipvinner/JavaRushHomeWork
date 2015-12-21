package com.javarush.test.level14.lesson08.home10;

public class Singleton {

    private Singleton(){

    }

    public static Singleton getInstance(){
        return new Singleton();
    }
}

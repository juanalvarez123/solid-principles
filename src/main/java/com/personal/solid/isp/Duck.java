package com.personal.solid.isp;

public class Duck implements Animal, Fly, Swim, Walk {

    @Override
    public void walk() {
        System.out.println("Ok");
    }

    @Override
    public void swim() {
        System.out.println("Ok");
    }

    @Override
    public void fly() {
        System.out.println("Ok");
    }
}

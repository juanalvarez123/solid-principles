package com.personal.solid.isp;

public class Turtle implements Animal {

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
        throw new UnsupportedOperationException("Can't fly");
    }
}

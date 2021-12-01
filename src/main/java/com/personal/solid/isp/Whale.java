package com.personal.solid.isp;

public class Whale implements Animal {

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Can't walk");
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

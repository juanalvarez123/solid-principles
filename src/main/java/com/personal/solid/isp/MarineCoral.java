package com.personal.solid.isp;

public class MarineCoral implements Animal {

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Can't walk");
    }

    @Override
    public void swim() {
        throw new UnsupportedOperationException("Can't swim");
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Can't fly");
    }
}

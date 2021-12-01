package com.personal.solid.dip;

import com.personal.solid.isp.Duck;

public class DuckService {

    private Duck duck;

    public DuckService(Duck duck) {
        // ...
        this.duck = duck;
    }

    public void makeWhatTheDucksDoes() {
        // ...
        this.duck.swim();
    }
}

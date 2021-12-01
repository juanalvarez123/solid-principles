package com.personal.solid.ocp.example1;

import lombok.Getter;

@Getter
public class Vehicle {

    private int doors;
    private int wheels;

    protected String makeStraightMovement() {
        // Normal movement
        return "Go ahead";
    }
}

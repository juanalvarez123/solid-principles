package com.personal.solid.ocp.example1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {

    private int doors;
    private int wheels;

    protected String makeStraightMovement() {
        // Normal movement
        return "Go ahead";
    }
}

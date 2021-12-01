package com.personal.solid.ocp.example1;

public class MazdaVehicle extends Vehicle {

    @Override
    protected String makeStraightMovement() {
        // Another adjustments to do a straight movement
        getDoors();
        getWheels();
        super.makeStraightMovement();
        //...

        return "Mazda's straight movement";
    }
}

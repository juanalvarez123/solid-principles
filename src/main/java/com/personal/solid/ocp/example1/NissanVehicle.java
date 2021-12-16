package com.personal.solid.ocp.example1;

public class NissanVehicle extends Vehicle {

    @Override
    protected String makeStraightMovement() {
        // Cálculos con cantidad de pasajeros
        int cantidadPasajeros = 1;
        return "Depende de la cantidad de pasajeros: " + cantidadPasajeros;
    }
}

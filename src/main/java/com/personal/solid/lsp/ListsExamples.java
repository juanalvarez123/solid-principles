package com.personal.solid.lsp;

import com.personal.solid.ocp.example1.MazdaVehicle;
import com.personal.solid.ocp.example1.NissanVehicle;
import com.personal.solid.ocp.example1.Vehicle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListsExamples {

    public void listsStuff() {
        List<String> listOne = new ArrayList<>(Arrays.asList("Item 1", "Item 2", "Item 3"));
        listOne = new LinkedList<String>();

        TreeSet<String> listTwo = new TreeSet<>(Arrays.asList("No repeat 1", "No repeat 2", "No repeat 3"));
    }

    public List<? extends Vehicle> getVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new MazdaVehicle());
        vehicles.add(new Vehicle());
        vehicles.add(new NissanVehicle());

        if (vehicles.get(0) instanceof Vehicle) {
            // siempre será un vehículo
        }

        if (vehicles.get(0) instanceof MazdaVehicle) {
            // Depende
        }

        List<Object> objetos = new ArrayList<>();
        objetos.add(new Integer(2));
        objetos.add(new Object());

        return vehicles;
    }
}

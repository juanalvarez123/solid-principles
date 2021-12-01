package com.personal.solid.lsp;

import com.personal.solid.ocp.example1.MazdaVehicle;
import com.personal.solid.ocp.example1.Vehicle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ListsExamples {

    public void listsStuff() {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("Item 1", "Item 2", "Item 3"));

        TreeSet<String> listTwo = new TreeSet<>(Arrays.asList("No repeat 1", "No repeat 2", "No repeat 3"));
    }

    public List<? extends Vehicle> getVehicles() {
        ArrayList<MazdaVehicle> vehicles = new ArrayList<>();
        vehicles.add(new MazdaVehicle());

        return vehicles;
    }
}

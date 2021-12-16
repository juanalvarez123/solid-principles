package com.personal.solid.dip;

import com.personal.solid.isp.Animal;
import com.personal.solid.isp.Swim;

public class AcuaticAnimalService {

    private Swim animal;

    public AcuaticAnimalService(Swim animal) {
        this.animal = animal;
    }

    public void makeWhatTheAcuaticAnimalDoes() {
        this.animal.swim();
    }
}

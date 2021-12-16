package com.personal.solid.dip;

import com.personal.solid.isp.Duck;
import com.personal.solid.isp.Turtle;
import com.personal.solid.isp.Whale;

public class Main {

    public static void Main(String[] args) {
        //WhaleService whaleService = new WhaleService(new Whale());
        //DuckService duckService = new DuckService(new Duck());

        // Que pasa si quiero agregar otro animal ?
        AcuaticAnimalService whaleService = new AcuaticAnimalService(new Whale());
        AcuaticAnimalService duckService = new AcuaticAnimalService(new Duck());
        AcuaticAnimalService turtleService = new AcuaticAnimalService(new Turtle());

        //whaleService.makeWhatTheWhalesDoes();
        //duckService.makeWhatTheDucksDoes();
        whaleService.makeWhatTheAcuaticAnimalDoes();
        duckService.makeWhatTheAcuaticAnimalDoes();
        turtleService.makeWhatTheAcuaticAnimalDoes();
    }
}

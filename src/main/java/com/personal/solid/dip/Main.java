package com.personal.solid.dip;

import com.personal.solid.isp.Duck;
import com.personal.solid.isp.Whale;

public class Main {

    public static void Main(String[] args) {
        WhaleService whaleService = new WhaleService(new Whale());
        DuckService duckService = new DuckService(new Duck());
        // Que pasa si quiero agregar otro animal ?

        whaleService.makeWhatTheWhalesDoes();
        duckService.makeWhatTheDucksDoes();
    }
}

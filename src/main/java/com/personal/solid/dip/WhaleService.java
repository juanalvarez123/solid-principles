package com.personal.solid.dip;

import com.personal.solid.isp.Whale;

public class WhaleService {

    private Whale whale;

    public WhaleService(Whale whale) {
        // ...
        this.whale = whale;
    }

    public void makeWhatTheWhalesDoes() {
        // ...
        this.whale.swim();
    }
}

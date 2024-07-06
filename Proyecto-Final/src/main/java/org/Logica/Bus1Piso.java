package org.Logica;

import java.time.LocalTime;

public class Bus1Piso extends Bus {
    public Bus1Piso(LocalTime L,String d) {
        super(L,d);
        for (int i = 0; i < 4; i++) {
            super.addAsientos(new AsientoSuiteCama(this));
        }
        for (int i = 0; i < 12; i++) {
            super.addAsientos(new AsientoSalonCama(this));
        }
        for (int i = 0; i < 16; i++) {
            super.addAsientos(new AsientoSemiCama(this));
        }
    }
}

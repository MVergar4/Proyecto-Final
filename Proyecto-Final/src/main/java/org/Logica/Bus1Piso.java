package org.Logica;

import java.time.LocalTime;

public class Bus1Piso extends Bus {
    public Bus1Piso(LocalTime L,Recorrido r) {
        super(L,r);
        for (int i = 0; i < 4; i++) {
            super.asientos.add(new AsientoSuiteCama("0" + i,this));
        }
        for (int i = 0; i < 12; i++) {
            super.asientos.add(new AsientoSalonCama("1" + i,this));
        }
        for (int i = 0; i < 16; i++) {
            super.asientos.add(new AsientoSemiCama("2" + i,this));
        }
    }
}

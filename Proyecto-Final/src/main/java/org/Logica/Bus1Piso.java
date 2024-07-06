package org.Logica;

import java.time.LocalTime;

public class Bus1Piso extends Bus {
    public Bus1Piso(LocalTime L,String d) {
        super(L,d);
        for (int i = 0; i < 4; i++) {
            super.addAsientos(new AsientoSuiteCama("0" + i,this));
        }
        for (int i = 0; i < 12; i++) {
            super.addAsientos(new AsientoSalonCama("1" + i,this));
        }
        for (int i = 0; i < 16; i++) {
            super.addAsientos(new AsientoSemiCama("2" + i,this));
        }
    }

    @Override
    public void reservarAsiento(String letra, int numero) {
    }
}

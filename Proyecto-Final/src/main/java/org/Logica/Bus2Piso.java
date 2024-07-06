package org.Logica;

import java.time.LocalTime;

public class Bus2Piso extends Bus {
    public Bus2Piso(LocalTime L,String d) {
        super(L,d);
        for (int i = 0; i < 8; i++) {
            super.addAsientos(new AsientoSuiteCama("3" + i,this));
        }
        for (int i = 0; i < 24; i++) {
            super.addAsientos(new AsientoSalonCama("4" + i,this));
        }
        for (int i = 0; i < 32; i++) {
            super.addAsientos(new AsientoSemiCama("5" + i,this));
        }
    }

    @Override
    public void reservarAsiento(String letra, int numero) {

    }
}

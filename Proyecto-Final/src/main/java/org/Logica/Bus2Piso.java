package org.Logica;

import java.time.LocalTime;

public class Bus2Piso extends Bus {
    public Bus2Piso(LocalTime L,Recorrido r) {
        super(L,r);
        for (int i = 0; i < 8; i++) {
            super.asientos.add(new AsientoSuiteCama("3" + i,this));
        }
        for (int i = 0; i < 24; i++) {
            super.asientos.add(new AsientoSalonCama("4" + i,this));
        }
        for (int i = 0; i < 32; i++) {
            super.asientos.add(new AsientoSemiCama("5" + i,this));
        }
    }

    @Override
    public void reservarAsiento(String letra, int numero) {

    }
}

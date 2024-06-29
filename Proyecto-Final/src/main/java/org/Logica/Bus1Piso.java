package org.Logica;

public class Bus1Piso extends Bus {
    public Bus1Piso() {
        for (int i = 0; i < 4; i++) {
            super.asientos.add(new AsientoSuiteCama());
        }
        for (int i = 0; i < 12; i++) {
            super.asientos.add(new AsientoSalonCama());
        }
        for (int i = 0; i < 16; i++) {
            super.asientos.add(new AsientoSemiCama());
        }
    }
}

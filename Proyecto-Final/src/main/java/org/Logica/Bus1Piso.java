package org.Logica;

public class Bus1Piso extends Bus {
    public Bus1Piso() {
        for (int i = 0; i < 4; i++) {
            asientos.add(new AsientoSuiteCama());
        }
        for (int i = 4; i < 16; i++) {
            asientos.add(new AsientoSalonCama());
        }
        for (int i = 16; i < 32; i++) {
            asientos.add(new AsientoSemiCama());
        }
    }
}

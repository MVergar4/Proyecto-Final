package org.Logica;

public class Bus1Piso extends Bus {
    public Bus1Piso() {
        for (int i = 0; i < 4; i++) {
            asientos.add(new AsientoSuiteCama("0" + i));
        }
        for (int i = 0; i < 12; i++) {
            asientos.add(new AsientoSalonCama("1" + i));
        }
        for (int i = 0; i < 16; i++) {
            asientos.add(new AsientoSemiCama("2" + i));
        }
    }
}

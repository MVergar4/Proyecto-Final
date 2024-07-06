package org.Logica;

public class Bus2Piso extends Bus {
    public Bus2Piso() {
        for (int i = 0; i < 8; i++) {
            super.asientos.add(new AsientoSuiteCama("3" + i));
        }
        for (int i = 0; i < 24; i++) {
            super.asientos.add(new AsientoSalonCama("4" + i));
        }
        for (int i = 0; i < 32; i++) {
            super.asientos.add(new AsientoSemiCama("5" + i));
        }
    }
}

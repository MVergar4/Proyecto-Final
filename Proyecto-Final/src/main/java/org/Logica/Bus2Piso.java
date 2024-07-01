package org.Logica;

public class Bus2Piso extends Bus {
    public Bus2Piso() {
        for (int i = 0; i < 8; i++) {
            super.asientos.add(new AsientoSuiteCama("0" + i));
        }
        for (int i = 0; i < 24; i++) {
            super.asientos.add(new AsientoSalonCama("1" + i));
        }
        for (int i = 0; i < 32; i++) {
            super.asientos.add(new AsientoSemiCama("2" + i));
        }
    }
}

package org.Logica;

public class Bus2Piso extends Bus {
    public Bus2Piso() {
        for (int i = 0; i < 8; i++) {
            asientos.add(new AsientoSuiteCama());
        }
        for (int i = 8; i < 32; i++) {
            asientos.add(new AsientoSalonCama());
        }
        for (int i = 32; i < 64; i++) {
            asientos.add(new AsientoSemiCama());
        }
    }
}

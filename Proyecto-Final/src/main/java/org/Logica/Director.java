package org.Logica;

import java.time.LocalTime;

public class Director {
    public Director() {}
    public void Bus1PisoMatutinoSimple(Builder b) {
        b.reset();
        b.setAsientos(20, 12, 0);
        b.setHorario(LocalTime.of(6,0));
    }
    public void Bus2PisosMatutinoSimple(Builder b) {
        b.reset();
        b.setAsientos(40, 24, 0);
        b.setHorario(LocalTime.of(6, 0));
    }
}

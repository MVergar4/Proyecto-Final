package org.Logica;

import java.time.LocalTime;

public class BusBuilder implements Builder {
    private Bus bus;
    public BusBuilder() {
        this.reset();
    }
    @Override
    public void reset() {
        this.bus = new Bus();
    }

    /**
     * Crea los asientos del bus, la cantidad de cada una de las categorías de asientos deben ser múltiplos de 4
     * @param semi cantidad de AsientoSemiCama
     * @param salon cantidad de AsientoSalonCama
     * @param suite cantidad de AsientoSuiteCama
     */
    @Override
    public void setAsientos(int semi, int salon, int suite) {
        int total = semi + salon + suite;
        for(int j=0;j<4;j++) {
            String f = "";
            switch (j){
                case 0: f="A";break;
                case 1: f="B";break;
                case 2: f="C";break;
                case 3: f="D";break;
                default: break;
            }
            for (int i = 1; i <= total / 4; i++) {
                if (i <= (semi / 4)) {
                    this.bus.getAsientos().add(new AsientoSemiCama(f, i));
                } else if (i <= ((salon / 4) + (semi / 4))) {
                    this.bus.getAsientos().add(new AsientoSalonCama(f, i));
                } else {
                    this.bus.getAsientos().add(new AsientoSuiteCama(f, i));
                }
            }
        }
    }
    @Override
    public void setHorario(LocalTime hora) {
        this.bus.setHorario(hora);
    }
    public Bus getBus() {
        Bus temp = this.bus;
        this.reset();
        return temp;
    }
}
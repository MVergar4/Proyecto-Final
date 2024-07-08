package org.Logica;

import java.time.LocalTime;

public class Bus1Piso extends Bus { //16 ,//12 //4
    public Bus1Piso(LocalTime L,String d) {
        super();
        for(int j=0;j<4;j++) {
            String f = "";
            switch (j){
                case 0: f="A";break;
                case 1: f="B";break;
                case 2: f="C";break;
                case 3: f="D";break;
                default: break;
            }
            for (int i = 1; i <= 8; i++) {
                if (i <= 4) {
                    asientos.add(new AsientoSemiCama(f, i, 1000));
                } else if (i <= 7) {
                    asientos.add(new AsientoSalonCama(f, i, 1500));
                } else {
                    asientos.add(new AsientoSuiteCama(f, i, 2000));
                }
            }
        }
    }
}

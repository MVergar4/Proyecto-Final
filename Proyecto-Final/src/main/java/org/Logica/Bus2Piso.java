package org.Logica;

import java.time.LocalTime;

public class Bus2Piso extends Bus { //32,//24,//8
    public Bus2Piso(LocalTime L,String d) {
        super(L,d);
        for(int j=0;j<4;j++) {
            String f = "";
            switch (j){
                case 0: f="A";break;
                case 1: f="B";break;
                case 2: f="C";break;
                case 3: f="D";break;
                default: break;
            }
            for (int i = 1; i <= 16; i++) {
                if (i <= 8) {
                    super.addAsientos(new AsientoSemiCama(this, f, i));
                } else if (i <= 14) {
                    super.addAsientos(new AsientoSalonCama(this, f, i));
                } else {
                    super.addAsientos(new AsientoSuiteCama(this, f, i));
                }
            }
        }
    }
}

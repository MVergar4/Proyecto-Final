package org.Logica;

import java.time.LocalTime;

public class Bus1Piso extends Bus { //16 ,//12 //4
    public Bus1Piso(LocalTime L,String d) {
        super(L,d);
        for(int j=0;j<4;j++) {
            String f = "";
            switch (j){
                case 0: f="A";
                case 1: f="B";
                case 2: f="C";
                case 3: f="D";
            }
            for (int i = 1; i <= 8; i++) {
                if (i <= 4) {
                    super.addAsientos(new AsientoSemiCama(this, f, i));
                } else if (i <= 7) {
                    super.addAsientos(new AsientoSalonCama(this, f, i));
                } else {
                    super.addAsientos(new AsientoSuiteCama(this, f, i));
                }
            }
        }
    }
}

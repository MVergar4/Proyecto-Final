package org.Grafica;

import org.Logica.Asiento;
import org.Logica.AsientoSalonCama;
import org.Logica.BoletoBus;

public class Main {
    public static void main(String[] args) {
        //MiVentana ventana = new MiVentana();
        Asiento a = new AsientoSalonCama("01");
        BoletoBus b = new BoletoBus(a);
        System.out.println(b);
    }
}

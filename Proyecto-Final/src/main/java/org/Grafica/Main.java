package org.Grafica;

import org.Logica.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        //MiVentana ventana = new MiVentana();
        Recorrido r = new Recorrido("santiago");
        Bus b = new Bus1Piso(LocalTime.of(12,30),"Santiago");
        Asiento a = new AsientoSalonCama(b);
        BoletoBus boletoBus = new BoletoBus(a);
        System.out.println(boletoBus);
    }
}

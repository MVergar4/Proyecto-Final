package org.Grafica;

import org.Logica.*;
import java.time.*;

public class Main {
    public static void main(String[] args) {
        //MiVentana ventana = new MiVentana();
        Recorrido r = new RecorridoSantiago();
        Bus b = new Bus1Piso(LocalTime.of(12,30),"Santiago");
        BoletoBus boletoBus = new BoletoBus(b.getAsientos().getFirst());
        System.out.println(boletoBus);
    }
}

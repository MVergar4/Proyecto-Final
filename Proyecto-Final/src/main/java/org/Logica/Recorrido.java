package org.Logica;

import java.time.LocalTime;
import java.util.ArrayList;

public class Recorrido {
    private String ciudadDestino;
    private ArrayList<Bus> busesDisponibles;
    public Recorrido(String ciudad){
        this.ciudadDestino=ciudad;
        this.busesDisponibles=new ArrayList<>();
        busesDisponibles.add(new Bus2Piso(LocalTime.of(6,10),ciudad));
        busesDisponibles.add(new Bus1Piso(LocalTime.of(12,15),ciudad));
        busesDisponibles.add(new Bus1Piso(LocalTime.of(18,40),ciudad));
        busesDisponibles.add(new Bus2Piso(LocalTime.of(23,20),ciudad));
    }
    public String getCiudadDestino(){
        return ciudadDestino;
    }
}

package org.Logica;

import java.util.ArrayList;

public class Recorrido {
    private String ciudadDestino;
    private ArrayList<Bus> busesDisponibles;
    public Recorrido(String ciudad){
        this.ciudadDestino=ciudad;
        this.busesDisponibles=new ArrayList<>();
        busesDisponibles.add(new Bus1Piso());
        busesDisponibles.add(new Bus1Piso());
        busesDisponibles.add(new Bus2Piso());

    }

}

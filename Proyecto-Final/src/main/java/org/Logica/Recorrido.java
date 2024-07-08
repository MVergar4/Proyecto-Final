package org.Logica;

import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Recorrido {
    private String ciudadDestino;
    protected ArrayList<Bus> busesDisponibles = new ArrayList<>();
    public Recorrido(String ciudad){
        this.ciudadDestino = ciudad;
    }
    public String getCiudadDestino(){
        return ciudadDestino;
    }
}

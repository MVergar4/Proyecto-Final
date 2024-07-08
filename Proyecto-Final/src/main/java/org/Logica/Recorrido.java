package org.Logica;

import java.util.ArrayList;

/**
 * Clase que modela un conjunto de buses que comparten un mismo destino
 */
public abstract class Recorrido {
    /** Ciudad hacia la que se dirigen */
    private final String ciudadDestino;
    /** Arreglo de buses */
    protected ArrayList<Bus> busesDisponibles = new ArrayList<>();

    /**
     * Contructor que asigna la ciudad a la que se dirigen
     * @param ciudad ciudad destino
     */
    public Recorrido(String ciudad){
        this.ciudadDestino = ciudad;
    }

    /**
     * Retorna la ciudad a la que se dirigen
     * @return destino
     */
    public String getCiudadDestino(){
        return ciudadDestino;
    }

    /**
     * Retorna la lista de buses
     * @return ArrayList de buses
     */
    public ArrayList<Bus> getBusesDisponibles() {
        return busesDisponibles;
    }
}

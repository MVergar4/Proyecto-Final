package org.Logica;

import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Bus {
    private LocalTime horario;
    private Recorrido recorrido;
    protected ArrayList<Asiento> asientos = new ArrayList<>();
    public abstract void reservarAsiento(String letra, int numero);
    public Bus(LocalTime L,Recorrido r){
        this.horario=L;
        this.recorrido=r;
    }
    public LocalTime getHorario(){
        return horario;
    }
    public Recorrido getRecorrido(){
        return recorrido;
    }
}

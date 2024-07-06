package org.Logica;

import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Bus {
    private LocalTime horario;
    private String destino;
    private ArrayList<Asiento> asientos;
    public abstract void reservarAsiento(String letra, int numero);
    public Bus(LocalTime L,String d){
        this.horario=L;
        this.destino=d;
        this.asientos=new ArrayList<>();
    }
    public LocalTime getHorario(){
        return horario;
    }
    public String getDestino(){
        return destino;
    }
    public ArrayList<Asiento> getAsientos(){
        return asientos;
    }

    public void addAsientos(Asiento a) {
        asientos.add(a);
    }
}

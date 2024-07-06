package org.Logica;

import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Bus {
    private LocalTime horario;
    private String destino;
    private ArrayList<Asiento> asientos;
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

    private int transformarFila(String letra, int numero) {
        int contador = -100;
        switch (letra) {
            case "A":
                contador = 0;
            case "B":
                contador = 1;
            case "C":
                contador = 2;
            case "D":
                contador = 3;
        }
        return contador + ((numero - 1) * 4);
    }
    public boolean revisarAsiento(String l, int n) {
        Asiento temp = asientos.get(transformarFila(l, n));
        return temp.estaDisponible();
    }
    public void reservarAsiento(String l, int n) throws AsientoOcupadoException {
        Asiento temp = asientos.get(transformarFila(l, n));
        if (revisarAsiento(l, n)) {
            temp.ocuparAsiento();
        } else {
            throw new AsientoOcupadoException("Error, este asiento ya está ocupado");
        }
    }
}

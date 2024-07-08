package org.Logica;

import java.time.LocalTime;
import java.util.ArrayList;

public class Bus {
    private String horario;
    private String destino;
    protected ArrayList<Asiento> asientos;
    public Bus(){
        this.asientos=new ArrayList<>();
    }
    public void setHorario(String L) {
        horario = L;
    }
    public String getHorario(){
        return horario;
    }
    public void setDestino(String d) {
        destino = d;
    }
    public String getDestino(){
        return destino;
    }
    public ArrayList<Asiento> getAsientos(){
        return asientos;
    }

    public int transformarFila(String letra, int numero) {
        int contador = numero - 1;
        switch (letra) {
            case "A": contador = numero - 1; break;
            case "B": contador = contador + (asientos.size()/4); break;
            case "C": contador = contador + (asientos.size()/4) * 2; break;
            case "D": contador = contador + (asientos.size()/4) * 3; break;
            default: break;
        }
        return contador;
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

package org.Logica;

import java.time.LocalTime;
import java.util.ArrayList;

public class Bus {
    private LocalTime horario;
    private String destino;
    protected ArrayList<Asiento> asientos;
    public Bus(/*LocalTime L,String d*/){
        /*this.horario=L;
        this.destino=d;*/
        this.asientos=new ArrayList<>();
    }
    public void setHorario(LocalTime L) {
        horario = L;
    }
    public LocalTime getHorario(){
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

    private int transformarFila(String letra, int numero) {
        int contador = -100;
        switch (letra) {
            case "A": contador = 0; break;
            case "B": contador = 1; break;
            case "C": contador = 2; break;
            case "D": contador = 3; break;
            default: break;
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

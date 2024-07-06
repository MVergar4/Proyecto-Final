package org.Logica;

import java.time.LocalTime;

public class BoletoBus {
    private String fila;
    private int numAsiento;
    private int boleta;
    private String ciudadDestino;
    private LocalTime horario;

    public BoletoBus(Asiento a){
        this.fila=a.getFila();
        this.numAsiento=a.getNumFila();
        this.boleta=a.getPrecio();
        this.ciudadDestino=a.getBus().getDestino();
        this.horario=a.getBus().getHorario();
    }

    @Override
    public String toString() {
        return "Asiento: "+fila+numAsiento+"\nPrecio pagado: "+boleta+"\nCiudad de destino: "+ciudadDestino+"\nHora salida: "+horario;
    }
}

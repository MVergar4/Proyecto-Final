package org.Logica;

import java.time.LocalTime;

public class BoletoBus {
    private String numAsiento;
    private int boleta;
    private String ciudadDestino;
    private LocalTime horario;

    public BoletoBus(Asiento a){
        this.numAsiento=a.getFila();
        this.boleta=a.getPrecio();
        this.ciudadDestino=a.getBus().getRecorrido().getCiudadDestino();
        this.horario=a.getBus().getHorario();
    }

    @Override
    public String toString() {
        return "Asiento: "+numAsiento+"\nPrecio pagado: "+boleta+"\nCiudad de destino: "+ciudadDestino+"\nHora salida: "+horario;
    }
}

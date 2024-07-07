package org.Logica;

import java.time.LocalTime;

public class BoletoBus {
    private String asiento;
    private int boleta;
    private String ciudadDestino;
    private LocalTime horario;

    public BoletoBus(Asiento a){
        this.asiento=a.getAsiento();
        this.boleta=a.getPrecio();
        this.ciudadDestino=a.getBus().getDestino();
        this.horario=a.getBus().getHorario();
    }

    @Override
    public String toString() {
        return "Asiento: "+asiento+"\nPrecio pagado: "+boleta+"\nCiudad de destino: "+ciudadDestino+"\nHora salida: "+horario;
    }
}

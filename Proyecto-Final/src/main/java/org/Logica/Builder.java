package org.Logica;

import java.time.LocalTime;

public interface Builder {
    public void reset();
    public void setAsientoSemiCama(int cantidad, int precio);
    public void setAsientoSalonCama(int cantidad, int precio);
    public void setAsientoSuiteCama(int cantidad, int precio);
    public void setHorario(LocalTime hora);
    public void setDestino(String cuidad);
}

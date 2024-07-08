package org.Logica;

import java.time.LocalTime;

public interface Builder {
    public void reset();
    public void setAsientos(int semi, int precio1, int salon, int precio2, int suite, int precio3);
    public void setHorario(LocalTime hora);
    public void setDestino(String cuidad);
}

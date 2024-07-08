package org.Logica;

import java.time.LocalTime;

public interface Builder {
    public void reset();
    public void setAsientos(int semi, int salon, int suite);
    public void setHorario(String hora);
}

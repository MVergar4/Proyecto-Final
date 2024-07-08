package org.Logica;

/**
 * Interfaz del patrón Builder
 */
public interface Builder {
    void reset();
    void setAsientos(int semi, int salon, int suite);
    void setHorario(String hora);
}

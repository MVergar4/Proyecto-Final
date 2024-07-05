package org.Logica;

import java.util.ArrayList;

public abstract class Bus {
    protected ArrayList<Asiento> asientos = new ArrayList<>();
    public abstract void reservarAsiento(String letra, int numero);
}

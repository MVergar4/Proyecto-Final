package org.Logica;

import java.util.ArrayList;

public abstract class Bus {
    protected ArrayList<Asiento> asientos = new ArrayList<>();
    public void reservarAsiento(String letra, int numero) {
        int contador = -100;
        switch (letra) {
            case "A":
                contador = 0;
            case "B":
                contador = 1;
            case "C":
                contador = 2;
            case "D":
                contador = 3;
        }
        contador = contador + ((numero - 1) * 4);
        asientos.get(contador).ocuparAsiento();
    }
}

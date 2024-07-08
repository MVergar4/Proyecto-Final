package org.Logica;

public class AsientoSuiteCama extends Asiento {
    public AsientoSuiteCama(String fila, int n, int precio) {
        super(fila, n);
        super.precio = precio;
    }
}

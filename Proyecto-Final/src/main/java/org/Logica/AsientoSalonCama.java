package org.Logica;

public class AsientoSalonCama extends Asiento {
    public AsientoSalonCama(String fila, int n, int precio) {
        super(fila, n);
        super.precio = precio;
    }
}

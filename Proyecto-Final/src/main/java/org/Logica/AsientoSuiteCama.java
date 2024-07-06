package org.Logica;

public class AsientoSuiteCama extends Asiento {
    public AsientoSuiteCama(Bus b,String fila,int numFila) {
        super(b,fila,numFila);
        super.precio = 2000;
    }
}

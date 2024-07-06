package org.Logica;

public class AsientoSemiCama extends Asiento {
    public AsientoSemiCama(Bus b,String fila,int numFila) {
        super(b,fila,numFila);
        super.precio = 1000;
    }
}

package org.Logica;

public class AsientoSalonCama extends Asiento {
    public AsientoSalonCama(Bus b,String fila,int numFila) {
        super(b,fila,numFila);
        super.precio = 1500;
    }
}

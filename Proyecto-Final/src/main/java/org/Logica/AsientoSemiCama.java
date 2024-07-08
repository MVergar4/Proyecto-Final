package org.Logica;

/**
 * Subclase de Asiento que representa un asiento SemiCama, gama baja
 */
public class AsientoSemiCama extends Asiento {
    /**
     * Constructor que llama al constructor de la clase super y asigna un precio al asiento
     * @param fila letra de la columna
     * @param n numero de fila
     */
    public AsientoSemiCama(String fila, int n) {
        super(fila, n);
        super.precio = 1000;
    }
}

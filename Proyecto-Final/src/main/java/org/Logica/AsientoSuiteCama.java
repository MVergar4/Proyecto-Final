package org.Logica;

/**
 * Subclase de Asiento que representa un asiento SuiteCama, gama alta
 */
public class AsientoSuiteCama extends Asiento {
    /**
     * Constructor que llama al constructor de la clase super y asigna un precio al asiento
     * @param fila letra de la columna
     * @param n numero de fila
     */
    public AsientoSuiteCama(String fila, int n) {
        super(fila, n);
        super.precio = 2000;
    }
}

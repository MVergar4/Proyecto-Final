package org.Logica;

/**
 * Excepción que ocurre cuando se quiere ocupar un asiento que ya está ocupado
 */
public class AsientoOcupadoException extends Exception {
    /**
     * Constructor por defecto
     * @param errorMsg mensaje de error
     */
    public AsientoOcupadoException(String errorMsg) {
        super(errorMsg);
    }
}

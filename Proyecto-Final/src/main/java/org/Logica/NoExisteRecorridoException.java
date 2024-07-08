package org.Logica;

/**
 * Excepción que ocurre cuando se selecciona un recorrido inválido
 */
public class NoExisteRecorridoException extends Exception {
    /**
     * Constructor por defecto
     * @param errorMsg mensaje de error
     */
    public NoExisteRecorridoException(String errorMsg) {
        super(errorMsg);
    }
}

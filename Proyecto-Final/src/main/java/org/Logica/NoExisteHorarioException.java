package org.Logica;

/**
 * Excepción que ocurre cuando se selecciona un horario inválido
 */
public class NoExisteHorarioException extends Exception {
    /**
     * Constructor por defecto
     * @param errorMsg mensaje de error
     */
    public NoExisteHorarioException(String errorMsg) {
        super(errorMsg);
    }
}

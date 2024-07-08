package org.example;

import org.Logica.*;
import org.junit.jupiter.api.Test;

/**
 * Test para comprobar el funcionamiento de la excepción NoExisteRecorridoException
 */
class SeleccionarRecorridoTest {
    /** Recorrido de buses con destino Concepción */
    private final Recorrido concepcion = new RecorridoConcepcion();
    /** Recorrido de buses con destino Chillán */
    private final Recorrido chillan = new RecorridoChillan();
    /** Recorrido de buses con destino Santiago */
    private final Recorrido santiago = new RecorridoSantiago();
    /** Recorrido de buses con destino Temuco */
    private final RecorridoTemuco temuco = new RecorridoTemuco();

    /**
     * Método de simple hecho para el test
     * @param ciudad destino seleccionado
     * @return recorrido que contiene los buses dirigidos al destino elegido
     * @throws NoExisteRecorridoException si el recorrido elegido no está entre los registrados, saltará un error
     */
    Recorrido seleccionarRecorrido(String ciudad) throws NoExisteRecorridoException {
        return switch (ciudad) {
            case "Concepcion" -> concepcion;
            case "Chillan" -> chillan;
            case "Santiago" -> santiago;
            case "Temuco" -> temuco;
            default -> throw new NoExisteRecorridoException("El recorrido seleccionado no existe");
        };
    }

    /**
     * Prueba la excepción utilizando el método declarado anteriormente
     */
    @Test
    void probarSeleccion() {
        Recorrido test;
        try {
            test = seleccionarRecorrido("Concepcion");
            test = seleccionarRecorrido("Chillan");
            test = seleccionarRecorrido("Santiago");
            test = seleccionarRecorrido("Temuco");
            test = seleccionarRecorrido("Lota");
        } catch (NoExisteRecorridoException e) {
            System.out.println(e.getMessage());
        }
    }
}

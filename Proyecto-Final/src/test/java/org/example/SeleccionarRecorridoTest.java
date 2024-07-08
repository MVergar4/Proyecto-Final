package org.example;

import org.Logica.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SeleccionarRecorridoTest {
    private final Recorrido concepcion = new RecorridoConcepcion();
    private final Recorrido chillan = new RecorridoChillan();
    private final Recorrido santiago = new RecorridoSantiago();
    private final RecorridoTemuco temuco = new RecorridoTemuco();

    Recorrido seleccionarRecorrido(String ciudad) throws NoExisteRecorridoException {
        return switch (ciudad) {
            case "Concepcion" -> concepcion;
            case "Chillan" -> chillan;
            case "Santiago" -> santiago;
            case "Temuco" -> temuco;
            default -> throw new NoExisteRecorridoException("El recorrido seleccionado no existe");
        };
    }

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

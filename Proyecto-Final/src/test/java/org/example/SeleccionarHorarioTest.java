package org.example;

import org.Logica.*;
import org.junit.jupiter.api.Test;

/**
 * Test para comprobar el funcionamiento de la excepción para cuando se elige un horario que no existe
 */
class SeleccionarHorarioTest {
    /** Director para crear buses */
    private final Director director = new Director();
    /** Builder para asignar al director */
    private final BusBuilder builder = new BusBuilder();

    /**
     * Prueba la excepción utilizando el método para crear buses de director
     */
    @Test
    void pruebaSeleccionHorario() {
        try {
            director.Bus1PisoSimple(builder, "Matutino");
            director.Bus1PisoSimple(builder, "Nocturno");
            director.Bus1PisoSimple(builder, "Diurno");
        } catch (NoExisteHorarioException e) {
            System.out.println(e.getMessage());
        }
    }
}

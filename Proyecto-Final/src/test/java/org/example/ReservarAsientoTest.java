package org.example;

import org.Logica.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test para comprobar que funciona la reserva de asientos del bus y para probar la excepción para los asientos ocupados
 */
class ReservarAsientoTest {
    /** Director para crear buses */
    private final Director director = new Director();
    /** Builder para asignar al director */
    private final BusBuilder builder = new BusBuilder();
    /** Bus de 1 piso de prueba */
    private Bus bus1;
    /** Bus de 2 pisos de prueba */
    private Bus bus2;

    /**
     * Crea los buses de prueba
     */
    @BeforeEach
    void setUp() {
        director.Bus1PisoSimple(builder, "Matutino");
        bus1 = builder.getBus();
        director.Bus2PisosMedio(builder, "Nocturno");
        bus2 = builder.getBus();
    }

    /**
     * Reserva asientos y luego comprueba que estén realmente reservados
     */
    @Test
    void reservarAsientos() {
        try {
            bus1.reservarAsiento("A",3);
            bus1.reservarAsiento("B", 6);
            bus1.reservarAsiento("D", 1);
            bus1.reservarAsiento("C", 2);

            bus2.reservarAsiento("C", 14);
            bus2.reservarAsiento("A", 1);
            bus2.reservarAsiento("D", 7);
            bus2.reservarAsiento("C", 16);
        } catch (AsientoOcupadoException e) {
            System.out.println(e.getMessage());
        }
        assertFalse(bus1.revisarAsiento("A", 3));
        assertFalse(bus1.revisarAsiento("D", 1));
        assertFalse(bus1.revisarAsiento("C", 2));
        assertFalse(bus2.revisarAsiento("A", 1));
        assertFalse(bus2.revisarAsiento("C", 16));
        assertFalse(bus2.revisarAsiento("D", 7));
    }

    /**
     * Reserva asientos y luego trata de reservar un asiento ocupado, entonces maneja la excepción y comprueba que los otros si hayan resultado bien
     */
    @Test
    void reservarAsientoOcupado() {
        try {
            bus1.reservarAsiento("A", 6);
            bus1.reservarAsiento("B", 5);
            bus1.reservarAsiento("A", 6);
            bus1.reservarAsiento("C", 7);
        } catch (AsientoOcupadoException e) {
            System.out.println(e.getMessage());
        }
        assertFalse(bus1.revisarAsiento("A", 6));
        assertFalse(bus1.revisarAsiento("B", 5));
    }
}

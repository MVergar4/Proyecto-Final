package org.example;

import org.Logica.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReservarAsientoTest {
    private final Director director = new Director();
    private final BusBuilder builder = new BusBuilder();
    private Bus bus1;
    private Bus bus2;

    @BeforeEach
    void setUp() {
        director.Bus1PisoSimple(builder, "Matutino");
        bus1 = builder.getBus();
        director.Bus2PisosMedio(builder, "Nocturno");
        bus2 = builder.getBus();
    }
    @Test
    void reservarAsientos() {
        try {
            bus1.reservarAsiento("A",3);
            bus1.reservarAsiento("B", 6);
            bus1.reservarAsiento("D", 1);
            bus1.reservarAsiento("C", 7);
            bus1.reservarAsiento("A", 5);
            bus1.reservarAsiento("C", 8);
            bus1.reservarAsiento("C", 2);

            bus2.reservarAsiento("C", 14);
            bus2.reservarAsiento("A", 1);
            bus2.reservarAsiento("B", 8);
            bus2.reservarAsiento("B", 4);
            bus2.reservarAsiento("D", 7);
            bus2.reservarAsiento("A", 11);
            bus2.reservarAsiento("C", 16);
        } catch (AsientoOcupadoException e) {
            System.out.println(e.getMessage());
        }
    }

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
    }
}

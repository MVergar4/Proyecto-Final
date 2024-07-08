package org.Logica;

public class RecorridoConcepcion extends Recorrido {
    public RecorridoConcepcion() {
        super("Concepcion");

        Director d = new Director();
        BusBuilder b = new BusBuilder();

        d.Bus1PisoMedio(b, "Matutino");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoSimple(b, "Mediodia");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoMedio(b, "Mediodia");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoSimple(b, "Tarde");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoMedio(b, "Tarde");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoMedio(b,  "Nocturno");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoDeluxe(b, "Nocturno");
        busesDisponibles.add(b.getBus());

        d.Bus2PisosMedio(b, "Matutino");
        busesDisponibles.add(b.getBus());
        d.Bus2PisosDeluxe(b, "Matutino");
        busesDisponibles.add(b.getBus());
        d.Bus2PisosMedio(b, "Nocturno");
        busesDisponibles.add(b.getBus());
        d.Bus2PisosDeluxe(b, "Nocturno");
        busesDisponibles.add(b.getBus());
    }
}

package org.Logica;

public class RecorridoSantiago extends Recorrido {
    public RecorridoSantiago() {
        super("Santiago");

        Director d = new Director();
        BusBuilder b = new BusBuilder();

        d.Bus1PisoMedio(b, "Matutino");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoDeluxe(b, "Matutino");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoMedio(b, "Mediodia");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoMedio(b, "Tarde");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoMedio(b, "Nocturno");
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

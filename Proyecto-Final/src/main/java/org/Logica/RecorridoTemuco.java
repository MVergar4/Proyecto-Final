package org.Logica;

public class RecorridoTemuco extends Recorrido {
    public RecorridoTemuco() {
        super("Temuco");

        Director d = new Director();
        BusBuilder b = new BusBuilder();

        d.Bus1PisoSimple(b, "Matutino");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoMedio(b, "Matutino");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoSimple(b, "Mediodia");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoSimple(b, "Tarde");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoSimple(b, "Nocturno");
        busesDisponibles.add(b.getBus());

        d.Bus2PisosSimple(b, "Matutino");
        busesDisponibles.add(b.getBus());
        d.Bus2PisosSimple(b, "Nocturno");
        busesDisponibles.add(b.getBus());
    }
}

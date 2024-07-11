package org.Logica;

public class RecorridoChillan extends Recorrido {
    public RecorridoChillan() {
        super("Chillan");

        Director d = new Director();
        BusBuilder b = new BusBuilder();

        //d.Bus1PisoSimple(b, "Matutino");
        //busesDisponibles.add(b.getBus());
        d.Bus1PisoMedio(b, "Matutino");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoSimple(b, "Mediodia");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoSimple(b, "Tarde");
        busesDisponibles.add(b.getBus());
        d.Bus1PisoSimple(b, "Nocturno");
        busesDisponibles.add(b.getBus());
        //d.Bus1PisoMedio(b, "Nocturno");
        //busesDisponibles.add(b.getBus());

        d.Bus2PisosSimple(b, "Matutino");
        busesDisponibles.add(b.getBus());
        //d.Bus2PisosMedio(b, "Matutino");
        //busesDisponibles.add(b.getBus());
        d.Bus2PisosMedio(b, "Nocturno");
        busesDisponibles.add(b.getBus());
    }
}

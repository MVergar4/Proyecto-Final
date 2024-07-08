package org.Logica;

/**
 * Subclase de recorrido que representa los buses que van hacia Chillán
 */
public class RecorridoChillan extends Recorrido {
    /**
     * Constructor que decide cuántos buses y de qué tipo tendrán los buses que se dirigen a Chillán
     */
    public RecorridoChillan() {
        super("Chillan");

        Director d = new Director();
        BusBuilder b = new BusBuilder();

        try {
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
            d.Bus1PisoMedio(b, "Nocturno");
            busesDisponibles.add(b.getBus());

            d.Bus2PisosSimple(b, "Matutino");
            busesDisponibles.add(b.getBus());
            d.Bus2PisosMedio(b, "Matutino");
            busesDisponibles.add(b.getBus());
            d.Bus2PisosMedio(b, "Nocturno");
            busesDisponibles.add(b.getBus());
        } catch (NoExisteHorarioException e) {
            System.out.println(e.getMessage());
        }
    }
}

package org.Logica;

/**
 * Subclase de recorrido que representa los buses que van hacia Temuco
 */
public class RecorridoTemuco extends Recorrido {
    /**
     * Constructor que decide cuántos buses y de qué tipo tendrán los buses que se dirigen a Temuco
     */
    public RecorridoTemuco() {
        super("Temuco");

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

            d.Bus2PisosSimple(b, "Matutino");
            busesDisponibles.add(b.getBus());
            d.Bus2PisosSimple(b, "Nocturno");
            busesDisponibles.add(b.getBus());
        } catch (NoExisteHorarioException e) {
            System.out.println(e.getMessage());
        }
    }
}

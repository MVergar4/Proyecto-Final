package org.Logica;

/**
 * Subclase de recorrido que representa los buses que van hacia Concepción
 */
public class RecorridoConcepcion extends Recorrido {
    /**
     * Constructor que decide cuántos buses y de qué tipo tendrán los buses que se dirigen a Concepción
     */
    public RecorridoConcepcion() {
        super("Concepcion");

        Director d = new Director();
        BusBuilder b = new BusBuilder();

        try {
            d.Bus1PisoMedio(b, "Matutino");
            busesDisponibles.add(b.getBus());
            //d.Bus1PisoSimple(b, "Mediodia");
            //busesDisponibles.add(b.getBus());
            d.Bus1PisoMedio(b, "Mediodia");
            busesDisponibles.add(b.getBus());
            d.Bus1PisoSimple(b, "Tarde");
            busesDisponibles.add(b.getBus());
            //d.Bus1PisoMedio(b, "Tarde");
            //busesDisponibles.add(b.getBus());
            //d.Bus1PisoMedio(b,  "Nocturno");
            //busesDisponibles.add(b.getBus());
            d.Bus1PisoDeluxe(b, "Nocturno");
            busesDisponibles.add(b.getBus());

            d.Bus2PisosMedio(b, "Matutino");
            busesDisponibles.add(b.getBus());
            //d.Bus2PisosDeluxe(b, "Matutino");
            //busesDisponibles.add(b.getBus());
            //d.Bus2PisosMedio(b, "Nocturno");
            //busesDisponibles.add(b.getBus());
            d.Bus2PisosDeluxe(b, "Nocturno");
            busesDisponibles.add(b.getBus());
        } catch (NoExisteHorarioException e) {
            System.out.println(e.getMessage());
        }
    }
}

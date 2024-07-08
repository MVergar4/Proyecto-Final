package org.Logica;

/**
 * Clase que contiene distintas formas de crear buses para poder utilizar
 */
public class Director {
    /**
     * Constructor por defecto
     */
    public Director() {}

    /**
     * Crea un bus de 1 piso con asientos simples,
     * muchos asientos básicos y algunos asientos medios
     * @param b builder
     * @param horario horario en que partirá el bus
     */
    public void Bus1PisoSimple(Builder b, String horario) throws NoExisteHorarioException {
        b.reset();
        b.setAsientos(20, 12, 0);
        switch (horario) {
            case "Matutino": b.setHorario("06:00"); break;
            case "Mediodia": b.setHorario("12:00"); break;
            case "Tarde": b.setHorario("18:00"); break;
            case "Nocturno": b.setHorario("00:00"); break;
            default: throw new NoExisteHorarioException("El horario seleccionado no existe");
        }
    }

    /**
     * Crea un bus de 2 pisos con asientos simples,
     * muchos asientos básicos y algunos asientos medios
     * @param b builder
     * @param horario horario en que partirá el bus
     */
    public void Bus2PisosSimple(Builder b, String horario) throws NoExisteHorarioException {
        b.reset();
        b.setAsientos(40, 24, 0);
        switch (horario) {
            case "Matutino": b.setHorario("06:00"); break;
            case "Mediodia": b.setHorario("12:00"); break;
            case "Tarde": b.setHorario("18:00"); break;
            case "Nocturno": b.setHorario("00:00"); break;
            default: throw new NoExisteHorarioException("El horario seleccionado no existe");
        }
    }

    /**
     * Crea un bus de 1 piso con asientos variados,
     * varios asientos básicos, algunos asientos medios y unos pocos asientos buenos
     * @param b builder
     * @param horario horario en que partirá el bus
     */
    public void Bus1PisoMedio(Builder b, String horario) throws NoExisteHorarioException {
        b.reset();
        b.setAsientos(16, 12, 4);
        switch (horario) {
            case "Matutino": b.setHorario("06:00"); break;
            case "Mediodia": b.setHorario("12:00"); break;
            case "Tarde": b.setHorario("18:00"); break;
            case "Nocturno": b.setHorario("00:00"); break;
            default: throw new NoExisteHorarioException("El horario seleccionado no existe");
        }
    }

    /**
     * Crea un bus de 2 pisos con asientos variados,
     * varios asientos básicos, algunos asientos medios y unos pocos asientos buenos
     * @param b builder
     * @param horario horario en que partirá el bus
     */
    public void Bus2PisosMedio(Builder b, String horario) throws NoExisteHorarioException {
        b.reset();
        b.setAsientos(32, 20, 12);
        switch (horario) {
            case "Matutino": b.setHorario("06:00"); break;
            case "Mediodia": b.setHorario("12:00"); break;
            case "Tarde": b.setHorario("18:00"); break;
            case "Nocturno": b.setHorario("00:00"); break;
            default: throw new NoExisteHorarioException("El horario seleccionado no existe");
        }
    }

    /**
     * Crea un bus de 1 piso con asientos de buena calidad,
     * sin asientos básicos, la mitad de asientos medios y la otra mitad de asientos buenos
     * @param b builder
     * @param horario horario en que partirá el bus
     */
    public void Bus1PisoDeluxe(Builder b, String horario) throws NoExisteHorarioException {
        b.reset();
        b.setAsientos(0, 16, 16);
        switch (horario) {
            case "Matutino": b.setHorario("06:00"); break;
            case "Mediodia": b.setHorario("12:00"); break;
            case "Tarde": b.setHorario("18:00"); break;
            case "Nocturno": b.setHorario("00:00"); break;
            default: throw new NoExisteHorarioException("El horario seleccionado no existe");
        }
    }

    /**
     * Crea un bus de 2 pisos con asientos de buena calidad,
     * sin asientos básicos, la mitad de asientos medios y la otra mitad de asientos buenos
     * @param b builder
     * @param horario horario en que partirá el bus
     */
    public void Bus2PisosDeluxe(Builder b, String horario) throws NoExisteHorarioException {
        b.reset();
        b.setAsientos(0, 32, 32);
        switch (horario) {
            case "Matutino": b.setHorario("06:00"); break;
            case "Mediodia": b.setHorario("12:00"); break;
            case "Tarde": b.setHorario("18:00"); break;
            case "Nocturno": b.setHorario("00:00"); break;
            default: throw new NoExisteHorarioException("El horario seleccionado no existe");
        }
    }
}

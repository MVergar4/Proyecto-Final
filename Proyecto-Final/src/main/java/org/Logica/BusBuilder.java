package org.Logica;

/**
 * Implementación de Builder como dicta el patrón Builder
 */
public class BusBuilder implements Builder {
    /** Bus que se construirá a continuación */
    private Bus bus;

    /**
     * Constructor por defecto que usa reset para crear una instancia de Bus
     */
    public BusBuilder() {
        this.reset();
    }

    /**
     * Reinicia el Bus guardado para crear distintos objetos
     */
    @Override
    public void reset() {
        this.bus = new Bus();
    }

    /**
     * Crea los asientos del bus,
     * la cantidad de cada una de las categorías de asientos deben ser múltiplos de 4,
     * la suma de todos los asientos debe ser 32 para un bus de 1 piso o 64 para uno de 2 pisos
     * @param semi cantidad de AsientoSemiCama
     * @param salon cantidad de AsientoSalonCama
     * @param suite cantidad de AsientoSuiteCama
     */
    @Override
    public void setAsientos(int semi, int salon, int suite) {
        int total = semi + salon + suite;
        for(int j=0;j<4;j++) {
            String f = "";
            switch (j){
                case 0: f="A";break;
                case 1: f="B";break;
                case 2: f="C";break;
                case 3: f="D";break;
                default: break;
            }
            for (int i = 1; i <= total / 4; i++) {
                if (i <= (semi / 4)) {
                    this.bus.getAsientos().add(new AsientoSemiCama(f, i));
                } else if (i <= ((salon / 4) + (semi / 4))) {
                    this.bus.getAsientos().add(new AsientoSalonCama(f, i));
                } else {
                    this.bus.getAsientos().add(new AsientoSuiteCama(f, i));
                }
            }
        }
    }

    /**
     * Le asigna la hora a la que parte el bus
     * @param hora hora en formato de 24 horas
     */
    @Override
    public void setHorario(String hora) {
        this.bus.setHorario(hora);
    }

    /**
     * Retorna la referencia al bus que se creó
     * @return bus
     */
    public Bus getBus() {
        Bus temp = this.bus;
        this.reset();
        return temp;
    }
}

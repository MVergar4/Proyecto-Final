package org.Logica;

/**
 * Clase que modela un asiento de un autobus
 */
public abstract class Asiento {
    /** precio del asiento */
    protected int precio;
    /** almacena si el asiento está disponible o si está ocupado */
    private boolean disponible;
    /** coordenada del asiento con letra y numero */
    private final String asiento;

    /**
     * Constructor que establece la disponibilidad del asiento por defecto y la coordenada del asiento
     * @param f letra de la columna
     * @param n numero de fila
     */
    public Asiento(String f, int n) {
        this.disponible = true;
        this.asiento = f + n;
    }

    /**
     * Devuelve un valor de verdad dependiendo de si el asiento está disponible o no
     * @return disponibilidad
     */
    public boolean estaDisponible() {
        return disponible;
    }

    /**
     * Cambia la disponibilidad del asiento a ocupado
     */
    public void ocuparAsiento() {
        disponible = false;
    }

    /**
     * Entrega la coordenada del asiento
     * @return coordenada letra + número
     */
    public String getAsiento(){
        return asiento;
    }

    /**
     * Devuelve el precio del asiento
     * @return precio
     */
    public int getPrecio(){
        return precio;
    }

    /**
     * Modificación del método para mostrar la coordenada del asiento
     * @return coordenada
     */
    @Override
    public String toString(){
        return "Asiento: "+asiento;
    }
}

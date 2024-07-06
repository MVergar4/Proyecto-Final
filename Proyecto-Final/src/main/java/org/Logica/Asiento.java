package org.Logica;

public abstract class Asiento {
    protected int precio;
    private boolean disponible;
    private String fila;
    private Bus bus;
    public Asiento(Bus b) {
        this.disponible = true;
        this.bus=b;
    }
    public boolean estaDisponible() {
        return disponible;
    }
    public void ocuparAsiento() {
        disponible = false;
    }
    public String getFila(){
        return fila;
    }
    public int getPrecio(){
        return precio;
    }
    public Bus getBus(){
        return bus;
    }
}

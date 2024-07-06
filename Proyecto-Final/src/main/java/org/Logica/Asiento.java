package org.Logica;

public abstract class Asiento {
    protected int precio;
    private boolean disponible;
    private String fila;
    public Asiento(String s) {
        this.disponible = true;
        this.fila = s;
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
}

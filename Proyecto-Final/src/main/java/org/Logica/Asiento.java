package org.Logica;

public abstract class Asiento {
    protected int precio;
    private boolean disponible;
    private String fila;
    public Asiento(String s) {
        this.disponible = true;
        this.fila = s;
    }
    public boolean estaDisonible() {
        return disponible;
    }
    public void ocuparAsiento() {
        disponible = false;
    }
}

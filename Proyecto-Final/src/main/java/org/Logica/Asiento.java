package org.Logica;

public abstract class Asiento {
    protected int precio;
    private boolean disponible;
    public Asiento() {
        this.disponible = true;
    }
    public boolean estaDisponible() {
        return disponible;
    }
    public void ocuparAsiento() {
        disponible = false;
    }
}

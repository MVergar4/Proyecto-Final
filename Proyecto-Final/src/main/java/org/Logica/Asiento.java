package org.Logica;

public abstract class Asiento {
    protected int precio;
    private boolean disponible;
    private final String asiento;
    public Asiento(String f, int n) {
        this.disponible = true;
        this.asiento = f + n;
    }
    public boolean estaDisponible() {
        return disponible;
    }
    public void ocuparAsiento() {
        disponible = false;
    }
    public String getAsiento(){
        return asiento;
    }
    public int getPrecio(){
        return precio;
    }

    @Override
    public String toString(){
        return "Asiento: "+asiento;
    }
}

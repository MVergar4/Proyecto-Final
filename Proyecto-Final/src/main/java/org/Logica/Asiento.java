package org.Logica;

public abstract class Asiento {
    protected int precio;
    private boolean disponible;
    private String fila;
    private int numFila;
    private Bus bus;
    public Asiento(Bus b,String f,int n) {
        this.disponible = true;
        this.bus=b;
        this.fila=f;
        this.numFila=n;
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

    public int getNumFila() {
        return numFila;
    }

    @Override
    public String toString(){
        return "Asiento: "+fila+numFila;
    }
}

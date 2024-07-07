package org.Logica;

public abstract class Asiento {
    protected int precio;
    private boolean disponible;
    private String asiento;
    private Bus bus;
    public Asiento(Bus b,String f,int n) {
        this.disponible = true;
        this.bus=b;
        this.asiento=f+Integer.toString(n);
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
    public Bus getBus(){
        return bus;
    }

    @Override
    public String toString(){
        return "Asiento: "+asiento;
    }
}

package org.Logica;

public class BoletoBus {
    private String numAsiento;
    private int boleta;
    public BoletoBus(Asiento a){
        this.numAsiento=a.getFila();
        this.boleta=a.getPrecio();
    }

    @Override
    public String toString() {
        return "Asiento: "+numAsiento+"\nprecio pagado: "+boleta;
    }
}

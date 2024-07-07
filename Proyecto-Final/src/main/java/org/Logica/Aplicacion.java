package org.Logica;

import java.util.ArrayList;
import java.util.Objects;

public class Aplicacion {
    private Asiento asientoSeleccionado;
    private ArrayList<BoletoBus> boletoBuses;
    private Recorrido santiago;
    private Recorrido temuco;
    private Recorrido chillan;
    private Recorrido concepcion;
    public Aplicacion(){
        boletoBuses=new ArrayList<>();
        santiago=new Recorrido("Santiago");
        temuco=new Recorrido("Temuco");
        chillan=new Recorrido("Chillan");
        concepcion=new Recorrido("Concepcion");
    }

    public Recorrido getRecorrido(String s) {
        try {
            if (Objects.equals(s, "Santiago")) {
                return santiago;
            } else if (Objects.equals(s, "Temuco")) {
                return temuco;
            } else if (Objects.equals(s, "Chillan")) {
                return chillan;
            } else if (Objects.equals(s, "Concepcion")) {
                return concepcion;
            } else{
                throw new NoExisteRecorridoException("No existe recorrido hacia: "+s);
            }
        } catch (NoExisteRecorridoException e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    public void comprarPasaje(){
        asientoSeleccionado.ocuparAsiento();
        boletoBuses.add(new BoletoBus(asientoSeleccionado));
    }

    public void setAsientoSeleccionado(Asiento asientoSeleccionado) {
        this.asientoSeleccionado = asientoSeleccionado;
    }
    public ArrayList<BoletoBus> getBoletoBuses(){
        return boletoBuses;
    }
}

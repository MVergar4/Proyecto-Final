package org.Logica;

import java.util.ArrayList;
import java.util.Objects;

public class Aplicacion {
    private Asiento asientoSeleccionado;
    private ArrayList<BoletoBus> boletoBuses;
    private Recorrido santiago;
    private Recorrido temuco;
    private Recorrido chillan;
    public Aplicacion(){
        boletoBuses=new ArrayList<>();
        santiago=new Recorrido("Santiago");
        temuco=new Recorrido("temuco");
        chillan=new Recorrido("chillan");
    }

    public Recorrido getRecorrido(String s) {
        if(Objects.equals(s, "santiago")){
            return santiago;
        } else if (Objects.equals(s, "temuco")) {
            return temuco;
        } else{
            return chillan;
        }
    }
    public BoletoBus comprarPasaje(){
        return new BoletoBus(asientoSeleccionado);
    }
}

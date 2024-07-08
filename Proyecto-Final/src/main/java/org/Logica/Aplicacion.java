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
        boletoBuses = new ArrayList<>();
        santiago = new RecorridoSantiago();
        temuco = new RecorridoTemuco();
        chillan = new RecorridoChillan();
        concepcion = new RecorridoConcepcion();
    }

    public Recorrido getRecorrido(String s) {
        try {
            return switch (s) {
                case "Santiago" -> santiago;
                case "Temuco" -> temuco;
                case "Chillan" -> chillan;
                case "Concepcion" -> concepcion;
                case null, default -> throw new NoExisteRecorridoException("No existe recorrido hacia: " + s);
            };
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

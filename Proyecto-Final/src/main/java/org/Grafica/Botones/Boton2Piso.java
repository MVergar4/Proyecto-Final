package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

/**
 * Subclase de Boton selecciona un bus de 2 pisos
 */
public class Boton2Piso extends Boton {
    /**
     * Constructor de la clase boton, la documentacion de los parametros es la misma en todas estas subclases boton
     * @param p
     * @param x
     * @param y
     * @param ancho
     * @param alto
     * @param nombre
     */
    public Boton2Piso(PantallaPrincipal p,int x,int y ,int ancho,int alto,String nombre){
        super(p,nombre,x,y,ancho,alto);
        setBackground(Color.BLUE);
        actionListener();
    }

    /**
     * setea el tipo de bus en 64, bus de 2 pisos con 64 asientos, y se asegura de que si el horario esta fuera de las 0hrs
     * y lass 6hrs, entonces se setea bus de 32 automaticamente ya que no hay disponibles en ese horario
     */
    public void actionListener() {
        this.addActionListener(e -> {
            if(Objects.equals(pantallaPrincipal.getHorario(), "00:00") || Objects.equals(pantallaPrincipal.getHorario(), "06:00")){
                pantallaPrincipal.setTipoBus(64);
            }else{
                pantallaPrincipal.setTipoBus(32);
                pantallaPrincipal.BusNoDisponible();
            }
        });
    }
}

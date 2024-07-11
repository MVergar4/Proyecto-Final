package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

/**
 * Boton para elegir bus de 1 piso subclase de boton
 */
public class Boton1Piso extends Boton {
    /**
     * Constructor que limita el boton y asigna color y agrega el actionListener, ademas agrega el action listener
     * @param p pantalla principal
     * @param x coordenada x
     * @param y coordenada y
     * @param ancho ancho del boton
     * @param alto alto del boton
     * @param nombre nombre del boton
     */
    public Boton1Piso(PantallaPrincipal p,int x,int y,int ancho,int alto,String nombre){
        super(p,nombre,x,y,ancho,alto);
        setBackground(Color.BLUE);
        actionListener();
    }

    /**
     * action listener que setea el tipo de bus en 32, que es el numero de asientos de un bus de 1 piso
     */
    public void actionListener() {
        this.addActionListener(e -> {
            pantallaPrincipal.setTipoBus(32);
        });
    }
}

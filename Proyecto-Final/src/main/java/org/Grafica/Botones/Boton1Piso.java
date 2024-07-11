package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class Boton1Piso extends Boton {
    public Boton1Piso(PantallaPrincipal p,int x,int y,int ancho,int alto,String nombre){
        super(p,nombre,x,y,ancho,alto);
        setBackground(Color.BLUE);
        actionListener();
    }
    public void actionListener() {
        this.addActionListener(e -> {
            pantallaPrincipal.setTipoBus(32);
        });
    }
}

package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Boton2Piso extends Boton {
    public Boton2Piso(PantallaPrincipal p,int x,int y ,int ancho,int alto,String nombre){
        super(p,nombre,x,y,ancho,alto);
        setBackground(Color.BLUE);
        actionListener();
    }
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

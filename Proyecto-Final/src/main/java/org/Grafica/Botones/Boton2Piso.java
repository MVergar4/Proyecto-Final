package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class Boton2Piso extends JRadioButton {
    private PantallaPrincipal p;
    public Boton2Piso(PantallaPrincipal p,int x,int y ,int ancho,int alto,String nombre){
        super(nombre);
        this.p=p;
        setBounds(x,y,ancho,alto);
        setBackground(Color.BLUE);
        p.add(this);
        actionListener();
    }
    public void actionListener() {
        this.addActionListener(e -> {
            if(Objects.equals(p.getHorario(), "00:00") || Objects.equals(p.getHorario(), "06:00")){
                p.setTipoBus(64);
            }else{
                p.setTipoBus(32);
                p.BusNoDisponible();
            }
        });
    }
}

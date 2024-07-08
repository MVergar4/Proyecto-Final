package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class Boton1Piso extends JRadioButton {
    private PantallaPrincipal p;
    public Boton1Piso(PantallaPrincipal p,int x,int y,int ancho,int alto,String nombre){
        super(nombre);
        this.p=p;
        setBounds(x,y,ancho,alto);
        setBackground(Color.BLUE);
        p.add(this);
        actionListener();
    }
    public void actionListener() {
        this.addActionListener(e -> {
            p.setTipoBus(32);
        });
    }
}

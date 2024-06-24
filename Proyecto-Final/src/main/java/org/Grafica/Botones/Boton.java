package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;

public abstract class Boton extends JButton {
    public Boton(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto){
        super(nombre);
        setBounds(x,y,ancho,alto);
        p.setLayout(null);
        p.add(this);
    }
    public abstract void actionListener();
}


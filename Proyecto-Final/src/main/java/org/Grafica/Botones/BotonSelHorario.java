package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class BotonSelHorario extends Boton{
    public BotonSelHorario(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto){
        super(p,nombre,x,y,ancho,alto);
        setFont(new Font("Arial",Font.BOLD,30));
        setBackground(new Color(0,200,255));
        actionListener();
    }

    @Override
    public void actionListener() {
        this.addActionListener(e -> {

        });
    }
}

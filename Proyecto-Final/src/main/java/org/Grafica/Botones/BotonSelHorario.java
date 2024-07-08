package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class BotonSelHorario extends Boton{
    private CampoHoraSel campoHoraSel;
    public BotonSelHorario(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto,CampoHoraSel campoHoraSel){
        super(p,nombre,x,y,ancho,alto);
        this.campoHoraSel=campoHoraSel;
        setFont(new Font("Arial",Font.BOLD,30));
        setBackground(new Color(0,200,255));
        actionListener();
    }

    @Override
    public void actionListener() {
        this.addActionListener(e -> {
            campoHoraSel.setText(this.getText());
        });
    }
}

package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class CampoHoraSel extends JTextField {
    public CampoHoraSel(PantallaPrincipal p, int x,int y, int ancho, int alto){
        this.setBounds(x,y,ancho,alto);
        this.setBackground(new Color(0,200,255));
        this.setHorizontalAlignment(0);
        this.setEditable(false);
        this.setFont(new Font("Arial",Font.BOLD,20));
        p.add(this);
    }
}

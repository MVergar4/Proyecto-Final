package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class CampoHoraSel extends JTextField {
    public CampoHoraSel(PantallaPrincipal p, int x,int y, int ancho, int alto){
        this.setBounds(x,y,ancho,alto);
        this.setBackground(Color.RED);
        this.setHorizontalAlignment(0);
        this.setEditable(false);
        this.setFont(new Font("Arial",Font.BOLD,20));
        p.add(this);
    }
}

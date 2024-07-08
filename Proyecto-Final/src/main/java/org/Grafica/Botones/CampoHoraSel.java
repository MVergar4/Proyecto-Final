package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class CampoHoraSel extends JTextField {
    public CampoHoraSel(PantallaPrincipal p, int x,int y, int ancho, int alto){
        setBounds(x,y,ancho,alto);
        setBackground(Color.RED);
        setHorizontalAlignment(0);
        setFont(new Font("Arial",Font.BOLD,20));
        p.add(this);
    }
}

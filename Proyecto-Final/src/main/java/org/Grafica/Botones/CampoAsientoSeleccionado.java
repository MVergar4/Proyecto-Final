package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class CampoAsientoSeleccionado extends JTextField {
    public CampoAsientoSeleccionado(PantallaPrincipal p, int x, int y, int ancho, int alto){
        this.setBounds(x,y,ancho,alto);
        this.setBackground(new Color(255,0,0));
        this.setEditable(false);
        this.setHorizontalAlignment(0);
        this.setFont(new Font("Arial",Font.BOLD,30));
        p.add(this);

    }
}

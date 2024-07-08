package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class CampoAsientoSeleccionado extends JTextField {
    public CampoAsientoSeleccionado(PantallaPrincipal p, int x, int y, int ancho, int alto){
        setBounds(x,y,ancho,alto);
        setBackground(new Color(255,0,0));
        setEditable(false);
        setHorizontalAlignment(0);
        setFont(new Font("Arial",Font.BOLD,30));
        p.add(this);

    }
}

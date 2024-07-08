package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class CampoIngresarCiudad extends JTextField {
    public CampoIngresarCiudad(PantallaPrincipal p,int x, int y, int ancho,int alto){
        setBounds(x,y,ancho,alto);
        setFont(new Font("Arial",Font.BOLD,14));
        p.add(this);
    }
}

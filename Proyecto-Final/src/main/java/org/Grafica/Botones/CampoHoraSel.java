package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

/**
 * Indica la hora seleccionada
 */

public class CampoHoraSel extends JTextField {
    /**
     * Constructor del Campo de texto,setea el corol, la fuente y no deja que sea editable
     * @param p
     * @param x
     * @param y
     * @param ancho
     * @param alto
     */
    public CampoHoraSel(PantallaPrincipal p, int x,int y, int ancho, int alto){
        this.setBounds(x,y,ancho,alto);
        this.setBackground(new Color(0,200,255));
        this.setHorizontalAlignment(0);
        this.setEditable(false);
        this.setFont(new Font("Arial",Font.BOLD,20));
        p.add(this);
    }
}

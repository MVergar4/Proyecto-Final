package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;


/**
 * Sirve para mostrar el asiento seleccionado
 */
public class CampoAsientoSeleccionado extends JTextField {
    /**
     * Constructor del Campo de texto,setea el corol, la fuente y no deja que sea editable
     * @param p pantalla principal
     * @param x coordenada x
     * @param y coordenada y
     * @param ancho ancho del campo
     * @param alto alto del campo
     */
    public CampoAsientoSeleccionado(PantallaPrincipal p, int x, int y, int ancho, int alto){
        this.setBounds(x,y,ancho,alto);
        this.setBackground(new Color(255,0,0));
        this.setEditable(false);
        this.setHorizontalAlignment(0);
        this.setFont(new Font("Arial",Font.BOLD,30));
        p.add(this);
    }
}

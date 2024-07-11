package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

/**
 * Campo que muestra las caracteristicas del asiento elegido
 */
public class CampoCaracteristicas extends JTextArea {
    /**
     * Constructor del Campo de texto,setea el corol, la fuente y no deja que sea editable
     * @param p Pantalla principal
     * @param x coordenada x
     * @param y coordenada y
     * @param ancho ancho del campo
     * @param alto alto del boton
     */
    public CampoCaracteristicas(PantallaPrincipal p, int x, int y, int ancho, int alto) {
        this.setBounds(x, y, ancho, alto);
        this.setBackground(new Color(255, 0, 0));
        this.setEditable(false);
        this.setFont(new Font("Arial", Font.BOLD, 13));
        p.add(this);
    }
}

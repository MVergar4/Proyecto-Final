package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

/**
 * Campo donde se escribe la ciudad
 */

public class CampoIngresarCiudad extends JTextField {
    /**
     * Constructor que setea la fuente de la letra, los limites del campo y agrega el campoo a la pantalla
     * @param p
     * @param x
     * @param y
     * @param ancho
     * @param alto
     */
    public CampoIngresarCiudad(PantallaPrincipal p,int x, int y, int ancho,int alto){
        setBounds(x,y,ancho,alto);
        setFont(new Font("Arial",Font.BOLD,14));
        p.add(this);
    }
}

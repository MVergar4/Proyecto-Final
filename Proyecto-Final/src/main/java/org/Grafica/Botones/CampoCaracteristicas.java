package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

public class CampoCaracteristicas extends JTextArea {
    public CampoCaracteristicas(PantallaPrincipal p, int x, int y, int ancho, int alto) {
        this.setBounds(x, y, ancho, alto);
        this.setBackground(new Color(255, 0, 0));
        this.setEditable(false);
        this.setFont(new Font("Arial", Font.BOLD, 13));
        p.add(this);
    }
}

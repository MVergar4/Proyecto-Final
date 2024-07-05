package org.Grafica;

import org.Logica.Aplicacion;

import javax.swing.*;
import java.awt.*;

public class PantallaAutobuses extends JPanel {
    private Aplicacion aplicacion;
    public PantallaAutobuses(Color color, Aplicacion a) {
        super();
        setBackground(color);
        aplicacion=a;
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, 400, 10);
        g.fillRect(0, 790, 400, 10);
        g.fillRect(0, 0, 10, 800);
        g.fillRect(390, 0, 10, 800);
    }
}

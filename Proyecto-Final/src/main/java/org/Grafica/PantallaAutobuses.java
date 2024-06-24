package org.Grafica;

import javax.swing.*;
import java.awt.*;

public class PantallaAutobuses extends JPanel {
    public PantallaAutobuses(Color color) {
        super();
        setBackground(color);
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

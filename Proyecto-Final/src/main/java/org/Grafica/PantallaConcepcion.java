package org.Grafica;

import javax.swing.*;
import java.awt.*;

public class PantallaConcepcion extends JPanel {
    public PantallaConcepcion() {
        super();
        setBackground(new Color(163, 216, 241));
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        G.setColor(new Color(0, 0, 0));
        G.fillRect(0, 0, 400, 10);
        G.fillRect(0, 790, 400, 10);
        G.fillRect(0, 0, 10, 800);
        G.fillRect(390, 0, 10, 800);
    }
}

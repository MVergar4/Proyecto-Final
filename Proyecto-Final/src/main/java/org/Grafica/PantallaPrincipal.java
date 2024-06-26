package org.Grafica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PantallaPrincipal extends JPanel {
    private PantallaAutobuses concepcion;
    private PantallaAutobuses temuco;
    private PantallaAutobuses chillan;
    private PantallaAutobuses santiago;
    public PantallaPrincipal(){
        super();
        this.setLayout(null);
        setBackground(new Color(30, 31, 34));

        concepcion = new PantallaAutobuses(new Color(163, 216, 241));
        temuco = new PantallaAutobuses(new Color(255, 255, 185));
        chillan = new PantallaAutobuses(new Color(255, 191, 213));
        santiago = new PantallaAutobuses(new Color(255, 170, 113));

        concepcion.setBounds(0, 0, 400, 800);
        this.add(concepcion);
        temuco.setBounds(390, 0, 400, 800);
        this.add(temuco);
        chillan.setBounds(780, 0, 400, 800);
        this.add(chillan);

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                remove(concepcion);
                santiago.setBounds(0, 0, 400, 800);
                add(santiago);
                repaint();
            }
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
    }
}

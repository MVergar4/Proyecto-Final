package org.Grafica;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JPanel {
    private PantallaAutobuses concepcion;
    private PantallaAutobuses temuco;
    private PantallaAutobuses chillan;
    public PantallaPrincipal(){
        super();
        this.setLayout(null);
        setBackground(new Color(30, 31, 34));

        concepcion = new PantallaAutobuses(new Color(163, 216, 241));
        concepcion.setBounds(0, 0, 400, 800);
        this.add(concepcion);
        temuco = new PantallaAutobuses(new Color(255, 255, 185));
        temuco.setBounds(390, 0, 400, 800);
        this.add(temuco);
        chillan = new PantallaAutobuses(new Color(255, 191, 213));
        chillan.setBounds(780, 0, 400, 800);
        this.add(chillan);
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
    }
}

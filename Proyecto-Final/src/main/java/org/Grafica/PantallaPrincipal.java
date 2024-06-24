package org.Grafica;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JPanel {
    private PantallaConcepcion concepcion;
    private PantallaTemuco temuco;
    private PantallaChillan chillan;
    public PantallaPrincipal(){
        super();
        this.setLayout(null);
        setBackground(new Color(30, 31, 34));

        concepcion = new PantallaConcepcion();
        concepcion.setBounds(0, 0, 400, 800);
        this.add(concepcion);
        temuco = new PantallaTemuco();
        temuco.setBounds(400, 0, 400, 800);
        this.add(temuco);
        chillan = new PantallaChillan();
        chillan.setBounds(800, 0, 400, 800);
        this.add(chillan);
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
    }
}

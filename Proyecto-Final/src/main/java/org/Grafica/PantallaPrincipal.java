package org.Grafica;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JPanel {
    private PantallaConcepcion concepcion;
    public PantallaPrincipal(){
        super();
        this.setLayout(null);
        setBackground(Color.darkGray);
        concepcion = new PantallaConcepcion();
        concepcion.setBounds(0, 0, 400, 800);
        this.add(concepcion);
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
    }
}

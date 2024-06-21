package org.Grafica;

import javax.swing.*;
import java.awt.*;

public class PantallaPrincipal extends JPanel {
    private PantallaConcepcion pantallaConcepcion;
    public PantallaPrincipal(){
        super();
        setLayout(null);
        setBackground(Color.darkGray);
        pantallaConcepcion = new PantallaConcepcion();
        pantallaConcepcion.setBounds(0, 0, 500, 750);
        this.add(pantallaConcepcion);
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
    }
}

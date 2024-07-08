package org.Grafica;

import org.Grafica.Botones.BotonSeleccionar;
import org.Logica.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PantallaAutobuses extends JPanel {
    private Bus busAsociado;
    private ArrayList<BotonSeleccionar> botonesSeleccionar;
    private PantallaPrincipal pantallaPrincipal;
    public PantallaAutobuses(Color color, Bus bus,PantallaPrincipal p) {
        super();
        setBounds(200,0,400,800);
        setBackground(color);
        botonesSeleccionar=new ArrayList<>();
        this.busAsociado=bus;
        this.pantallaPrincipal=p;
        addBotonesSeleccionar();
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
    public Bus getBusSeleccionado(){return busAsociado;}
    public void setBusSeleccionado(Bus busSeleccionado) {this.busAsociado = busSeleccionado;}

    public void addBotonesSeleccionar() {
        BotonSeleccionar boton;
        Asiento asiento;
        System.out.println(busAsociado.getAsientos().size());
        for(int j=0;j<4;j++) {
            if(busAsociado instanceof Bus1Piso) {
                for (int i = 0; i < busAsociado.getAsientos().size() / 4; i++) {
                    if (j < 2) {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        boton = new BotonSeleccionar(this, asiento, 30 + (j * 80), 30 + (i * 30), 60, 40);
                        botonesSeleccionar.add(boton);
                    } else {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        boton = new BotonSeleccionar(this, asiento, 70 + (j * 80), 30 + (i * 30), 60, 40);
                        botonesSeleccionar.add(boton);
                    }
                }
            } else {
                for (int i = 0; i < busAsociado.getAsientos().size() / 4; i++) {
                    if (j < 2) {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        boton = new BotonSeleccionar(this, asiento, 30 + (j * 80), 30 + (i * 30), 60, 40);
                        botonesSeleccionar.add(boton);
                    } else {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        boton = new BotonSeleccionar(this, asiento, 70 + (j * 80), 30 + (i * 30), 60, 40);
                        botonesSeleccionar.add(boton);
                    }
                }
            }
        }
    }

    public PantallaPrincipal getPantallaPrincipal() {return pantallaPrincipal;}
}

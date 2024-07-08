package org.Grafica;

import org.Grafica.Botones.BotonSeleccionar;
import org.Logica.Aplicacion;
import org.Logica.Asiento;
import org.Logica.Bus;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PantallaAutobuses extends JPanel {
    private Aplicacion aplicacion;
    private Bus busSeleccionado;
    private ArrayList<BotonSeleccionar> botonesSeleccionar;
    private PantallaPrincipal pantallaPrincipal;
    public PantallaAutobuses(Color color, Aplicacion a,PantallaPrincipal p) {
        super();
        setBackground(color);
        this.aplicacion=a;
        this.pantallaPrincipal=p;
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
    public Aplicacion getAplicacion(){return aplicacion;}
    public Bus getBusSeleccionado(){return busSeleccionado;}
    public void setBusSeleccionado(Bus busSeleccionado) {this.busSeleccionado = busSeleccionado;}

    public void addBotonesSeleccionar() {
        BotonSeleccionar boton;
        Asiento asiento;
        for(int j=0;j<4;j++) {
            for (int i = 0; i < busSeleccionado.getAsientos().size()/4; i++) {
                asiento=busSeleccionado.getAsientos().get(i+(8*j));
                boton=new BotonSeleccionar(this,asiento,30+i,30+j,20,20);
                botonesSeleccionar.add(boton);
            }
        }
    }

    public PantallaPrincipal getPantallaPrincipal() {return pantallaPrincipal;}
}

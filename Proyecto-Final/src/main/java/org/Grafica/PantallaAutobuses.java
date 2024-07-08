package org.Grafica;

import org.Grafica.Botones.CampoAsiento;
import org.Logica.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PantallaAutobuses extends JPanel {
    private Bus busAsociado;
    private PantallaPrincipal pantallaPrincipal;
    private ArrayList<CampoAsiento> campoAsientos;
    public PantallaAutobuses(Color color, Bus bus,PantallaPrincipal p) {
        super();
        campoAsientos=new ArrayList<>();
        p.setLayout(null);
        setBounds(200,0,400,800);
        if(bus.getAsientos().size()==64){
            setBounds(200,0,800,800);
        }
        setBackground(color);
        this.busAsociado=bus;
        this.pantallaPrincipal=p;
        addBotonesSeleccionar();
        setVisible(false);
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
    public void setBusSeleccionado(Bus busSeleccionado) {this.busAsociado = busSeleccionado;}

    public void addBotonesSeleccionar() {
        Asiento asiento;
        if(busAsociado.getAsientos().size()==32) {
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < busAsociado.getAsientos().size() / 4; i++) {
                    if (j < 2) {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        add(new CampoAsiento(this,asiento.getAsiento(),30+(j*80),30+(i*95),60,60,asiento));
                    } else {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        add(new CampoAsiento(this,asiento.getAsiento(),70+(j*80),30+(i*95),60,60,asiento));
                    }
                }
            }
        } else{
            for (int j = 0; j < 8; j++) {
                for (int i = 0; i < busAsociado.getAsientos().size() / 8; i++) {
                    if (j < 2) {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        add(new CampoAsiento(this,asiento.getAsiento(),30+(j*80),30+(i*80),60,40,asiento));
                    } else if(j<4){
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        add(new CampoAsiento(this,asiento.getAsiento(),70+(j*80), 30+(i*80), 60, 40,asiento));
                    } else if (j<6) {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        add(new CampoAsiento(this,asiento.getAsiento(),110+(j*80), 30+(i*80), 60, 40,asiento));
                    }else{
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        add(new CampoAsiento(this,asiento.getAsiento(),150+(j*80), 30+(i*80), 60, 40,asiento));
                    }
                }
            }
        }
    }

    public PantallaPrincipal getPantallaPrincipal() {return pantallaPrincipal;}

    public ArrayList<CampoAsiento> getCampoAsientos() {
        return campoAsientos;
    }

    public Bus getBusAsociado() {
        return busAsociado;
    }
}

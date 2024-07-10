package org.Grafica;

import org.Grafica.Botones.BotonAsiento;
import org.Logica.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PantallaAutobuses extends JPanel {
    private Bus busAsociado;
    private PantallaPrincipal pantallaPrincipal;
    private ArrayList<BotonAsiento> botonAsientos;

    private BotonAsiento asientoElegido;

    public PantallaAutobuses(Color color, Bus bus,PantallaPrincipal p) {
        super();
        botonAsientos=new ArrayList<>();
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

    public void addBotonesSeleccionar() {
        Asiento asiento;
        if(busAsociado.getAsientos().size()==32) {
            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < busAsociado.getAsientos().size() / 4; i++) {
                    if (j < 2) {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        new BotonAsiento(this,asiento,30+(j*80),30+(i*95),60,60);
                    } else {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        new BotonAsiento(this,asiento,70+(j*80),30+(i*95),60,60);
                    }
                }
            }
        } else{
            for (int j = 0; j < 8; j++) {
                for (int i = 0; i < busAsociado.getAsientos().size() / 8; i++) {
                    if (j < 2) {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        new BotonAsiento(this,asiento,30+(j*80),30+(i*95),60,60);
                    } else if(j<4){
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        new BotonAsiento(this,asiento,70+(j*80), 30+(i*95), 60, 60);
                    } else if (j<6) {
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        new BotonAsiento(this,asiento,110+(j*80), 30+(i*95), 60, 60);
                    }else{
                        asiento = busAsociado.getAsientos().get(i + (8 * j));
                        new BotonAsiento(this,asiento,150+(j*80), 30+(i*95), 60, 60);
                    }
                }
            }
        }
    }
    public ArrayList<BotonAsiento> getBotonAsientos(){return botonAsientos;}
    public Bus getBusAsociado() {return busAsociado;}
    public void setAsientoElegido(BotonAsiento a){this.asientoElegido=a;}
    public BotonAsiento getAsientoElegido() {return asientoElegido;}
}

package org.Grafica;


import org.Logica.Asiento;
import org.Logica.Bus;
import org.Grafica.Botones.BotonAsiento;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Cada de estas clases representaria un bus de forma grafica
 */

public class PantallaAutobuses extends JPanel {
    /** Bus asociado */
    private Bus busAsociado;
    /** Referencia a la pantalla principal*/
    private PantallaPrincipal pantallaPrincipal;
    /** Lista de los asientos */
    private ArrayList<BotonAsiento> botonAsientos;
    /** Asiento seleccionado */
    private BotonAsiento asientoElegido;

    /**
     * Constructor que coloca los limites dependiendo si es un bus de 1 piso o 2, y guarda datos importantes como la
     * referencia a la pantalla principal, el bus asociado y el color dependiendo del recorrido
     * @param color Color del bus
     * @param bus Bus asociado a nivel logico
     * @param p Referencia de la pantalla principal
     */
    public PantallaAutobuses(Color color, Bus bus,PantallaPrincipal p) {
        super();
        botonAsientos=new ArrayList<>();
        p.setLayout(null);
        if(bus.getAsientos().size()==64){
            setBounds(200,0,800,800);
        } else {
            setBounds(200,0,400,800);
        }
        setBackground(color);
        this.busAsociado=bus;
        this.pantallaPrincipal=p;
        addBotonesSeleccionar();
        setVisible(false);
    }

    /**
     * Crea recuadros que encierran a cada bus, solamente estetico
     * @param g Para incializar la parte grafica
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, 400, 10);
        g.fillRect(0, 790, 400, 10);
        g.fillRect(0, 0, 10, 800);
        g.fillRect(390, 0, 10, 800);

        if(busAsociado.getAsientos().size()==64){
            g.fillRect(400,0,400,10);
            g.fillRect(400,790,400,10);
            g.fillRect(790,0,10,800);
        }
    }

    /**
     * Va creando los BotonesAsiento (informacion detallado en la clase BotonAsiento)
     * y cada uno lo asocia a un asiento desde la logica y los situa en la pantalla
     * dependiendo si es de 1 piso o 2
     */
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
                        asiento = busAsociado.getAsientos().get(i + (16 * j));
                        new BotonAsiento(this,asiento,30+(j*80),30+(i*95),60,60);
                    } else if(j<4){
                        asiento = busAsociado.getAsientos().get(i + (16 * j));
                        new BotonAsiento(this,asiento,70+(j*80), 30+(i*95), 60, 60);
                    } else if (j<6) {
                        asiento = busAsociado.getAsientos().get(i + (16*j)-56);
                        new BotonAsiento(this,asiento,110+(j*80), 30+(i*95), 60, 60);
                    }else{
                        asiento = busAsociado.getAsientos().get(i + (16 * j)-56);
                        new BotonAsiento(this,asiento,150+(j*80), 30+(i*95), 60, 60);
                    }
                }
            }
        }
    }
    /**
     * Getter del bus asociado
     * @return Un objeto clase Bus
     */
    public Bus getBusAsociado() {return busAsociado;}

    /**
     * setter del asiento elegido para comprar o ver detalles
     * @param a BotonAsiento clickeado
     */
    public void setAsientoElegido(BotonAsiento a){this.asientoElegido=a;}

    /**
     * Getter del asientoElegido
     * @return BotonAsiento
     */
    public BotonAsiento getAsientoElegido() {return asientoElegido;}

    /**
     * Getter de la pantalla principal
     * @return La pantalla principal
     */
    public PantallaPrincipal getPantallaPrincipal() {return pantallaPrincipal;}
}

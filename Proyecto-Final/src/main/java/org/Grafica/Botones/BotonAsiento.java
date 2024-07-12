package org.Grafica.Botones;

import org.Grafica.PantallaAutobuses;
import org.Logica.Asiento;

import javax.swing.*;
import java.awt.*;

/**
 * Unico boton en la Pantalla autobus, cada uno de estos pretende representar un asiento a nivel grafico
 * por lo que tienen un asiento asociado
 */

public class BotonAsiento extends JButton {
    /** Tipo de asiento*/
    private String tipoAsiento;
    /** El asiento logico*/
    private Asiento asientoAsociado;
    /** Referencia a la pantalla autobus a la que pertenece*/
    private PantallaAutobuses pantallaAutobuses;

    /**
     * Constructor que asigna los parametros a las variables locales, asigna los limites del boton y coloca el color
     * @param p Pantalla autobus asociada
     * @param asiento Asiento asociado
     * @param x coordenada x
     * @param y coordenada y
     * @param ancho ancho del boton
     * @param alto alto del boton
     */
    public BotonAsiento(PantallaAutobuses p, Asiento asiento, int x, int y, int ancho, int alto){
        super();
        this.pantallaAutobuses=p;
        this.asientoAsociado=asiento;
        setTipoAsiento();
        setText(asientoAsociado.getAsiento());
        setBounds(x,y,ancho,alto);
        actionListener();
        setBackground(new Color(100,255,100));
        p.setLayout(null);
        p.add(this);
    }

    /**
     * Agrega el action listener que en este caso es que cuando se aprieta un boton este se coloca en amarillo
     * y se envia para guardar en la pantalla principal si es que se quiere proceder con la compra, ademas muestra
     */
    public void actionListener(){
        this.addActionListener(e -> {
            if(pantallaAutobuses.getAsientoElegido()!=null){
                if(pantallaAutobuses.getAsientoElegido().getBackground()==Color.YELLOW){
                    if(pantallaAutobuses.getAsientoElegido().getAsientoAsociado().estaDisponible()) {
                        pantallaAutobuses.getAsientoElegido().setBackground(new Color(100, 255, 100));
                    }else{
                        pantallaAutobuses.getAsientoElegido().setBackground(Color.RED);
                    }
                }
            }
            pantallaAutobuses.setAsientoElegido(this);
            pantallaAutobuses.getPantallaPrincipal().getAsientoSeleccionada().setBackground(getBackground());
            setBackground(Color.YELLOW);
            pantallaAutobuses.getPantallaPrincipal().getAsientoSeleccionada().setText(asientoAsociado.getAsiento());
            pantallaAutobuses.getPantallaPrincipal().getaCaracteristicas().setText(tipoAsiento+"\nprecio: "+asientoAsociado.getPrecio());
        });
    }
    /** getter del asiento asociado*/
    public Asiento getAsientoAsociado() {return asientoAsociado;}
    /** Setea el tipo de asiento */
    private void setTipoAsiento(){
        switch (asientoAsociado.getPrecio()) {
            case 1000: this.tipoAsiento="SemiCama";break;
            case 1500: this.tipoAsiento="SalonCama";break;
            case 2000: this.tipoAsiento="SuiteCama";break;
            default: break;
        }
    }
}
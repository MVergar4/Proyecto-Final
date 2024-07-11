package org.Grafica.Botones;

import org.Grafica.PantallaAutobuses;
import org.Logica.Asiento;

import javax.swing.*;
import java.awt.*;

public class BotonAsiento extends JButton {
    private String tipoAsiento;
    private Asiento asientoAsociado;
    private PantallaAutobuses pantallaAutobuses;
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
    public void actionListener(){
        this.addActionListener(e -> {
            if(pantallaAutobuses.getAsientoElegido()!=null){
                if(pantallaAutobuses.getAsientoElegido().getBackground()==Color.YELLOW){
                    pantallaAutobuses.getAsientoElegido().setBackground(new Color(100,255,100));
                }
            }
            pantallaAutobuses.setAsientoElegido(this);
            setBackground(Color.YELLOW);
            pantallaAutobuses.getPantallaPrincipal().getAsientoSeleccionada().setText(asientoAsociado.getAsiento());
            pantallaAutobuses.getPantallaPrincipal().getaCaracteristicas().setText(tipoAsiento+"\nprecio: "+asientoAsociado.getPrecio());
        });
    }

    public Asiento getAsientoAsociado() {return asientoAsociado;}
    private void setTipoAsiento(){
        switch (asientoAsociado.getPrecio()) {
            case 1000: this.tipoAsiento="SemiCama";break;
            case 1500: this.tipoAsiento="SalonCama";break;
            case 2000: this.tipoAsiento="SuiteCama";break;
            default: break;
        }
    }
}
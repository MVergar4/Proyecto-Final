package org.Grafica.Botones;

import org.Grafica.PantallaAutobuses;
import org.Logica.Asiento;

import javax.swing.*;
import java.awt.*;

public class BotonAsiento extends JButton {
    private Asiento asientoAsociado;
    public BotonAsiento(PantallaAutobuses p, Asiento asiento, int x, int y, int ancho, int alto){
        super();
        this.asientoAsociado=asiento;
        setText(asientoAsociado.getAsiento());
        setBounds(x,y,ancho,alto);
        actionListener();
        setBackground(new Color(100,255,100));
        p.setLayout(null);
        p.add(this);
    }
    public void actionListener(){
        this.addActionListener(e -> {

        });
    }

    public Asiento getAsientoAsociado() {return asientoAsociado;}
}
package org.Grafica.Botones;

import org.Grafica.PantallaAutobuses;
import org.Logica.Asiento;

import javax.swing.*;
import java.awt.*;

public class CampoAsiento extends JTextField {
    private Asiento asientoAsociado;
    public CampoAsiento(PantallaAutobuses p, String text, int x, int y, int ancho, int alto, Asiento asiento){
        p.setLayout(null);
        this.asientoAsociado=asiento;
        this.setBounds(x,y,ancho,alto);
        this.setText(text);
        this.setBackground(new Color(0,0,255));
        this.setEditable(false);
        this.setHorizontalAlignment(0);
        this.setFont(new Font("Arial",Font.BOLD,30));
        p.add(this);
    }
    public void rePintar(){
        if(!asientoAsociado.estaDisponible()){
            this.setBackground(Color.RED);
        }
    }
    public Asiento getAsientoAsociado(){
        return asientoAsociado;
    }
}

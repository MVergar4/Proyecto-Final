package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import java.awt.*;

public class BotonConfirmar extends Boton {
    public BotonConfirmar(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto){
        super(p,nombre,x,y,ancho,alto);
        actionListener();
        this.setBackground(new Color(0,143,57));
    }

    @Override
    public void actionListener() {
        this.addActionListener(e -> {
            pantallaPrincipal.getAsientoSeleccionado().ocuparAsiento();
            for(int i=0;i<pantallaPrincipal.getAutobus().getCampoAsientos().size();i++) {
                pantallaPrincipal.getAutobus().getCampoAsientos().get(i).rePintar();
            }
        });
    }
}

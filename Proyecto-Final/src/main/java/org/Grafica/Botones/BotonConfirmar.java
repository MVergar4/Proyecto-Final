package org.Grafica.Botones;

import org.Grafica.PantallaAutobuses;
import org.Grafica.PantallaPrincipal;
import org.Logica.Asiento;

import java.awt.*;

public class BotonConfirmar extends Boton {
    public BotonConfirmar(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto){
        super(p,nombre,x,y,ancho,alto);
        this.setBackground(new Color(0,143,57));
        actionListener();

    }

    @Override
    public void actionListener() {
        this.addActionListener(e -> {
            pantallaPrincipal.getAutobus().getAsientoElegido().getAsientoAsociado().ocuparAsiento();
            pantallaPrincipal.getAutobus().getAsientoElegido().setBackground(Color.RED);
        });
    }
}

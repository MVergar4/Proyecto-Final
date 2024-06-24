package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

public class BotonSelHorario extends Boton{
    public BotonSelHorario(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto){
        super(p,nombre,x,y,ancho,alto);
        actionListener();
    }

    @Override
    public void actionListener() {
        this.addActionListener(e -> {

        });
    }
}

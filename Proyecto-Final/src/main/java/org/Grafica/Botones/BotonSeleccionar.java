package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

public class BotonSeleccionar extends Boton {
    public BotonSeleccionar(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto){
        super(p,nombre,x,y,ancho,alto);
        actionListener();
    }

    @Override
    public void actionListener() {
        this.addActionListener(e -> {

        });
    }
}

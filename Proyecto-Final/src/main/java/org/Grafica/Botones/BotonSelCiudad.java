package org.Grafica.Botones;

import org.Grafica.PantallaPaginaWeb;

public class BotonSelCiudad extends Boton {
    public BotonSelCiudad(PantallaPaginaWeb p, String nombre, int x, int y, int ancho, int alto){
        super(p,nombre,x,y,ancho,alto);
        actionListener();
    }

    @Override
    public void actionListener() {
        this.addActionListener(e -> {

        });
    }
}

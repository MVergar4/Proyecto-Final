package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;



public class BotonSelBus extends Boton {
    public BotonSelBus(PantallaPrincipal p, String nom,int x,int y,int ancho,int alto){
        super(p,nom,x,y,ancho,alto);
    }
    @Override
    public void actionListener() {
        this.addActionListener(e -> {

        });
    }
}

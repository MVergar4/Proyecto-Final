package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import java.util.Objects;

public class BotonSelCiudad extends Boton {
    public BotonSelCiudad(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto){
        super(p,nombre,x,y,ancho,alto);
        actionListener();
    }

    @Override
    public void actionListener() {
        this.addActionListener(e -> {
            if(Objects.equals(pantallaPrincipal.getDestino().getText(), "Santiago")){
                pantallaPrincipal.setCiudad("Santiago");
            } else if (Objects.equals(pantallaPrincipal.getDestino().getText(), "Concepcion")) {
                pantallaPrincipal.setCiudad("Concepcion");
            } else if (Objects.equals(pantallaPrincipal.getDestino().getText(), "Chillan")) {
                pantallaPrincipal.setCiudad("Chillan");
            } else if (Objects.equals(pantallaPrincipal.getDestino().getText(), "Temuco")) {
                pantallaPrincipal.setCiudad("Temuco");
            }else {
                pantallaPrincipal.destinoNoExiste();
            }
        });
    }
}

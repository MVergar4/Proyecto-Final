package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import java.util.Objects;

/**
 * Subclase de boton
 */

public class BotonSelCiudad extends Boton {
    /**
     * Documentacion identica en todos los botones
     * @param p
     * @param nombre
     * @param x
     * @param y
     * @param ancho
     * @param alto
     */
    public BotonSelCiudad(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto){
        super(p,nombre,x,y,ancho,alto);
        actionListener();
    }

    /**
     * Confirma la ciudad escrita en el campo para ingresar la ciudad y se preocupa si es una ciudad con recorrido disponible
     */
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

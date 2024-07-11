package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;

/**
 * Funciona como superclase de todos los botones de la pantalla principal
 */
public abstract class Boton extends JButton {
    /** Referencia a la pantalla principal */
    protected PantallaPrincipal pantallaPrincipal;

    /**
     * Constructor de la clase que setea el nombre, y los limites del boton ademas de agregarlo a la pantalla
     * y guardar referencia a la pantalla principal
     * @param p Pantalla principal
     * @param nombre Texto del boton
     * @param x Coordenada x
     * @param y Coordenada y
     * @param ancho Ancho del boton
     * @param alto Alto del boton
     */
    public Boton(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto){
        super(nombre);
        setBounds(x,y,ancho,alto);
        p.setLayout(null);
        p.add(this);
        pantallaPrincipal=p;
    }
    /** Sirve para que cada clase pueda implementar un action listener*/
    public abstract void actionListener();
}


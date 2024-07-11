package org.Grafica.Botones;

import org.Grafica.PantallaPrincipal;

import javax.swing.*;
import java.awt.*;

/**
 * Subclase de boton que selecciona el horario
 */

public class BotonSelHorario extends Boton{
    /** guarda un campo de texto para escribir la hora seleccionada*/
    private CampoHoraSel campoHoraSel;

    /**
     * Constructor del boton, lo unico diferente de los demas es que se edita el tamaño de fuente y se necesita como parametro
     * el campoHoraSel
     * @param p
     * @param nombre
     * @param x
     * @param y
     * @param ancho
     * @param alto
     * @param campoHoraSel Campo donde se ingresara la hora
     */
    public BotonSelHorario(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto,CampoHoraSel campoHoraSel){
        super(p,nombre,x,y,ancho,alto);
        this.campoHoraSel=campoHoraSel;
        this.setFont(new Font("Arial",Font.BOLD,30));
        this.setBackground(new Color(0,200,255));
        actionListener();
    }

    /**
     * Escribe la hora en el campo de texto
     */
    @Override
    public void actionListener() {
        this.addActionListener(e -> {
            campoHoraSel.setText(this.getText());
            pantallaPrincipal.setHorario(this.getText());
        });
    }
}

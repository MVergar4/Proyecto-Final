package org.Grafica.Botones;

import org.Grafica.PantallaAutobuses;
import org.Grafica.PantallaPrincipal;
import org.Logica.Asiento;
import org.Logica.AsientoOcupadoException;

import javax.swing.*;

public class BotonSeleccionar extends JButton {
    private PantallaAutobuses pantallaAutobuses;
    private Asiento asientoSeleccionado;
    public BotonSeleccionar(PantallaAutobuses p, Asiento asiento, int x, int y, int ancho, int alto){
        super(asiento.getAsiento());
        pantallaAutobuses=p;
        setBounds(x,y,ancho,alto);
        p.setLayout(null);
        p.add(this);
        actionListener();
        this.asientoSeleccionado=asiento;

    }
    public void actionListener() {
        this.addActionListener(e -> {
            pantallaAutobuses.getAplicacion().setAsientoSeleccionado(asientoSeleccionado);
        });
    }
}

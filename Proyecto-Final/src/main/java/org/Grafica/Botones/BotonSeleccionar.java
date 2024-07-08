package org.Grafica.Botones;

import org.Grafica.PantallaAutobuses;
import org.Grafica.PantallaPrincipal;
import org.Logica.Asiento;
import org.Logica.AsientoOcupadoException;

import javax.swing.*;

public class BotonSeleccionar extends JButton {
    private PantallaAutobuses pantallaAutobuses;
    private Asiento asientoAsociado;
    public BotonSeleccionar(PantallaAutobuses p, Asiento asiento, int x, int y, int ancho, int alto){
        super(asiento.getAsiento());
        pantallaAutobuses=p;
        setBounds(x,y,ancho,alto);
        p.setLayout(null);
        p.add(this);
        actionListener();
        this.asientoAsociado=asiento;

    }
    public void actionListener() {
        this.addActionListener(e -> {
            pantallaAutobuses.getPantallaPrincipal().getAsientoSeleccionada().setText(asientoAsociado.getAsiento());
        });
    }
}

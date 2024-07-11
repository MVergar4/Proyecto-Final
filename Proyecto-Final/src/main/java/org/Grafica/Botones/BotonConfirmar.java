package org.Grafica.Botones;

import org.Grafica.PantallaAutobuses;
import org.Grafica.PantallaPrincipal;
import org.Logica.Asiento;
import org.Logica.AsientoOcupadoException;

import java.awt.*;

public class BotonConfirmar extends Boton {
    public BotonConfirmar(PantallaPrincipal p, String nombre, int x, int y, int ancho, int alto){
        super(p,nombre,x,y,ancho,alto);
        this.setBackground(new Color(0,143,57));
        actionListener();

    }

    @Override
    public void actionListener() {
        this.addActionListener(e -> {
            try {
                Asiento a=pantallaPrincipal.getAutobus().getAsientoElegido().getAsientoAsociado();
                int i = 0;
                while (i < a.getAsiento().length() && !Character.isDigit(a.getAsiento().charAt(i))) {
                    i++;
                }
                String c = a.getAsiento().substring(0, i);
                int f = Integer.parseInt(a.getAsiento().substring(i));
                pantallaPrincipal.getAutobus().getBusAsociado().reservarAsiento(c,f);
                pantallaPrincipal.getAutobus().getAsientoElegido().setBackground(Color.RED);
            }catch (AsientoOcupadoException ex){
                pantallaPrincipal.getAutobus().getAsientoElegido().setBackground(Color.RED);
                pantallaPrincipal.noAsiento(ex.getMessage());
            }
        });
    }
}

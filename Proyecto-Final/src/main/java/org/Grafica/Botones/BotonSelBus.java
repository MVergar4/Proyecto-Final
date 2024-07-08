package org.Grafica.Botones;

import org.Grafica.PantallaAutobuses;
import org.Grafica.PantallaPrincipal;

import java.util.ArrayList;
import java.util.Objects;


public class BotonSelBus extends Boton {
    public BotonSelBus(PantallaPrincipal p, String nom,int x,int y,int ancho,int alto){
        super(p,nom,x,y,ancho,alto);
        actionListener();
    }
    @Override
    public void actionListener() {
        this.addActionListener(e -> {
            ArrayList<PantallaAutobuses> pant=pantallaPrincipal.getPantallaAutobuses();

            for(int i=0;i<pant.size();i++){
                System.out.println(pant.get(i).getBusAsociado().getDestino()+pant.get(i).getBusAsociado().getHorario());
                if(Objects.equals(pant.get(i).getBusAsociado().getDestino(), pantallaPrincipal.getCiudad())){
                    if(Objects.equals(pant.get(i).getBusAsociado().getHorario(), pantallaPrincipal.getHorario())){
                        pant.get(i).setVisible(true);
                    }
                }
            }
        });
    }
}

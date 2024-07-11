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
            if(pantallaPrincipal.getTipoBus()!=32||pantallaPrincipal.getTipoBus()!=64){

            } else if (pantallaPrincipal.getHorario()==null) {

            } else if (pantallaPrincipal.getCiudad()==null) {

            }
            ArrayList<PantallaAutobuses> pant=pantallaPrincipal.getPantallaAutobuses();
            pantallaPrincipal.getAutobus().setVisible(false);
            for(int i=0;i<pant.size();i++){
                if(Objects.equals(pant.get(i).getBusAsociado().getDestino(), pantallaPrincipal.getCiudad())){
                    if(Objects.equals(pant.get(i).getBusAsociado().getHorario(), pantallaPrincipal.getHorario())){
                        if(pant.get(i).getBusAsociado().getAsientos().size()==pantallaPrincipal.getTipoBus()){
                            System.out.println(i);
                            pantallaPrincipal.setAutobus(pant.get(i));
                            pant.get(i).setVisible(true);
                        }
                    }
                }
            }
        });
    }
}

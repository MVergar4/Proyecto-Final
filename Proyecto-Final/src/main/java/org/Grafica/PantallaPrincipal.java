package org.Grafica;

import org.Grafica.Botones.*;
import org.Logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class PantallaPrincipal extends JPanel {
    private Aplicacion aplicacion;

    private JTextField destino;
    private JTextField asientoSeleccionada;

    private String ciudad;
    private String horario;

    private ArrayList<PantallaAutobuses> pantallaAutobuses;
    private PantallaAutobuses autobus;
    private Bus bus;

    public PantallaPrincipal(){
        super();
        this.setLayout(null);
        setBackground(new Color(30, 31, 34));
        aplicacion=new Aplicacion();
        destino=new JTextField(20);
        pantallaAutobuses=new ArrayList<>();

        for(int i=0;i<aplicacion.getRecorrido("Santiago").getBusesDisponibles().size();i++) {
            bus=aplicacion.getRecorrido("Santiago").getBusesDisponibles().get(i);
            autobus = new PantallaAutobuses(new Color(255, 170, 113), bus, this);
            pantallaAutobuses.add(autobus);
            add(autobus);
            autobus.setVisible(false);
        }
        for(int i=0;i<aplicacion.getRecorrido("Temuco").getBusesDisponibles().size();i++) {
            bus=aplicacion.getRecorrido("Temuco").getBusesDisponibles().get(i);
            autobus = new PantallaAutobuses(new Color(255, 255, 185), bus, this);
            pantallaAutobuses.add(autobus);
            add(autobus);
            autobus.setVisible(false);
        }
        for(int i=0;i<aplicacion.getRecorrido("Chillan").getBusesDisponibles().size();i++) {
            bus=aplicacion.getRecorrido("Chillan").getBusesDisponibles().get(i);
            autobus = new PantallaAutobuses(new Color(255, 191, 213), bus, this);
            pantallaAutobuses.add(autobus);
            add(autobus);
            autobus.setVisible(false);
        }
        for(int i=0;i<aplicacion.getRecorrido("Concepcion").getBusesDisponibles().size();i++) {
            bus=aplicacion.getRecorrido("Concepcion").getBusesDisponibles().get(i);
            autobus = new PantallaAutobuses(new Color(163, 216, 241), bus, this);
            pantallaAutobuses.add(autobus);
            add(autobus);
            autobus.setVisible(false);
        }
        autobus.setVisible(true);

        CampoHoraSel c = new CampoHoraSel(this,1200,140,80,30);
        new BotonSelHorario(this,"06:00",1300,100,120,30,c);
        new BotonSelHorario(this,"12:00",1300,130,120,30,c);
        new BotonSelHorario(this,"18:00",1300,160,120,30,c);
        new BotonSelHorario(this,"00:00",1300,190,120,30,c);

        new BotonConfirmar(this,"CONFIRMAR",1300,230,110,30);
        new BotonSelCiudad(this,"Enviar",1405,50,80,30);
        destino=new CampoIngresarCiudad(this,1300,50,100,30);
        asientoSeleccionada=new CampoAsientoSeleccionado(this,1200,30,80,80);
        asientoSeleccionada.setText("C4");

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
    }
    public Aplicacion getAplicacion() {return aplicacion;}
    public JTextField getDestino(){return destino;}
    public JTextField getAsientoSeleccionada() {return asientoSeleccionada;}
    public PantallaAutobuses getAutobus() {return autobus;}
    public void setHorario(String horario) {this.horario = horario;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}

}

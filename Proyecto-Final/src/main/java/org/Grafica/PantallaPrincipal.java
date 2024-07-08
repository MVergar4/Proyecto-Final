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


        /*for(int i=0;i<16;i++){
            if(i<4){
                aplicacion.getRecorrido("Santiago");
                autobus=new PantallaAutobuses(new Color(255, 170, 113),bus,this);
                pantallaAutobuses.add(autobus);
            } else if (i<8) {
                aplicacion.getRecorrido("Temuco");
                new PantallaAutobuses(new Color(255, 255, 185),bus,this);
                pantallaAutobuses.add(autobus);
            } else if (i<12) {
                aplicacion.getRecorrido("Chillan");
                new PantallaAutobuses(new Color(255, 191, 213),bus,this);
                pantallaAutobuses.add(autobus);
            } else{
                aplicacion.getRecorrido("Concepcion");
                new PantallaAutobuses(new Color(163, 216, 241),bus,this);
                pantallaAutobuses.add(autobus);
            }
        }*/

        /*
        new Color(163, 216, 241);
        new Color(255, 255, 185);
        new Color(255, 191, 213);
        new Color(255, 170, 113);
        concepcion = new PantallaAutobuses(new Color(163, 216, 241),aplicacion,this);
        concepcion.setBounds(0, 0, 400, 800);
        temuco = new PantallaAutobuses(new Color(255, 255, 185),aplicacion,this);
        temuco.setBounds(390, 0, 400, 800);
        chillan = new PantallaAutobuses(new Color(255, 191, 213),aplicacion,this);
        chillan.setBounds(780, 0, 400, 800);
        santiago = new PantallaAutobuses(new Color(255, 170, 113),aplicacion,this);
        santiago.setBounds(0, 0, 400, 800);
        this.add(concepcion);
        this.add(temuco);
        this.add(chillan);
        this.add(santiago);
        */
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

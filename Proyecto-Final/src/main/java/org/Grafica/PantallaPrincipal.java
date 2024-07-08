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
    private PantallaAutobuses concepcion;
    private PantallaAutobuses temuco;
    private PantallaAutobuses chillan;
    private PantallaAutobuses santiago;
    public PantallaPrincipal(){
        super();
        this.setLayout(null);
        setBackground(new Color(30, 31, 34));
        aplicacion=new Aplicacion();
        destino=new JTextField(20);

        concepcion = new PantallaAutobuses(new Color(163, 216, 241),aplicacion,this);
        concepcion.setBounds(0, 0, 400, 800);
        temuco = new PantallaAutobuses(new Color(255, 255, 185),aplicacion,this);
        temuco.setBounds(390, 0, 400, 800);
        chillan = new PantallaAutobuses(new Color(255, 191, 213),aplicacion,this);
        chillan.setBounds(780, 0, 400, 800);
        santiago = new PantallaAutobuses(new Color(255, 170, 113),aplicacion,this);
        this.add(concepcion);
        this.add(temuco);
        this.add(chillan);

        new BotonConfirmar(this,"CONFIRMAR",1200,200,110,30);
        new BotonSelCiudad(this,"Enviar",1405,50,80,30);
        destino=new CampoIngresarCiudad(this,1300,50,100,30);
        asientoSeleccionada=new CampoAsientoSeleccionado(this,1200,30,80,80);
        asientoSeleccionada.setText("C4");

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                remove(concepcion);
                santiago.setBounds(0, 0, 400, 800);
                add(santiago);
                repaint();
            }
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
    public PantallaAutobuses getChillan() {return chillan;}
    public JTextField getDestino(){return destino;}
    public JTextField getAsientoSeleccionada() {return asientoSeleccionada;}
}

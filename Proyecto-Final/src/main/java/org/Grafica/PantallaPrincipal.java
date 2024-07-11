package org.Grafica;

import org.Grafica.Botones.*;
import org.Logica.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;


public class PantallaPrincipal extends JPanel {

    /** Recorridos disponibles cada uno con una lista de buses*/
    private Recorrido recorridoChillan;
    private Recorrido recorridoConcepcion;
    private Recorrido recorridoSantiago;
    private Recorrido recorridoTemuco;

    /** Cuadros de textos que permiten señalar el destino, asiento seleccionado y las caracteristicas de este*/
    private JTextField destino;
    private JTextField asientoSeleccionada;
    private JTextArea aCaracteristicas;

    /** Sirven a la hora de elegir un bus*/
    private String ciudad;
    private String horario;
    private int tipoBus;

    /** Guarda todos los autobuses graficos*/
    private ArrayList<PantallaAutobuses> pantallaAutobuses;
    /** Sirve para crear pantalla autobuses, y para señalar cual se esta viendo en tiempo real*/
    private PantallaAutobuses autobus;

    /**
     * Coloca el color, Crea los recorridos de buses, los pantalla buses cada uno con un Bus logico asociado
     * Crea los JTextField, y los botones.
     */
    public PantallaPrincipal(){
        super();
        this.setLayout(null);
        setBackground(new Color(30, 31, 34));

        recorridoChillan = new RecorridoChillan();
        recorridoConcepcion = new RecorridoConcepcion();
        recorridoSantiago = new RecorridoSantiago();
        recorridoTemuco = new RecorridoTemuco();
        destino=new JTextField(20);
        pantallaAutobuses=new ArrayList<>();

        Bus bus;
        for(int i=0;i<recorridoSantiago.getBusesDisponibles().size();i++) {
            bus=recorridoSantiago.getBusesDisponibles().get(i);
            bus.setDestino("Santiago");
            autobus = new PantallaAutobuses(new Color(255, 170, 113), bus, this);
            pantallaAutobuses.add(autobus);
            add(autobus);
            autobus.setVisible(false);
        }
        for(int i=0;i<recorridoTemuco.getBusesDisponibles().size();i++) {
            bus=recorridoTemuco.getBusesDisponibles().get(i);
            bus.setDestino("Temuco");
            autobus = new PantallaAutobuses(new Color(255, 255, 185), bus, this);
            pantallaAutobuses.add(autobus);
            add(autobus);
            autobus.setVisible(false);
        }
        for(int i=0;i<recorridoChillan.getBusesDisponibles().size();i++) {
            bus=recorridoChillan.getBusesDisponibles().get(i);
            bus.setDestino("Chillan");
            autobus = new PantallaAutobuses(new Color(255, 191, 213), bus, this);
            pantallaAutobuses.add(autobus);
            add(autobus);
            autobus.setVisible(false);
        }
        for(int i=0;i<recorridoConcepcion.getBusesDisponibles().size();i++) {
            bus=recorridoConcepcion.getBusesDisponibles().get(i);
            bus.setDestino("Concepcion");
            autobus = new PantallaAutobuses(new Color(163, 216, 241), bus, this);
            pantallaAutobuses.add(autobus);
            add(autobus);
            autobus.setVisible(false);
        }

        aCaracteristicas=new CampoCaracteristicas(this,1200,120,80,35);
        destino=new CampoIngresarCiudad(this,1300,50,100,30);
        asientoSeleccionada=new CampoAsientoSeleccionado(this,1200,30,80,80);
        CampoHoraSel c = new CampoHoraSel(this,1430,100,80,30);

        new BotonSelHorario(this,"06:00",1300,100,120,30,c);
        new BotonSelHorario(this,"12:00",1300,130,120,30,c);
        new BotonSelHorario(this,"18:00",1300,160,120,30,c);
        new BotonSelHorario(this,"00:00",1300,190,120,30,c);

        new BotonSelBus(this,"Confirmar Bus",1300,230,120,30);
        new BotonConfirmar(this,"CONFIRMAR COMPRA",1300,280,180,30);
        new Boton1Piso(this,1430,140,80,40,"1PISO");
        new Boton2Piso(this,1430,190,80,40,"2PISO");
        new BotonSelCiudad(this,"Enviar",1405,50,80,30);

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}
            public void mousePressed(MouseEvent e) {}
            public void mouseReleased(MouseEvent e) {}
            public void mouseEntered(MouseEvent e) {}
            public void mouseExited(MouseEvent e) {}
        });
    }
    /** Metodo paint component que agrega texto para facilitarle el usuario el uso de la interfaz*/
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);
        G.setFont(new Font("Arial", Font.PLAIN, 20));
        G.setColor(Color.WHITE);
        G.drawString("Escriba ciudad ", 1300, 40);
    }
    /** Getters de las variables privadas*/
    public JTextField getDestino(){return destino;}
    public JTextField getAsientoSeleccionada() {return asientoSeleccionada;}
    public String getCiudad(){return ciudad;}
    public ArrayList<PantallaAutobuses> getPantallaAutobuses() {return pantallaAutobuses;}
    public String getHorario(){return horario;}
    public PantallaAutobuses getAutobus() {return autobus;}
    public JTextArea getaCaracteristicas() {return aCaracteristicas;}
    /** Setters de las variables privadas*/
    public void setHorario(String horario) {this.horario = horario;}
    public void setCiudad(String ciudad) {this.ciudad = ciudad;}
    public void setTipoBus(int tipoBus) {this.tipoBus = tipoBus;}
    public int getTipoBus() {return tipoBus;}
    public void setAutobus(PantallaAutobuses autobus) {this.autobus = autobus;}

    /** Metodo que muestra cuando se agrega un destino inexistente*/
    public void destinoNoExiste(){
        JOptionPane.showMessageDialog(null,"Destino no existe","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    /** Metodo que muestra cuando no hay disponible un bus de 2 pisos en cierto recorrido y horario*/
    public void BusNoDisponible(){
        JOptionPane.showMessageDialog(null,"Bus de 2 pisos no disponible,asignado automaticamente de 1","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    /** Muestra cuando no se ha envieado un destino*/
    public void noDestino(){
        JOptionPane.showMessageDialog(null,"Falta seleccionar un destino","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    /** Muestra cuando no se ha elegido el tipo de bus*/
    public void noTipoBus(){
        JOptionPane.showMessageDialog(null,"Falta seleccionar el tipo de bus","ERROR",JOptionPane.ERROR_MESSAGE);
    }
    /** Muestra cuando no se ha elegido el horario*/
    public void noHorario(){
        JOptionPane.showMessageDialog(null,"Falta seleccionar un horario","ERROR",JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Se muestra cuando se intenta comprar un asiento ya ocupado
     * @param s String con el error
     */
    public void noAsiento(String s){
        JOptionPane.showMessageDialog(null,s,"ERROR",JOptionPane.ERROR_MESSAGE);
    }
}

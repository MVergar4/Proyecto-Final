package org.Grafica;
import javax.swing.*;
import java.awt.*;

/**
 * Panel principal que maneja las otras dos pantallas
 */
public class PantallaPrincipal extends JPanel {
    private PantallaPersonal pantallaPersonal;
    private PantallaPaginaWeb pantallaPaginaWeb;
    /**
     * Constructor del panel
     * Crea instancias de los otros dos paneles y los acomoda
     */
    public PantallaPrincipal(){
        super();
        setLayout(null);

        pantallaPersonal=new PantallaPersonal();
        pantallaPersonal.setBounds(550,100,1000,600);
        this.add(pantallaPersonal);

        pantallaPaginaWeb=new PantallaPaginaWeb();
        pantallaPaginaWeb.setBounds(0,0,500,750);
        this.add(pantallaPaginaWeb);

        setBackground(Color.darkGray);
    }

    /**
     * Implementación necesaria de paintComponent para que se dibuje el panel en la ventana
     * @param G gráficos para dibujar
     */
    @Override
    public void paintComponent(Graphics G){
        super.paintComponent(G);;
    }
}
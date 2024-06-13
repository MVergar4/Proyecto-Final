package org.Grafica;
import javax.swing.*;
import java.awt.*;

/**
 * Panel principal que maneja las otras dos pantallas
 */
public class PantallaPrincipal extends JPanel {
    private PantallaPaginaWeb pantallaPaginaWeb;
    /**
     * Constructor del panel
     * Crea instancias de los otros dos paneles y los acomoda
     */
    public PantallaPrincipal(){
        super();
        setLayout(null);

        pantallaPaginaWeb=new PantallaPaginaWeb();
        pantallaPaginaWeb.setBounds(0,10,1520,770);
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
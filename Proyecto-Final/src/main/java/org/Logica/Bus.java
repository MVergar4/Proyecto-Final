package org.Logica;

import java.util.ArrayList;

/**
 * Clase que modela un bus genérico con filas de asientos
 */
public class Bus {
    /** Hora a la que parte el bus */
    private String horario;
    /** Lugar donde se dirige el bus */
    private String destino;
    /** Arreglo de asientos que componen el bus */
    protected ArrayList<Asiento> asientos;

    /**
     * Contructor por defecto
     */
    public Bus(){
        this.asientos=new ArrayList<>();
    }

    /**
     * Método que cambia el horario del bus
     * @param L hora
     */
    public void setHorario(String L) {
        horario = L;
    }

    /**
     * Entrega la hora a la que sale el bus
     * @return horario
     */
    public String getHorario(){
        return horario;
    }

    /**
     * Método que cambia el lugar al que se dirige el bus
     * @param d ciudad
     */
    public void setDestino(String d) {
        destino = d;
    }

    /**
     * Devuelve el lugar al que se dirige
     * @return destino
     */
    public String getDestino(){
        return destino;
    }

    /**
     * Retorna un arreglo con los asientos
     * @return ArrayList con los asientos
     */
    public ArrayList<Asiento> getAsientos(){
        return asientos;
    }

    /**
     * Método usado para convertir un par coordenado en un índice para el arreglo de asientos
     * @param letra letra de la columna
     * @param numero número de la fila
     * @return índice para el arreglo
     */
    private int transformarFila(String letra, int numero) {
        int contador = numero - 1;
        switch (letra) {
            case "A": contador = numero - 1; break;
            case "B": contador = contador + (asientos.size()/4); break;
            case "C": contador = contador + (asientos.size()/4) * 2; break;
            case "D": contador = contador + (asientos.size()/4) * 3; break;
            default: break;
        }
        return contador;
    }

    /**
     * Método para comprobar si el asiento solicitado está disponible
     * @param l letra de columna
     * @param n número de fila
     * @return disponibilidad del asiento
     */
    public boolean revisarAsiento(String l, int n) {
        Asiento temp = asientos.get(transformarFila(l, n));
        return temp.estaDisponible();
    }

    /**
     * Reserva un asiento del arreglo
     * @param l letra de la columna
     * @param n número de la fila
     * @throws AsientoOcupadoException en caso de que el asiento que se quiera reservar esté ocupado, saldrá un error
     */
    public void reservarAsiento(String l, int n) throws AsientoOcupadoException {
        Asiento temp = asientos.get(transformarFila(l, n));
        if (revisarAsiento(l, n)) {
            temp.ocuparAsiento();
        } else {
            throw new AsientoOcupadoException("Error, este asiento ya está ocupado");
        }
    }
}

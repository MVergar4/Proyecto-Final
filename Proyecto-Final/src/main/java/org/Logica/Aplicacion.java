package org.Logica;

public class Aplicacion {
    private Recorrido santiago;
    private Recorrido temuco;
    private Recorrido chillan;
    public Aplicacion(){
        santiago= new Recorrido("Santiago");
        temuco=new Recorrido("temuco");
        chillan=new Recorrido("chillan");
    }

    public Recorrido getRecorrido(String s) {
        if(s == "santiago"){
            return santiago;
        } else if (s == "temuco") {
            return temuco;
        } else{
            return chillan;
        }
    }
}

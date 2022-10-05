package com.cloudfitc.ejercicios.parte1.claseAbstracta;

public class Audifonos extends Periferico{
    public Audifonos(String nombre, tipoConexion conexion) {
        super(nombre, conexion);
    }

    @Override
    public boolean conectar() {
        return false;
    }

    @Override
    public void recibirInformacion(String informacion) {
        System.out.println(informacion);

    }

    @Override
    public String enviarInformacion() {
        return "Info Audifono";
    }

    @Override
    public String toString() {
        return "Audifonos{}";
    }
}

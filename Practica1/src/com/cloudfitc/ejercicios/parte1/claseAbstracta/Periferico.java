package com.cloudfitc.ejercicios.parte1.claseAbstracta;

public abstract class Periferico {
    private String nombre;
    public enum tipoConexion {USB, HDMI, JACK};
    private tipoConexion conexion;

    public abstract boolean conectar();
    public abstract void recibirInformacion(String informacion);
    public abstract String enviarInformacion();

    public Periferico(String nombre, tipoConexion conexion) {
        super();
        this.nombre = nombre;
        this.conexion = conexion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public tipoConexion getConexion() {
        return conexion;
    }
}

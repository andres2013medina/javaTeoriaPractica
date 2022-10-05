package com.cloudfitc.ejercicios.parte1.claseAbstracta;

public class Casco extends Periferico{

    public Casco(String nombre, tipoConexion conexion) {
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
        return "Casco envio informacion";
    }
}

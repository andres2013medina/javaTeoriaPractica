package com.cloudfitc.ejercicios.parte1.claseAbstracta;

public class Microfono extends Periferico{

    public Microfono(String nombre, tipoConexion conexion) {
        super(nombre, conexion);
    }

    @Override
    public boolean conectar() {
        return true;
    }

    @Override
    public void recibirInformacion(String informacion) {
        System.out.println(informacion);
    }

    @Override
    public String enviarInformacion() {
        return "Microfono envio informacion";
    }
}

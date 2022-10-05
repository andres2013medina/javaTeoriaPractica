package com.cloudfitc.ejercicios.parte1.Herencias;

import java.util.Calendar;

public class Refresco extends Consumible{

    private Envase envase;
    private double volumen;
    private boolean nevera;

    public Refresco(String nombre, String descripcion, String proveedor, Calendar fechaCaducidad, Envase envase, double volumen, boolean nevera) {
        super(nombre, descripcion, proveedor, fechaCaducidad);
        this.envase = envase;
        this.volumen = volumen;
        this.nevera = nevera;
    }

    public Refresco(String nombre, String descripcion, String proveedor, Envase envase, double volumen, boolean nevera) {
        super(nombre, descripcion, proveedor);
        this.envase = envase;
        this.volumen = volumen;
        this.nevera = nevera;
    }

    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public boolean isNevera() {
        return nevera;
    }

    public void setNevera(boolean nevera) {
        this.nevera = nevera;
    }

    @Override
    public String toString() {
        String consumible = super.toString();
        consumible += " envase= " + envase + ", volumen= " + volumen + (isNevera()? " Guardar Nevera":"");
        return consumible;
    }
}


package com.cloudfitc.ejercicios.parte1.Herencias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Consumible {
    private String nombre;
    private String descripcion;
    private String proveedor;
    private Calendar fechaCaducidad;

    public Consumible(String nombre, String descripcion, String proveedor, Calendar fechaCaducidad) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        this.fechaCaducidad = fechaCaducidad;
    }

    public Consumible(String nombre, String descripcion, String proveedor) {
        super();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.proveedor = proveedor;
    }

    public boolean EstaCaducado(){
        Calendar fechaActual = new GregorianCalendar();
        return this.fechaCaducidad.before(fechaActual);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public Calendar getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Calendar fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return "nombre='" + nombre + '\'' +
                ", fechaCaducidad=" + fechaCaducidad.getTime() +
                '}';
    }
}

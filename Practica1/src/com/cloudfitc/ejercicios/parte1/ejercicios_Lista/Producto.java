package com.cloudfitc.ejercicios.parte1.ejercicios_Lista;

import java.util.Random;

public class Producto {

    static final String NOMBRE_POR_DEFECTO = " -- SIN NOMBRE -- ";
    private String codigo;
    private String nombre;
    private String descripcion;

    public Producto(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    {
        Random r = new Random();
        char c = (char) ((r.nextInt(26) + 'A'));
        int n = r.nextInt(1000 - 100 + 1) + 100;
        codigo = String.valueOf(c) + String.valueOf(n);
    }


    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre == "") {
            this.nombre = NOMBRE_POR_DEFECTO;
        } else {
            this.nombre = nombre;
        }
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Producto[" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ']';
    }
}

package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.Objects;

public class Producto implements Comparable<Producto> {
    private int codigo;
    private String nombre;

    public Producto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Producto() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public int compareTo(Producto producto) {
        return this.codigo - producto.codigo;
//        return this.nombre.compareTo(producto.nombre);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return getCodigo() == producto.getCodigo() && Objects.equals(getNombre(), producto.getNombre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo(), getNombre());
    }
}

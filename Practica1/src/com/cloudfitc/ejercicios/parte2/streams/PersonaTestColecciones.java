package com.cloudfitc.ejercicios.parte2.streams;

import java.util.List;

public class PersonaTestColecciones {
    private int codigo;
    private String nombre;

    public PersonaTestColecciones(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
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
        return "PersonaTestColecciones{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public List<String> getIdiomas() {
        return List.of("Ingles", "Espanol", "Frances");
    }
}

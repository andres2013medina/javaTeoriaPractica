package com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.entidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Director implements Comparable<Director> {
    private int id;
    private String nombre;
    private LocalDate fechaNaciomiento;

    public Director(int id, String nombre, LocalDate fechaNaciomiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNaciomiento = fechaNaciomiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNaciomiento() {
        return fechaNaciomiento;
    }

    public void setFechaNaciomiento(LocalDate fechaNaciomiento) {
        this.fechaNaciomiento = fechaNaciomiento;
    }


    @Override
    public String toString() {
        return nombre + " " + fechaNaciomiento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director)) return false;
        Director director = (Director) o;
        return getId() == director.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public int compareTo(Director o) {
        return this.id - o.getId();
    }
}

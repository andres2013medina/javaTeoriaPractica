package com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.entidad;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Pelicula implements Comparable<Pelicula> {
    private String titulo;
    private LocalDate fechaPublicacion;
    private Director director;

    public Pelicula(String titulo, LocalDate fechaPublicacion, Director director) {
        this.titulo = titulo;
        this.fechaPublicacion = fechaPublicacion;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pelicula)) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(getTitulo(), pelicula.getTitulo()) && Objects.equals(getFechaPublicacion(), pelicula.getFechaPublicacion()) && Objects.equals(getDirector(), pelicula.getDirector());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitulo(), getFechaPublicacion(), getDirector());
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                " \ntitulo='" + titulo +
                " \nfechaPublicacion=" + fechaPublicacion.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) +
                ", \ndirector=" + director +
                '}';
    }

    @Override
    public int compareTo(Pelicula o) {
        return this.titulo.compareTo(o.getTitulo());
    }
}

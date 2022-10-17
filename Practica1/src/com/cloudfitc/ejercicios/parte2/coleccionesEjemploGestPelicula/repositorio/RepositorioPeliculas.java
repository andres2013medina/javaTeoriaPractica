package com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.repositorio;

import com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.entidad.Director;
import com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.entidad.Pelicula;

import java.util.*;

public class RepositorioPeliculas {

    private Set<Pelicula> peliculas;

    public RepositorioPeliculas() {
        peliculas = new TreeSet<>();
    }

    public Set<Pelicula> findAllPeliculas() {
        return peliculas;
    }

    public Set<Pelicula> findPeliculasByDirector(Director director) {
        Set<Pelicula> peliculasDirector = new TreeSet<Pelicula>();
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDirector().equals(director)) {
                peliculasDirector.add(pelicula);
            }
        }
        return peliculasDirector;
    }

    public boolean addPelicula(Pelicula pelicula) {
        return peliculas.add(pelicula);
    }

    public Map<Director, Set<Pelicula>> findAllPeliculasGroupByDirector() {
        Set<Director> directores = new HashSet<>();
        for (Pelicula pelicula : peliculas) {
            directores.add(pelicula.getDirector());
        }
        Map<Director, Set<Pelicula>> peliculasPorDirector = new TreeMap<Director, Set<Pelicula>>();
        for (Director director : directores) {
            peliculasPorDirector.put(director, findPeliculasByDirector(director));
        }
        return peliculasPorDirector;
    }
}

package com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.repositorio;

import com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.entidad.Director;

import java.util.HashSet;
import java.util.Set;

public class RepositorioDirectores {

    private Set<Director> directores;

    public RepositorioDirectores() {
        this.directores = new HashSet<>();
    }

    public void addDirector(Director director) {
        directores.add(director);
    }

    public Set<Director> findAllDirectores() {
        return directores;
    }

    public Set<Director> findDirectoresByNombre(String nombre) {
        Set<Director> directoresPorNombre = new HashSet<>();
        for (Director director : directores) {
            if (director.getNombre() == nombre) {
                directoresPorNombre.add(director);
            }
        }
        return directoresPorNombre;
    }

}

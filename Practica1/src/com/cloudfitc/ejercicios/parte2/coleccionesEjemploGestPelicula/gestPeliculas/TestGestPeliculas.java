package com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.gestPeliculas;

import com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.entidad.Director;
import com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.entidad.Pelicula;
import com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.repositorio.RepositorioDirectores;
import com.cloudfitc.ejercicios.parte2.coleccionesEjemploGestPelicula.repositorio.RepositorioPeliculas;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;

public class TestGestPeliculas {
    public static void main(String[] args) {

        /*
         * Pelicula -> Director 1-1
         * Director -> Pelicula 0-N
         * */

        RepositorioPeliculas repositorioPeliculas = new RepositorioPeliculas();
        RepositorioDirectores repositorioDirectores = new RepositorioDirectores();

        Director director = new Director(1, "juan", LocalDate.of(1970, 2, 3));
        Director director1 = new Director(2, "Pedro", LocalDate.of(1990, 1, 5));
        repositorioDirectores.addDirector(director);
        repositorioDirectores.addDirector(director1);

        System.out.println(repositorioDirectores.findAllDirectores());
        System.out.println();

        Pelicula pelicula = new Pelicula("Star wars", LocalDate.of(1990, 5, 7), director);
        Pelicula pelicula1 = new Pelicula("Dos", LocalDate.of(1940, 2, 3), director);
        Pelicula pelicula2 = new Pelicula("tri", LocalDate.of(1990, 5, 2), director1);
        Pelicula pelicula3 = new Pelicula("quatri", LocalDate.of(2005, 4, 2), director);

        repositorioPeliculas.addPelicula(pelicula);
        repositorioPeliculas.addPelicula(pelicula1);
        repositorioPeliculas.addPelicula(pelicula2);
        repositorioPeliculas.addPelicula(pelicula3);

/*        System.out.println(repositorioPeliculas.findAllPeliculas());
        System.out.println();
        System.out.println(repositorioPeliculas.findPeliculasByDirector(director1));
        System.out.println();
        System.out.println(repositorioPeliculas.findPeliculasByDirector(director));
        System.out.println();*/

        Map<Director, Set<Pelicula>> peliculasPorDirector = repositorioPeliculas.findAllPeliculasGroupByDirector();

        for (Director d : peliculasPorDirector.keySet()) {
            System.out.println("Director: " + d);
            for (Pelicula peli : peliculasPorDirector.get(d)) {
                System.out.println(peli);
            }
        }
    }
}

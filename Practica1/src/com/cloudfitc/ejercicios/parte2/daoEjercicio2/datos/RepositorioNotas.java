package com.cloudfitc.ejercicios.parte2.daoEjercicio2.datos;


import com.cloudfitc.ejercicios.parte2.daoEjercicio2.dto.NotaDTO;
import com.cloudfitc.ejercicios.parte2.daoEjercicio2.entidad.Nota;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// simula el almacen de datos (ya que no hemos visto Persistencia)

public class RepositorioNotas {
    private static List<Nota> listaNotas = new ArrayList<>();

    static {
        listaNotas.add(new Nota(1, "Nota 1", "mensaje 1", new Date(), "INFO"));
        listaNotas.add(new Nota(2, "Nota 2", "mensaje 2", new Date(), "IMPORTANTE"));
        listaNotas.add(new Nota(3, "Nota 3", "mensaje 3", new Date(), "RECORDATORIO"));
    }

    public List<Nota> obtenerNotas() {
        return listaNotas;
    }

    public boolean nuevaNota(Nota nota) {
        nota.setId(obtenerNuevoID());
        return listaNotas.add(nota);
    }

    private int obtenerNuevoID() {
        return listaNotas.stream().mapToInt(n -> n.getId()).max().orElse(0) + 1;
    }

    public Nota editarNota(Nota nota) {
        return listaNotas.set(obtenerPosicionNota(nota.getId()), nota);
    }

    public Nota eliminarNota(int id) {
        return listaNotas.remove(obtenerPosicionNota(id));
    }

    private int obtenerPosicionNota(int idNota) {
        int i = 0;
        for (Nota nota : listaNotas) {
            if (nota.getId() == idNota) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }

    public boolean existeNota(int id) {
        return listaNotas.stream().mapToInt(n -> n.getId()).anyMatch(n -> n == id);
    }


}

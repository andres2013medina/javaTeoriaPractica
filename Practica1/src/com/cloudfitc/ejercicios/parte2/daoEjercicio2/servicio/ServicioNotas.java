package com.cloudfitc.ejercicios.parte2.daoEjercicio2.servicio;

import com.cloudfitc.ejercicios.parte2.daoEjercicio2.dto.NotaDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ServicioNotas {

    private static List<NotaDTO> listaNotas = new ArrayList<>();

    static {
        listaNotas.add(new NotaDTO(1, "Nota 1", "mensaje 1", LocalDate.now(), NotaDTO.Etiqueta.INFO));
        listaNotas.add(new NotaDTO(2, "Nota 2", "mensaje 2", LocalDate.now(), NotaDTO.Etiqueta.IMPORTANTE));
        listaNotas.add(new NotaDTO(3, "Nota 3", "mensaje 3", LocalDate.now(), NotaDTO.Etiqueta.RECORDATORIO));
    }

    public List<NotaDTO> obtenerNotas() {
        return listaNotas;
    }

    public void nuevaNota(NotaDTO nota) {
        listaNotas.add(nota);
    }

    public void updateNota(NotaDTO notaModificar) {
        listaNotas.set(obtenerPosicionNota(notaModificar.getId()), notaModificar);
    }

    public NotaDTO eliminarNota(int id) {
        return listaNotas.remove(obtenerPosicionNota(id));
    }

    private int obtenerPosicionNota(int idNota) {
        int i = 0;
        for (NotaDTO notaDTO : listaNotas) {
            if (notaDTO.getId() == idNota) {
                return i;
            } else {
                i++;
            }
        }
        return -1;
    }
}

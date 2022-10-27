package com.cloudfitc.ejercicios.parte2.daoEjercicio2.negocio.servicio;

import com.cloudfitc.ejercicios.parte2.daoEjercicio2.dto.NotaDTO;
import com.cloudfitc.ejercicios.parte2.daoEjercicio2.entidad.Nota;
import com.cloudfitc.ejercicios.parte2.daoEjercicio2.negocio.dao.INotaDAO;
import com.cloudfitc.ejercicios.parte2.daoEjercicio2.negocio.dao.NotaDAO;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ServicioNotas {

    private INotaDAO notaDAO = new NotaDAO();


    public List<NotaDTO> obtenerNotas() {
        return notaDAO.obtenerNotas().stream().map(nota -> convetirNota(nota)).collect(Collectors.toList());
    }

    public void nuevaNota(NotaDTO nota) {
        notaDAO.nuevaNota(convertirNota(nota));
    }

    public void updateNota(NotaDTO notaModificar) {
        notaDAO.editarNota(convertirNota(notaModificar));

    }

    public NotaDTO eliminarNota(int id) {
        return convetirNota(notaDAO.eliminarNota(id));
    }

    private Nota convertirNota(NotaDTO notaDTO) {
        return new Nota(notaDTO.getId(),
                notaDTO.getTitulo(),
                notaDTO.getMensaje(),
                Date.from(notaDTO.getFechaPublicacion().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant()),
                notaDTO.getEtiqueta().toString());
    }

    private NotaDTO convetirNota(Nota nota) {
        return new NotaDTO(nota.getId(),
                nota.getTitulo(),
                nota.getMensaje(),
                nota.getFechaPublicacion().toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                NotaDTO.Etiqueta.valueOf(nota.getEtiqueta()));
    }


}

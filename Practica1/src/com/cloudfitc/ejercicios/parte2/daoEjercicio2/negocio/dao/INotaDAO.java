package com.cloudfitc.ejercicios.parte2.daoEjercicio2.negocio.dao;

import com.cloudfitc.ejercicios.parte2.daoEjercicio2.entidad.Nota;

import java.util.List;

public interface INotaDAO {

    List<Nota> obtenerNotas();

    void nuevaNota(Nota nota);

    void editarNota(Nota nota);

    Nota eliminarNota(int id);

    boolean existeNota(int id);

    void guardarNotas();

}

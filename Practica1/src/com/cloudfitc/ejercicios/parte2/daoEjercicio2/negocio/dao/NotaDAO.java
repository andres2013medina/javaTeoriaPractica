package com.cloudfitc.ejercicios.parte2.daoEjercicio2.negocio.dao;

import com.cloudfitc.ejercicios.parte2.daoEjercicio2.datos.RepositorioNotas;
import com.cloudfitc.ejercicios.parte2.daoEjercicio2.entidad.Nota;

import java.util.List;

public class NotaDAO implements INotaDAO {

    private RepositorioNotas repositorioNotas = new RepositorioNotas();

    @Override
    public List<Nota> obtenerNotas() {
        return repositorioNotas.obtenerNotas();
    }

    @Override
    public void nuevaNota(Nota nota) {
        repositorioNotas.nuevaNota(nota);
    }

    @Override
    public void editarNota(Nota nota) {
        repositorioNotas.editarNota(nota);
    }

    @Override
    public Nota eliminarNota(int id) {
        return repositorioNotas.eliminarNota(id);
    }

    @Override
    public boolean existeNota(int id) {
        return repositorioNotas.existeNota(id);
    }

    @Override
    public void guardarNotas() {

    }
}

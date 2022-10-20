package com.cloudfitc.ejercicios.parte2.daoEjercicio2.presentacion;

import com.cloudfitc.ejercicios.parte2.daoEjercicio2.dto.NotaDTO;
import com.cloudfitc.ejercicios.parte2.daoEjercicio2.servicio.ServicioNotas;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MenuPrincipal {

    private List<NotaDTO> listaNotas;
    private ServicioNotas sNotas;

    public MenuPrincipal() {
        sNotas = new ServicioNotas();
    }

    public void inicioAPP() {
        listaNotas = sNotas.obtenerNotas();
        mostrarListaNotas();
        ejecutarOpcion(solicitarOpcion());
        inicioAPP();

    }

    private void ejecutarOpcion(char opcion) {
        Opcion o = Opcion.obtenerOpcion(opcion);

        switch (o) {
            case ADD:
                solicitarAddNota();
                break;
            case EXIT:
                exit();
                break;
            case DELETE:
                solicitarDeleteNota();
                break;
            case UPDATE:
                solicitarUpdateNota();
                break;
        }
    }

    private void exit() {
        System.exit(0);
    }

    private void solicitarDeleteNota() {
        int posicion = ConsolaUtils.solicitarNumero("Numero de la nota que quiere eliminar");
        int idNota = listaNotas.get(posicion).getId();
        NotaDTO notaEliminada = sNotas.eliminarNota(idNota);
        ConsolaUtils.mostrarMensaje("Nota Eliminada \n" + notaEliminada);
    }

    private void solicitarUpdateNota() {
        int posicion = ConsolaUtils.solicitarNumero("Numero de la nota que quiere modificar?");
        int idNota = listaNotas.get(posicion).getId();
        NotaDTO notaModificar = solicitarDatosNota();
        notaModificar.setId(idNota);
        sNotas.updateNota(notaModificar);

    }

    private void solicitarAddNota() {
        ConsolaUtils.mostrarMensaje("Nueva Nota: ");
        NotaDTO nota = solicitarDatosNota();
        sNotas.nuevaNota(nota);
    }

    private NotaDTO solicitarDatosNota() {
        String etiqueta = ConsolaUtils.solicitarLinea("Etiqueta" + Arrays.toString(NotaDTO.Etiqueta.values()).toUpperCase(Locale.ROOT));
        while (!validarEtiqueta(etiqueta)) {
            ConsolaUtils.mostrarMensaje("Etiqueta Erronea");
            etiqueta = ConsolaUtils.solicitarLinea("Etiqueta" + Arrays.toString(NotaDTO.Etiqueta.values()).toUpperCase(Locale.ROOT));
        }
        String titulo = ConsolaUtils.solicitarLinea("Titulo: ");
        String mensaje = ConsolaUtils.solicitarLinea("Mensaje: ");
        LocalDate fechaPublicacion = LocalDate.now();
        return new NotaDTO(titulo, mensaje, fechaPublicacion, NotaDTO.Etiqueta.valueOf(etiqueta));
    }

    private boolean validarEtiqueta(String etiqueta) {
        return NotaDTO.Etiqueta.contains(etiqueta);
    }

    private char solicitarOpcion() {
        Arrays.stream(Opcion.values()).forEach(op -> ConsolaUtils.mostrarMensaje(op.getLetra() + "-" + op.getNombre()));
        char opcion = ConsolaUtils.letraConsola("Elije una opcion:_");
        while (!validarOpcion(opcion)) {
            ConsolaUtils.mostrarMensaje("Opcion Erronea");
            opcion = ConsolaUtils.letraConsola("Elije una opcion:_");
        }
        return opcion;
    }

    private boolean validarOpcion(char opcion) {
        return Opcion.contains(opcion);
    }

    private void mostrarListaNotas() {
        ConsolaUtils.mostrarLista(listaNotas);
    }

    private enum Opcion {
        ADD('A', "add"), UPDATE('U', "Update"), DELETE('D', "Delete"), EXIT('E', "Exit");
        private char letra;
        private String nombre;

        Opcion(char letra, String nombre) {
            this.letra = letra;
            this.nombre = nombre;
        }

        public char getLetra() {
            return letra;
        }

        public void setLetra(char letra) {
            this.letra = letra;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public static boolean contains(char letra) {
            return Arrays.stream(Opcion.values()).anyMatch(o -> o.getLetra() == letra);
        }

        public static Opcion obtenerOpcion(char letra) {
            return Arrays.stream(Opcion.values()).filter(o -> o.getLetra() == letra).findAny().orElse(null);
        }
    }
}

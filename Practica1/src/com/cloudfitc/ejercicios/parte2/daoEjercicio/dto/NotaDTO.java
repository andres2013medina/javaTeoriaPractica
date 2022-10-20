package com.cloudfitc.ejercicios.parte2.daoEjercicio.dto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;

public class NotaDTO {

    public enum Etiqueta {
        IMPORTANTE, RECORDATORIO, INFO;

        public static boolean contains(String etiqueta) {
            return Arrays.stream(Etiqueta.values()).map(e -> e.toString()).anyMatch(e -> e.equals(etiqueta));
        }
    }

    private int id;
    private String titulo;
    private String mensaje;
    private LocalDate fechaPublicacion;
    private Etiqueta etiqueta;

    public NotaDTO(int id, String titulo, String mensaje, LocalDate fechaPublicacion, Etiqueta etiqueta) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fechaPublicacion = fechaPublicacion;
        this.etiqueta = etiqueta;
    }

    public NotaDTO(String titulo, String mensaje, LocalDate fechaPublicacion, Etiqueta etiqueta) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fechaPublicacion = fechaPublicacion;
        this.etiqueta = etiqueta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public Etiqueta getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(Etiqueta etiqueta) {
        this.etiqueta = etiqueta;
    }

    @Override
    public String toString() {
        return titulo.toUpperCase(Locale.ROOT) + " # " + etiqueta + "# \n" + mensaje + "\n"
                + fechaPublicacion.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + "\n --------------";
    }
}

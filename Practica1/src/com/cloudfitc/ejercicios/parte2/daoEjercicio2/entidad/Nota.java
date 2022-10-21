package com.cloudfitc.ejercicios.parte2.daoEjercicio2.entidad;

import java.util.Date;

public class Nota {

    private int id;
    private String titulo;
    private String mensaje;
    private Date fechaPublicacion;
    private String etiqueta;

    public Nota(int id, String titulo, String mensaje, Date fechaPublicacion, String etiqueta) {
        this.id = id;
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.fechaPublicacion = fechaPublicacion;
        this.etiqueta = etiqueta;
    }

    public Nota(String titulo, String mensaje, Date fechaPublicacion, String etiqueta) {
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

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

}

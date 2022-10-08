package com.cloudfitc.ejercicios.parte1.patronesDeDiseno;

public class TestBuilder {

    public static void main(String[] args) {
        /*
         * */

        Vivienda v1 = Vivienda.builder("caracas").buid();

    }
}

class Vivienda {
    private String direccion;
    private double superficie;
    private int pisos;
    private boolean tieneGaraje;

    public Vivienda(String direccion, double superficie, int pisos, boolean tieneGaraje) {
        super();
        this.direccion = direccion;
        this.superficie = superficie;
        this.pisos = pisos;
        this.tieneGaraje = tieneGaraje;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getPisos() {
        return pisos;
    }

    public boolean isTieneGaraje() {
        return tieneGaraje;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "direccion='" + direccion + '\'' +
                ", superficie=" + superficie +
                ", pisos=" + pisos +
                ", tieneGaraje=" + tieneGaraje +
                '}';
    }

    public static ViviendaBuilder builder(String direccion) {
        return new ViviendaBuilder(direccion);
    }

    interface IViviendaBuilder {
        Vivienda buid();
    }

    public static class ViviendaBuilder implements IViviendaBuilder {
        private String direccion;
        private double superficie;
        private int pisos;
        private boolean tieneGaraje;

        public ViviendaBuilder(String direccion) {
            this.direccion = direccion;
        }

        public ViviendaBuilder withSuperficie(double superficie) {
            this.superficie = superficie;
            return this;
        }

        public ViviendaBuilder withPisos(int pisos) {
            this.pisos = pisos;
            return this;
        }

        public ViviendaBuilder withGaraje(boolean tieneGaraje) {
            this.tieneGaraje = tieneGaraje;
            return this;
        }

        @Override
        public Vivienda buid() {
            return new Vivienda(direccion, superficie, pisos, tieneGaraje);
        }
    }
}

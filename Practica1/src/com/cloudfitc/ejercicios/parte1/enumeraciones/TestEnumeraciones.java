package com.cloudfitc.ejercicios.parte1.enumeraciones;

public class TestEnumeraciones {

    public static void main(String[] args) {

        Vehiculo v = Vehiculo.TURISMO;
        System.out.println(v);
        Vehiculo[] arrVehiculos = Vehiculo.values();

        String nombreVehiculo = v.name();
        int posicionVehiculo = v.ordinal();
        System.out.println(v + "  ocupa la posicion " + posicionVehiculo);

        switch (v){
            case CAMION:
                System.out.println("Soy un camion");
                break;
            case TURISMO:
                System.out.println("soy un Turismo");
                break;
            case FURGONETA:
                System.out.println("soy un Furgoneta");
                break;
        }

    }
}

enum Vehiculo {
    TURISMO, FURGONETA, CAMION;

    private int pesoMaximo;
    private int longitudMaxima;

    Vehiculo() {
        this.pesoMaximo = 3500;
    }

    Vehiculo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    Vehiculo(int pesoMaximo, int longitudMaxima) {
        this.pesoMaximo = pesoMaximo;
        this.longitudMaxima = longitudMaxima;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "pesoMaximo=" + pesoMaximo +
                ", longitudMaxima=" + longitudMaxima +
                '}';
    }
}

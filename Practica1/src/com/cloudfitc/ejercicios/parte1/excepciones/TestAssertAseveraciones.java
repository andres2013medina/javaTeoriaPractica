package com.cloudfitc.ejercicios.parte1.excepciones;

public class TestAssertAseveraciones {
    public static void main(String[] args) {
        double precio = 100;
        double precioFinal = obtenerPrecioFinal(precio);
        assert precioFinal >= 0 && precioFinal > precio;
        System.out.println(precioFinal);

        double precio2 = -100;
        double precioFinal2 = obtenerPrecioFinal2(precio2);
        assert precioFinal2 >= 0 && precioFinal > precio : "Se ha introducido un precio negativo";
        System.out.println(precioFinal2);

        /*
         * Intellij -> RUN : EDIT CONFIGURATION : ADD VM OPTIONS
         * java -ea TestAssertAseveraciones ACTIVA
         * java -da TestAssertAseveraciones DESACTIVA
         * */
    }

    private static double obtenerPrecioFinal(double precio) {
        double precioFinal = 0;
        double iva = 0.21;
        if (precio > 0) {
            precioFinal = precio + (precio * iva);
        }
        return precioFinal;

    }

    private static double obtenerPrecioFinal2(double precio) {
        double iva = 0.21;
        return precio + (precio * iva);
    }
}

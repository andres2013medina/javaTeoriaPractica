package com.cloudfitc.ejercicios.parte1.TestJUnit;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class TestJUnit {

    public static void main(String[] args) {

        /*
         * Preparar datos de entrada
         *
         * Ejecucion del metodo a probar
         *
         * Comprobacion del resultado con asserts
         *
         * */

        System.out.println(FechaUtils.convertirFechaAString(new Date()));
        System.out.println(FechaUtils.obtenerDate(2010, 12, 13));

    }
}

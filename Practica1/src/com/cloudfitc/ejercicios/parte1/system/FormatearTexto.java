package com.cloudfitc.ejercicios.parte1.system;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class FormatearTexto {

    public static void main(String[] args) {
        /*
         * %s -> String
         * %d -> Entero
         * %f -> Decimal
         * %t -> Fechas
         *   %tF -> 2020-12-09
         *   %tT -> 20:34:00
         * */

        PrintStream ps = System.out;
        ps.println("linea");

        Scanner sc = new Scanner(System.in);

        String texto = "texto";
        int numero = 5;
        double decimal = 3.5;
        Date fecha = new Date();
        ps.printf("Texto que quiero formatear %s %d", texto, numero);
        System.out.println();
        ps.printf("Texto que quiero formatear |%s| |%3d| |%.2f| |%tF|", texto, numero, decimal, fecha);
        System.out.println();
        String formato = "Texto que quiero formatear |%10s| |%3d| |%.2f| |%tF|";
        String textoFormateado = String.format(formato,texto,numero,decimal,fecha);

        long milisegundos = System.currentTimeMillis();
        Date fecha2 = new Date();
//        System.exit(0);

        // Copiar Array de forma eficiente.
        int[] array1 = {1,2,3,4};
        int[] array2 = new int[array1.length];

        System.arraycopy(array1,0,array2,0,array1.length);

        System.out.println(Arrays.toString(array2));


    }
}

package com.cloudfitc.ejercicios.parte2.daoEjercicio2.presentacion;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ConsolaUtils {

    private static Scanner sc = new Scanner(System.in);

    public static <T> void mostrarLista(List<T> list) {
        System.out.println("-------Lista-------");
        int i = 0;

        for (T elem : list) {
            System.out.println(i++ + " - " + elem.toString());
        }
        System.out.println("------End List------");
    }

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static char letraConsola(String mensaje) {
        System.out.println(mensaje);
        String linea = sc.nextLine();
        if (linea.length() > 1) {
            letraConsola(mensaje);
        }
        return linea.toUpperCase(Locale.ROOT).charAt(0);

    }

    public static String solicitarLinea(String mensaje) {
        System.out.println(mensaje);
        return sc.nextLine();
    }

    public static int solicitarNumero(String mensaje) {
        System.out.println(mensaje);
        int numero = 0;
        try {
            numero = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            solicitarNumero(mensaje);
        }
        return numero;
    }
}

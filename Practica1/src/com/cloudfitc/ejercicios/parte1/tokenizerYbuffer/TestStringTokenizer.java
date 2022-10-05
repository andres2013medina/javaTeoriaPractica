package com.cloudfitc.ejercicios.parte1.tokenizerYbuffer;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TestStringTokenizer {
    public static void main(String[] args) {

        String texto = "A Coruna; LUGO, Ourense. Pontevedra";
        StringTokenizer st = new StringTokenizer(texto);
        st = new StringTokenizer(texto, ",;.");
        st = new StringTokenizer(texto, ",;.", true);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        //String
        String[] arrayTexto = texto.split("[,;.]+");
        System.out.println(Arrays.toString(arrayTexto));

        //Scanner
        Scanner sc = new Scanner("texto introducido \n en el \t Scanner");
        System.out.println(sc.delimiter().toString());

        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();

    }

    public static int leerEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int entero = 0;
        System.out.println(mensaje);
        if (sc.hasNextInt()) {
            entero = sc.nextInt();
            sc.close();
        } else {

        }
        return entero;
    }


}

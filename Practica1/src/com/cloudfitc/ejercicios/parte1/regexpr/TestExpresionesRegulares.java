package com.cloudfitc.ejercicios.parte1.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestExpresionesRegulares {
    public static void main(String[] args) {

        String texto = "123a";
        Pattern patron = Pattern.compile("\\d{3}");
        Matcher matcher = patron.matcher(texto);

        System.out.println("Coincide con el patron? " + matcher.matches());

        // String tambien tiene una clase que funciona asi.
        System.out.println("Prueba con String.matches() " + texto.matches("\\d{3}"));

        // Otro ejemplo:
        String textoEjemplo2 = "Nombre: Tono - Contrasena: tono1970";
        Pattern patron2 = Pattern.compile("\\W+");
        Matcher matcher2 = patron2.matcher(textoEjemplo2);

        while (matcher2.find()) {
            System.out.print(matcher2.group() + "#");
        }
        System.out.println();

        // para reiniciar el matcher (para que empiece desde el comienzo de nuevo)
        matcher2.reset();

        // Start y end sirven para dar las posiciones de las coincidencias del matcher
        System.out.println("Posiciones de los caracteres especiales: ");
        while (matcher2.find()) {
            System.out.print(matcher2.start() + "-" + matcher2.end() + "#");
        }
        System.out.println();

        /*
         *  ((A(B(C))) (D(E))(F))
         * Grupo 0 - todo el conjunto ABCDEF
         * Grupo 1 - ABC
         * Grupo 2 - A
         * Grupo 3 - BC
         * Grupo 4 - C
         * Grupo 5 - DEF
         * Grupo 6 - DE
         * Grupo 7 - E
         * Grupo 8 - F
         * */

        String codigo = "Tx5 - dY9P31";
        Pattern patron3 = Pattern.compile("([a-zA-Z]{2}\\d)( - )(\\w{6})");
        Matcher matcher3 = patron3.matcher(codigo);

        if (matcher3.matches()) {
            System.out.println("grupo 0: " + matcher3.group(0));
            System.out.println("grupo 1: " + matcher3.group(1));
            System.out.println("grupo 2: " + matcher3.group(2));
            System.out.println("grupo 3: " + matcher3.group(3));
        }

        // verificar que una expresion sea correcta

        String s1 = "X121";
        boolean coincide = s1.matches("([A-Z]\\d{3})|(\\d[A-Z]{3})");
        System.out.println("Coincide?" + coincide);

        // Reemplazar un character en una cadena de String

        String s2 = "España es un país de la Unión Europea";
        s2 = s2.replace("ñ", "nh");
        System.out.println(s2);
        s2 = s2.replaceAll("[ae]", "?");
        System.out.println(s2);

        String datosUsuario = "Usuario: Juanito - Contrasena: [123456] , Usuario: Pedrito - Contrasena: [123123]";
        Pattern patron4 = Pattern.compile("\\[[^\\]]+\\]");
        Matcher matcher4 = patron4.matcher(datosUsuario);
        StringBuffer buffer = new StringBuffer();
        while (matcher4.find()) {
            matcher4.appendReplacement(buffer, "***");
        }
        matcher4.appendTail(buffer);
        System.out.println(buffer.toString());

        //cambio git
    }
}

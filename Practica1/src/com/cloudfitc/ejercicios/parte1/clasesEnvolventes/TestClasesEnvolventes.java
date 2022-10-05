package com.cloudfitc.ejercicios.parte1.clasesEnvolventes;

import java.math.BigInteger;
import java.util.Scanner;

public class TestClasesEnvolventes {

    public static void main(String[] args) {

        //envoltorio a tipo primitivo o viceVersa
        Integer i = Integer.valueOf(5);

        Double objDouble = 10.5;
        double nDouble = objDouble;

        double resultado = nDouble + objDouble;

        Double[] arrObjDouble = {1.2, 3.4};

        int n = Integer.parseInt("123");

        int valorMax = Integer.MAX_VALUE;
        int valorMin = Integer.MIN_VALUE;
        System.out.println(valorMax);
        System.out.println(valorMin);

        int tamanhoMemoria = Integer.SIZE;
        System.out.println(tamanhoMemoria); //en bits

        Character.isLowerCase('a');
        Character.isUpperCase('B');
        Character.isDigit('5');

        //Ejemplo
        Scanner sc = new Scanner(System.in);
        char c = sc.nextLine().toCharArray()[0];
        if (Character.isDigit(c)) {
            System.out.println("El primer valor introducido es un digito");
        }

        char minuscula = Character.toLowerCase('C');
        char mayuscula = Character.toUpperCase('c');

        Character carA = 'A';

        char[] arrChar = {'a', 'b', 'c'};

        Integer x = 1234;
        String st = x.toString();

        try {
            int in = Integer.parseInt("a 4545");
        } catch (NumberFormatException ex) {
            System.out.println("El texto no puede convertirse en un entero");
        }

        double db = Double.POSITIVE_INFINITY;
        db = Double.NEGATIVE_INFINITY;
        db = Double.NaN;

        boolean noEsUnNumero = Double.isNaN(12.0);
        boolean inf = Double.isInfinite(Double.POSITIVE_INFINITY);

    }

}

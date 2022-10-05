package com.cloudfitc.ejercicios.parte1.ejercicio8_enum;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8Enumeraciones {

    public static void main(String[] args) {

        System.out.println("Introduzca el numero de dias de un mes, posteriormente mostraremos todos los meses que tengan esa" +
                "misma cuandtidad de dias");
        Scanner sc = new Scanner(System.in);
        int dias = sc.nextInt();
        ArrayList<Mes> mesesEncontrado = new ArrayList<>();
        for (Mes mes : Mes.values()) {
            if (dias == mes.getDias()) {
                mesesEncontrado.add(mes);
            }
        }

        for (Mes mes : mesesEncontrado) {
            System.out.println(mes.toString() + " mes numero " + (mes.ordinal()+1));
        }
    }

    enum Mes {
        Enero(31), Febrero(28), Marzo(31), Abril(30), Mayo(31);


        private int dias;

        Mes(int dias) {
            this.dias = dias;

        }

        public int getDias() {
            return dias;
        }
    }
}

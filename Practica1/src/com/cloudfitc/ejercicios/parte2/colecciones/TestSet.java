package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.*;

public class TestSet {
    public static void main(String[] args) {
        /*SET
         *HashSET
         *no Indexado (no tiene indice y no esta ordenada)
         * como modificar un elemento? se borra el elemento y se anade uno nuevo elemento modificado.
         * No admite Repetidos
         *
         * TreeSet
         * No indexada pero si Ordenada
         * Ordena con CompareTo
         * */

        Set<Producto> productoSet = new HashSet<Producto>();

        productoSet.add(new Producto(1, "p1"));
        productoSet.add(new Producto(5, "p5"));
        productoSet.add(new Producto(3, "p3"));

//        System.out.println("Intentar borrar un elemento que ya esta devuelve un false, ya que el .add es boolean");
//        System.out.println(productoSet.add(new Producto(3, "p3")));
//        productoSet.remove(new Producto(3, "p3"));
//        System.out.println(productoSet);
//
//        System.out.println("existe en el set?");
//        System.out.println(productoSet.contains(new Producto(2, "p2")));
//        System.out.println(productoSet.contains(new Producto(2, "p3")));

        // TREE SET

        TreeSet<Producto> productoTreeSet = new TreeSet<Producto>(productoSet);
        System.out.println(productoTreeSet);
        productoTreeSet.add(new Producto(0, "Otro producto"));
        System.out.println(productoTreeSet);

        productoTreeSet.remove(new Producto(5, "p5"));
        System.out.println(productoTreeSet);
        productoTreeSet = new TreeSet<Producto>((p1, p2) -> p1.getNombre().length() - p2.getNombre().length());
        System.out.println(productoTreeSet);

        productoTreeSet.add(new Producto(7, "pa1"));
        productoTreeSet.add(new Producto(6, "p52"));
        productoTreeSet.add(new Producto(55, "sdasdap3"));
        System.out.println(productoTreeSet);

        Producto primerProducto = productoTreeSet.first();
        Producto ultimoProducto = productoTreeSet.last();
        System.out.println(primerProducto + " " + ultimoProducto);

        Integer[] numerosRandoms = generarArrayNAleatoriosNoRepetidos(30, 10, 40);
        System.out.println(Arrays.toString(numerosRandoms));

    }

    private static Integer[] generarArrayNAleatoriosNoRepetidos(int length, int numeroMin, int numeroMax) {

        Random rd = new Random();
        Set<Integer> integerSet = new TreeSet<>();

        while (integerSet.size() < length) {
            integerSet.add(rd.nextInt(numeroMax - numeroMin) + numeroMin);
        }
        return integerSet.toArray(new Integer[length]);
    }

}

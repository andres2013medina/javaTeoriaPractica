package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class TestList {
    public static void main(String[] args) {

        /*
         * List
         * */

        List<String> list = new ArrayList<>();
        list.add("primer elemnt");
        list.add("segund elemento");
        list.add("tercer elemnt");
        list.add("tercer elemnt");

        System.out.println(list);

        // Es mas util para operaciones de insercion y borrado en elementos de por medio
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("primer elemnt");
        linkedList.add("segund elemento");
        linkedList.add("tercer elemnt");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(2));

        // test de la PilaLinked

        PilaLinked<String> pilaLinked = new PilaLinked<String>(list);
        System.out.println("Pila: ");
        while (!pilaLinked.isEmpty()) {
            System.out.println(pilaLinked.pop());
        }

        pilaLinked.push("CuartoElemento");
        pilaLinked.push("QuintoElemento");
        System.out.println("Pila2: ");
        while (!pilaLinked.isEmpty()) {
            System.out.println(pilaLinked.pop());
        }

        // Function y Bifunction

        Function<String, Integer> function = String::length;
        BiFunction<String, String, String> biFunction = String::concat;

        Integer integer = function.apply("cadena");
        System.out.println("Tamano cadena + " + integer);

        // Posicion que ocupa un elemento
        int position = list.indexOf(new String("primer elemnt"));
        System.out.println("Posicion de la lista que ocupa un elemento " + position);
        position = list.lastIndexOf("tercer elemnt");
        System.out.println("Posicion de la lista que ocupa lastIndexOf " + position);


//        no usar si hay varios elemtnos, porque no se puede garantizar cual elemento de los repetidos nos traera
//        position = Collections.binarySearch(list, "tercer elemnt");
//        System.out.println("Usando BinarySearch que sucede " + position);
    }
}

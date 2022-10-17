package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TestDeque {
    public static void main(String[] args) {
        /*los elementos se ordenan FIFO
         *
         * Deque - ArrayDeque
         * NO ADMITE NULL
         * NO INDEX (NO TIENE INDICE)
         * Para eliminar un elemento particular se castea a lista, se elimina y luego se recastea a DEQUE
         * */

        Deque<String> deque = new ArrayDeque<>();
        deque.add("primero");
        deque.add("segundo");
        deque.add("tercero");
        System.out.println(deque);

        deque.addFirst("nuevo primero");
        System.out.println(deque);
        deque.addLast("nuevo ultimo");
        System.out.println(deque);

        System.out.println("eliminar el ultimo elemento borrado: " + deque.removeLast());
        System.out.println();
        System.out.println(deque);

        System.out.println("eliminar el primer elemento que encuentre ");
        deque.removeFirstOccurrence("tercero");
        System.out.println(deque);

        System.out.println();
        System.out.println("no se puede recuperar un elemento en concreto, no esta indexada");
        List<String> list = new ArrayList<>(deque);
        System.out.println(list);
        list.remove("primero");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        deque = new ArrayDeque<>(list);
        System.out.println(deque);


    }

}

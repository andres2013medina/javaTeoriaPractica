package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        /*
         * */

        Collection<Integer> c = List.of(1, 2, 3, 4, 5);
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

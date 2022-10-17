package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
    /*
     * Collections
     * */
    public static void main(String[] args) {
        List<Producto> list = new ArrayList<>();

        list.add(new Producto(23, "leche"));
        list.add(new Producto(56, "pan de molde"));
        list.add(new Producto(12, "aceite"));
        list.add(new Producto(55, "sal"));

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, (p1, p2) -> p1.getNombre().length() - p2.getNombre().length());
        System.out.println(list);

//        Desordena la lista
        Collections.shuffle(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        // producto con el Valor mas alto
        Producto maxProducto = Collections.max(list);
        System.out.println(maxProducto);

        // producto con el valor mas alto segun un Comparator
        Producto maxCondicionProducto = Collections.max(list, (p1, p2) -> p1.getNombre().length() - p2.getNombre().length());

        ListaProductos listaProductos = new ListaProductos(
                new Producto(1, "leche"),
                new Producto(2, "sal"),
                new Producto(5124, "sodio")
        );

        for (Producto p : listaProductos) {
            System.out.println(p);
        }

    }
}

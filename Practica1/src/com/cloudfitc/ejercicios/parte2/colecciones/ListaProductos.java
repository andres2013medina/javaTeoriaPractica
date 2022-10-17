package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.Arrays;
import java.util.Iterator;

public class ListaProductos implements Iterable<Producto> {
    private Producto[] productos;

    public ListaProductos(Producto... productos) {
        this.productos = productos;
    }

    @Override
    public Iterator iterator() {
        return Arrays.asList(productos).iterator();
    }
}
package com.cloudfitc.ejercicios.parte1.ejercicios_Lista;

import java.util.ArrayList;

public class RepositorioProductos {

    private static ArrayList<Producto> productos;

    // Bloque de inicializacion static
    static {
        productos = new ArrayList<Producto>();
    }

    public static void addProducto(Producto producto) {
        productos.add(producto);
    }

    public static void editProducto(int posicion, Producto producto) {
        productos.set(posicion, producto);
    }

    public static void removeProducto(Producto producto) {
        productos.remove(producto);
    }

    public static Producto getProducto(int posicion) {
        return productos.get(posicion);
    }

    public static int findProducto(Producto producto) {
        return productos.indexOf(producto);
    }

    public static Producto[] findAllProductos() {
        Producto[] arrProductos = new Producto[productos.size()];
        return productos.toArray(arrProductos);
    }

    public static Producto[] findProductosByNombre(String nombre) {
        ArrayList<Producto> productoByNombre = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getNombre().startsWith(nombre)) {
                productoByNombre.add(producto);
            }
        }
        Producto[] arrProductos = new Producto[productoByNombre.size()];
        return productoByNombre.toArray(arrProductos);
    }

    public static Producto[] findProductosByLetraCodigo(char letra) {
        ArrayList<Producto> productoByLetra = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getNombre().startsWith(String.valueOf(letra))) {
                productoByLetra.add(producto);
            }
        }
        Producto[] arrProductos = new Producto[productoByLetra.size()];
        return productoByLetra.toArray(arrProductos);
    }
}
package com.cloudfitc.ejercicios.parte1.ejercicios_Lista;

import java.util.Random;

public class TestRepositorioProductos {

    public static void main(String[] args) {
        String[] nombresProductos = {"Portatil", "Compu", "Tarjeta"};
        String[] descripciones = {"asd", "bca", "cda"};
        RepositorioProductos.addProducto(new Producto("test", "testDescripcion"));
        System.out.println("***********");

        for (int i = 0; i < 10; i++) {
            int r = new Random().nextInt(3);
            RepositorioProductos.addProducto(new Producto(nombresProductos[r], descripciones[r]));
        }
        System.out.println("***********");

        for (Producto producto : RepositorioProductos.findAllProductos()) {
            System.out.println(producto.toString());
        }
        System.out.println("***********");

        RepositorioProductos.removeProducto(RepositorioProductos.getProducto(3));

        System.out.println("***********");
        for (Producto producto : RepositorioProductos.findAllProductos()) {
            System.out.println(producto.toString());
        }
        System.out.println("***********");

        for (Producto producto: RepositorioProductos.findProductosByNombre(nombresProductos[0])){
            System.out.println(producto.toString());
        }
    }

}

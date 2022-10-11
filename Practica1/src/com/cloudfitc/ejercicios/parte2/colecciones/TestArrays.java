package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.*;

public class TestArrays {
    public static void main(String[] args) {
        /*
         * Collection -> Gestionar conjunto de elementos.
         * */

        // Si pones un array de partida, se queda con la configuracion del array
        List<String> list = Arrays.asList(new String[]{"hola", "b", "c", "d"});
        System.out.println(list);

//        Esto va a dar error, ya que se partio de un array
//        list.add("e");
//        list.remove(2);
        list.set(1, "aa");
        System.out.println(list);

//        ahora al generar un arraylist con el cast de la lista, se podran usar los metodos de la lista
        list = new ArrayList<>(list);
        list.add("lista");
        System.out.println(list);

        Producto[] productos = {new Producto(1, "leche"), new Producto(3, "pan"),
                new Producto(5, "aceite")};

        Producto[] copiaProductos = Arrays.copyOf(productos, productos.length);
        System.out.println(Arrays.toString(copiaProductos));

//        Arrays.fill(copiaProductos, new Producto(10, "producto por defecto"));
//        System.out.println(Arrays.toString(copiaProductos));

//        Arrays.fill(copiaProductos, 3, 5, new Producto(0, "pumpum"));
        System.out.println(Arrays.toString(copiaProductos));

//        ordenar Arrays

        String[] arrayS = new String[]{"b", "a", "d", "c"};
        Arrays.sort(arrayS);
        System.out.println(Arrays.toString(arrayS));

        Arrays.sort(productos);
        System.out.println(Arrays.toString(productos));

//        comparar con tu metodo TO COMPARE
        Comparator<Producto> comparator = (p1, p2) -> p1.getNombre().length() - p2.getNombre().length();
        Arrays.sort(productos, comparator);
        System.out.println(Arrays.toString(productos));

        Arrays.sort(productos, Collections.reverseOrder(comparator));

//        para usar BinarySearch tiene que estar ordenado la lista de menor a mayor
        Arrays.sort(productos);
        System.out.println(Arrays.toString(productos));
        int position = Arrays.binarySearch(productos, new Producto(3, "pan"));
        System.out.println(position);

//        metodo Equals, para comparar 2 objetos o Listas, tambien puede implementarse para comparar los objetos de 2 listaa.

        Producto p1 = new Producto(1, "leche");
        Producto p2 = new Producto(1, "leche");
        boolean iguales = p1.equals(p2);
        System.out.println(iguales);
    }
}

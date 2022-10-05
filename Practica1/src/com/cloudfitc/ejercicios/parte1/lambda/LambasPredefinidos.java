package com.cloudfitc.ejercicios.parte1.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambasPredefinidos {

    public static void main(String[] args) {

        //remove if
        ArrayList<String> texto = new ArrayList<>(Arrays.asList("abc", "def", "ghij", "klmn"));
        Predicate<String> filter = s -> s.contains("g");
        texto.removeIf(filter);
        System.out.println(texto);

        //replaceALL
        UnaryOperator<String> operator = s -> s.toUpperCase();
        texto.replaceAll(operator);
        System.out.println(texto);

        // Se puede aplicar tambien a objetos.

        ArrayList<Producto> productos = new ArrayList<>(Arrays.asList(new Producto[]{new Producto("Cproducto1"), new Producto("Aproducto2"), new Producto("Dproducto3")}));
        productos.replaceAll(n -> new Producto(n.nombre + " >X< "));
        System.out.println(productos);

        // foreach
        texto.forEach(n -> {
            n = n.toLowerCase();
            System.out.println(n);
        });

        //Sort

        productos.sort((p1, p2) -> p1.nombre.compareTo(p2.nombre));
        System.out.println(productos);

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(new Integer[]{3, 5, 2, 6, 5, 4}));
        numeros.sort((n1, n2) -> n1 - n2);
        System.out.println(numeros);

        //setAll (rellenar array de una forma determinada)
        Integer[] arrNumeros = new Integer[]{2, 3, 5, 3, 2, 6};
        IntFunction<Integer> generator = i -> i * 2; // aqui se modifica cada elemento del array y lo multiplica por un indice.
        Arrays.setAll(arrNumeros, generator);
        System.out.println(Arrays.asList(arrNumeros));

        // Function

        Function<String, Integer> fun = String::length; //t-> t.length(); //sinonimo
        int len = fun.apply("Cuantos caracteres tiene este texto");
        System.out.println(len);

        Function<String, Boolean> fun2 = String::isEmpty; // t-> t.isEmpty();
        Boolean isEmpty = fun2.apply("");
        System.out.println(isEmpty);


    }

}

class Producto {
    String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}


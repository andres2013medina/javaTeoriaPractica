package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        /*
         * Map (Clave:Valor) similar a un archivo Properties,
         * Clave unica
         *
         * un Map contiene (Map.Entry)
         *
         * HashMap y HashTable
         *
         * HashMap : No esta sincronizada y admite null
         *          TreeMap es la clase que tiene un Map ordenado por clave
         *
         * HashTable : No admite nulo
         *
         *
         * */

        Map<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(1, "Elemento1");
        hashMap.put(5, "Elemento5");
        hashMap.put(3, "Elemento3");
        hashMap.put(2, "Elemento2");
        hashMap.put(2, "Actualizar elemento2");
        System.out.println(hashMap);

//        el primer metodo remueve por Key y el segundo por coincidencia total del elemento
        hashMap.remove(3);
        System.out.println(hashMap.remove(2, "solo si coincide"));
        System.out.println(hashMap.remove(2, "Actualizar elemento2"));

        String valor = hashMap.get(1);
        System.out.println(valor);
        System.out.println();

        for (Integer clave : hashMap.keySet()) {
            System.out.println(clave + " " + hashMap.get(clave));
        }

        System.out.println();

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Mapa Ordenado = TreeMap , estan ordenados por key


    }
}

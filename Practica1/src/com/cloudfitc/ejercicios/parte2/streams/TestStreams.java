package com.cloudfitc.ejercicios.parte2.streams;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

public class TestStreams {
    public static void main(String[] args) {

        /*
         *Programacion Funcional (STREAMS)
         * */

        int[] array = new int[]{3246, 3123, 532523, 234, 123};
        System.out.println(Arrays.stream(array).max().getAsInt());
        System.out.println(Arrays.stream(array).min().getAsInt());

        Stream<String> stringStream = Stream.of("asd", "sda", "asd", "fasd");

        System.out.println();
        Stream<Character> characterStream = Stream.generate(() -> (char) (new Random().nextInt(26) + 'A'));
        characterStream.limit(20).forEach(n -> System.out.print(n + " "));

        System.out.println();
        Stream<Double> numerosExp = Stream.iterate(1.0, n -> n * 2);
        numerosExp.limit(20).forEach(n -> System.out.println(n));

        System.out.println();
        Stream<Integer[]> secFibonacci = Stream.iterate(new Integer[]{0, 1}, t -> new Integer[]{t[1], t[0] + t[1]});
        secFibonacci.limit(10).forEach(n -> System.out.print(n[0] + " "));

        System.out.println();
        Stream<String> stringStream1 = Stream.of("efc", "fff", "twd");
        Stream<String> stringStreamConcat = Stream.concat(stringStream1, stringStream);
        stringStreamConcat.forEach(n -> System.out.println(n.toString()));

        System.out.println();
        Character[] characters = characterStream.limit(10).toArray(Character[]::new);

    }

    private static Character[] obtenerCaracteresAleatorios(int cantidad) {
        return Stream.generate(() -> (char) (new Random().nextInt(26) + 'A')).limit(10).toArray(Character[]::new);
    }

}

package com.cloudfitc.ejercicios.parte2.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestColecciones {
    public static void main(String[] args) {
        List<String> list = List.of("pedro", "Luis", "Roberto", "Rodrigo", "DonOmar");
        Stream<String> stringStream = list.stream();

//        stringStream.forEach(System.out::println);
        System.out.println("Algun comienza por a " + list.stream().anyMatch(s -> s.startsWith("a")));
        System.out.println("todos tienen una longitud mayor a 2? " + list.stream().anyMatch(s -> s.length() > 2));

        int[] tamanhos = list.stream().mapToInt(String::length).toArray();
        Arrays.stream(tamanhos).forEach(System.out::println);

        PersonaTestColecciones[] personas = list.stream().map(s ->
                new PersonaTestColecciones(new Random().nextInt(100), s)).toArray(PersonaTestColecciones[]::new);
        Arrays.stream(personas).forEach(System.out::println);

        // transforma un flujo en otro flujo.
        long idiomas = Arrays.stream(personas).flatMap(p -> p.getIdiomas().stream()).distinct().count();
        System.out.println(idiomas);

        Arrays.stream(personas).flatMap(p -> Stream.of(p.getNombre().charAt(0))).distinct().forEach(System.out::println);

        // se salta 2 y luego sigue

        Arrays.stream(personas).skip(2).limit(idiomas).forEach(System.out::println);

        //generar 20 numeros ordenadors

        IntStream.generate(() -> (new Random().nextInt(100))).limit(20).sorted().forEach(n -> System.out.print(n + " "));

        // estableciendo el metodo de ordenar

        Arrays.stream(personas).sorted((p1, p2) -> p1.getNombre().compareTo(p2.getNombre())).forEach(System.out::println);

        // filtros

        System.out.println();
        PersonaTestColecciones p1 = Arrays.stream(personas).filter(p -> p.getNombre().equals("Luis")).findFirst()
                .orElse(new PersonaTestColecciones(0, ""));//.get();
        System.out.println(p1);

        System.out.println();

        Arrays.stream(personas).filter(per -> per.getNombre().equals("Luis")).findFirst().
                ifPresent(pers -> pers.setNombre(pers.getNombre().toUpperCase(Locale.ROOT)));
        Arrays.stream(personas).forEach(System.out::println);

        /*
        Reduccion
        * */

        IntStream.of(4, 2, 3, 5).sum();
        IntStream.of(4, 2, 3, 5).max().getAsInt();
        IntStream.of(4, 2, 3, 5).count();
        IntStream.of(4, 2, 3, 5).average();

        int sumaPares = IntStream.of(4, 2, 3, 5, 6).reduce((ac, n) -> n % 2 == 0 ? ac = ac + n : ac).getAsInt();
        System.out.println("Suma pares: " + sumaPares);

//        metodo A
        String codigos = Arrays.stream(personas).map(p -> Integer.toString(p.getCodigo()))
                .reduce("#", (ac, c) -> ac + c + "#");
        System.out.println(codigos);

//        lo mismo pero usando collector
        System.out.println();

        codigos = Arrays.stream(personas).map(per -> Integer.toString(per.getCodigo())).collect(Collectors.joining("#"));
        System.out.println(codigos);

//

        List<PersonaTestColecciones> listaPersonas = Arrays.stream(personas).collect(Collectors.toList());

        double mediaCodigo = Arrays.stream(personas).collect(Collectors.averagingInt(p -> p.getCodigo()));
        System.out.println("Media codigo: " + mediaCodigo);

        // codigo mas alto
        int codigoMasAlto = Arrays.stream(personas).map(p -> p.getCodigo()).collect(Collectors.maxBy(Integer::compare)).get();
        System.out.println("Codigo mas alto: " + codigoMasAlto);

        System.out.println();
        Map<Character, List<PersonaTestColecciones>> mPersonas = Arrays.stream(personas).collect(Collectors.groupingBy(per -> per.getNombre().charAt(0)));
        System.out.println(mPersonas);
    }
}

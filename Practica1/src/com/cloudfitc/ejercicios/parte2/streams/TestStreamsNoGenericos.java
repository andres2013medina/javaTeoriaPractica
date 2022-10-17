package com.cloudfitc.ejercicios.parte2.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class TestStreamsNoGenericos {

    public static void main(String[] args) {
        IntStream flujoInt;
        LongStream flujoLong;
        DoubleStream flujoDouble;

        flujoInt = IntStream.of(1, 2, 3, 4, 5);
        flujoInt = IntStream.empty();
        flujoInt = IntStream.range(1, 5);

        Stream<String> stringStream = Stream.of("abc", "bcdasd", "cdeasfdas", "defasdfasgsadg");

//        flujoInt = stringStream.mapToInt(String::length);
//        int cadenaMasLarga = flujoInt.max().getAsInt();
//        System.out.println(cadenaMasLarga);

        double media = stringStream.mapToInt(String::length).average().getAsDouble();
        System.out.println(media);


    }

}

package com.cloudfitc.ejercicios.parte1.random;

import java.util.Random;

public class TestRandom {

    public static void main(String[] args){

        double nrd = Math.random();
        int rd2 = (int)(nrd*10) +1 ; //Numero randomn entre 1 y 10;

        Random rd = new Random();
        rd = new Random(23409824);

        boolean brd = rd.nextBoolean();
        long rl = rd.nextLong();

        // numero entre 1000 y 100 ambos incluidos
        int maximo = 1000;
        int minimo = 100;
        int aleatorio = rd.nextInt(maximo-minimo)+minimo;
    }
}

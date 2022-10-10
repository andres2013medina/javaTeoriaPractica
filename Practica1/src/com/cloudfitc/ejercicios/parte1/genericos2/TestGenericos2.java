package com.cloudfitc.ejercicios.parte1.genericos2;

import java.util.ArrayList;
import java.util.List;

public class TestGenericos2 {
    public static void main(String[] args) {

        Botella<Agua> bot;
        Botella<Agua> botella = new Botella<>();
        ListaLiquidos listaLiquidos = new ListaLiquidos();
        listaLiquidos.add(new Agua());

        boolean esdivisible = TestGenericos2.esDivisiblePor(2.5, 2.5);
        System.out.println(esdivisible);

        ArrayList<Botella<Agua>> lista = new ArrayList<Botella<Agua>>();
        lista.add(new Botella<Agua>());


    }

    public static <N extends Number> boolean esDivisiblePor(N dividendo, N divisor) {
        return dividendo.doubleValue() % divisor.doubleValue() == 0;
    }
}

class ListaLiquidos extends ArrayList<Liquido> {
}

class Botella<T extends Liquido> {
    T liquido;

    public String mostrarContenido() {
        if (liquido == null) {
            return "Vacia";
        } else {
            return liquido.toString();
        }
    }

    public void rellenar(T liquido) {
        this.liquido = liquido;
    }

    public T vaciar() {
        T l = liquido;
        liquido = null;
        return l;
    }
}

interface Liquido {

}

class Agua implements Liquido {
    @Override
    public String toString() {
        return "Agua{}";
    }
}

class Vino {
    @Override
    public String toString() {
        return "Vino{}";
    }
}

class Concatenador<T, S> {
    public String concatenar(T t, S s) {
        return t.toString() + s.toString();
    }
}




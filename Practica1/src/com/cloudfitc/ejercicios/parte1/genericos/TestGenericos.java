package com.cloudfitc.ejercicios.parte1.genericos;

import java.util.ArrayList;
import java.util.List;

public class TestGenericos {

    public static void main(String[] args) {

        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("pepe", "jefe"));
        Botella<Agua> botellaDeAgua = new Botella<>();
        botellaDeAgua.rellenar(new Agua());
        System.out.println(botellaDeAgua.mostrarContenido());
        Agua agua = botellaDeAgua.vaciar();
        System.out.println(botellaDeAgua.mostrarContenido());
        Botella<Vino> botellaDeVino = new Botella<>();
        botellaDeVino.rellenar(new Vino());
        System.out.println(botellaDeVino.mostrarContenido());


        // ejemplo concatenador

        Concatenador<Agua, Vino> conc = new Concatenador<Agua, Vino>();
        System.out.println(conc.concatenar(new Agua(), new Vino()));

        TestGenericos.<Agua, Vino>concatenar(new Agua(), new Vino());
    }

    public static <R, O> String concatenar(R r, O o) {
        return r.toString() + o.toString();
    }
}

// T -> cualquier tipo de clase
// E -> elemento de una collection
// N -> tipos numericos
// K -> Claves
// V -> Valores
class Botella<T> {
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

class Agua {
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
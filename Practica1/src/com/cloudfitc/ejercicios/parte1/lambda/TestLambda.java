package com.cloudfitc.ejercicios.parte1.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class TestLambda {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>(Arrays.asList("juan", "pedro", "Rodrigou", "10101010101010"));
        IFiltroTexto ift = n -> n.length() < 10;

        List<String> nombresFiltrados = Filtrador.filtraNombreLambda(nombres, ift);
        System.out.println(nombresFiltrados);

        IOperador operador = arrayNumeros -> {
            double suma = 0;
            for (double numero : arrayNumeros) {
                suma = suma + numero;
            }
            return suma / arrayNumeros.length;
        };
        double resultado = Operaciones.operarNumerosArray(operador, 5, 3, 2, 1, 4, 5);

        System.out.println(resultado);

        IManipuladorTextos mt = (t1, t2) -> {
            t1 = t1.toUpperCase();
            t2 = t2.toUpperCase();
            return t1.concat(t2);
        };

        System.out.println(Operaciones.transformarTextos(mt,"hola que tal", " como como estas"));
    }

    static class Filtrador {

        public static List<String> filtraNombreLambda(List<String> nombres, IFiltroTexto filtro) {
            List<String> nombresFiltrados = new ArrayList<>();
            for (String nombre : nombres) {
                if (filtro.filtrar(nombre)) {
                    nombresFiltrados.add(nombre);
                }
            }
            return nombresFiltrados;
        }

    }

    interface IFiltroTexto {
        boolean filtrar(String texto);
    }

    static class Operaciones {
        public static double operarNumerosArray(IOperador operador, double... numeros) {
            return operador.operar(numeros);
        }

        public static String transformarTextos(IManipuladorTextos mt, String texto1, String texto2) {
            return mt.manipular(texto1, texto2);
        }
    }

    interface IOperador {
        double operar(double... numeros);
    }

    interface IManipuladorTextos {
        String manipular(String texto, String texto2);
    }
}

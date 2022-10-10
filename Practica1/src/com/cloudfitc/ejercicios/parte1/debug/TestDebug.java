package com.cloudfitc.ejercicios.parte1.debug;

public class TestDebug {
    public static void main(String[] args) {
        System.out.println(operar("/", 10, 2));
    }

    private static int operar(String operacion, int x, int y) {
        int resultado = 0;
        switch (operacion) {
            case "/":
                resultado = Operador.divide(x, y);
        }
        return resultado;
    }

}


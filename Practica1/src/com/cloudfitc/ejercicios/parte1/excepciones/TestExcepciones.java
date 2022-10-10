package com.cloudfitc.ejercicios.parte1.excepciones;

public class TestExcepciones {
    public static void main(String[] args) {

        Exception ex;
        Error error;

//        int s = metodo(null);

        try {
            int x = obtenerNumeroArray(new int[]{1, 2, 3}, 4);
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
//            e.printStackTrace();
        } finally {
            System.out.println("bloque finally");
        }

        RuntimeException re;

        ArithmeticException aex;
        double x = 3.0 / 0;

        System.out.println(x);

        ArrayIndexOutOfBoundsException aie;
        int[] array = {1, 2, 3};
        System.out.println(array[20]);

        ClassCastException ce;
        String text = "text";
        Object o = text;
        Integer i = (Integer) o;


    }

    private static int obtenerNumeroArray(int[] array, int posicion) throws Exception {
        if (posicion < 0 || posicion > array.length) {
            throw new RuntimeException("Posicion solicitada Incorrecta");
        } else {
            return array[posicion];
        }
    }

    public static int metodo(String s) {
        return s.length();
    }
}

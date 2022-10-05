package com.cloudfitc.ejercicios.parte1.tokenizerYbuffer;

import java.nio.CharBuffer;
import java.util.Arrays;

public class TestCharBuffer {

    public static void main(String[] args) {
        //FIFO
        CharBuffer cb = CharBuffer.allocate(12);
        cb.put("a");
        cb.put(2, 'b');
        cb.put("un string", 1, 2);
        cb.append('c');
        cb.position(0);
        System.out.println(cb.toString());

        // se genera un buffer de solo lectura con tamano del String
        String st1 = "cadena1";
        CharBuffer cb2 = CharBuffer.wrap(st1);

        if (!cb2.isReadOnly()) {
            cb2.put('2');
        }

        /// factores a tener en cuenta en un buffer. Capacidad del buffer , posicion del cursor adentro del buffer y limite al
        /// cual se llegara el buffer (se puede establecer)

//        int tamanhoBuffer = cb.length();
//        int posicion = cb.position();
//        int limite = cb.limit();
        // cb.limit(4);
        // cb.position(1);

        // pone el limite en la posicion donde te encuentres adentro del buffer y resetea la posicion al comienzo del buffer
        //cb.flip();

        System.out.println("1 " + cb.get());
        System.out.println("2 " + cb.get());
        System.out.println("3 " + cb.get());

        for (int i = 0; i < cb.limit(); i++) {
            System.out.println(cb.get(i));
        }

        char[] ac = new char[3];
        cb.flip();
        cb.get(ac);
        System.out.println("array de chars: " + Arrays.toString(ac));

    }

}

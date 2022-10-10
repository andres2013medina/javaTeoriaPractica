package com.cloudfitc.ejercicios.parte1.excepciones;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Excepciones2 {
    public static void main(String[] args) {

        try {
            Files.readAllBytes(Paths.get("ruta"));
        } catch (IOException e) {
            e.printStackTrace();

            for (StackTraceElement ste : e.getStackTrace()) {
                System.out.println("modulo: " + ste.getModuleName());
                System.out.println("Fichero: " + ste.getFileName());
                System.out.println("Clase: " + ste.getClassName());
                System.out.println("Metodo: " + ste.getMethodName());
                System.out.println("Linea: " + ste.getLineNumber());
            }
        }
    }
}

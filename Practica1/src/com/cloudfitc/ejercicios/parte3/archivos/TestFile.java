package com.cloudfitc.ejercicios.parte3.archivos;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class TestFile {
    public static void main(String[] args) {

        File file;
        file = new File("C:\\Users\\andre\\OneDrive\\Escritorio\\JavaCloudFormacion\\Unidad 6 Operaciones persistencia\\clase 23\\texto.txt");
        System.out.println(file.exists());

        file = new File("C:\\Users\\andre\\OneDrive\\Escritorio\\JavaCloudFormacion\\Unidad 6 Operaciones persistencia\\clase 23", "texto.txt");
        System.out.println(file.exists());

        System.out.println("Se puede leer? " + file.canRead());
        System.out.println("Se puede escribir? " + file.canWrite());
        System.out.println("Se puede ejecutar? " + file.canRead());

//        mkdir y mkdirs

        file = new File("C:\\Users\\andre\\OneDrive\\Documentos\\CloudFormacionProyectosJava2022\\Practica1\\src\\com\\cloudfitc\\ejercicios\\parte3\\archivos\\carpetaTest");
        System.out.println(file.mkdir());
        // se puede usar mkdirs() para generar varias carpetas carpetaTest/carpeta1


        System.out.println("Mostrar las carpetas de 1 nivel");
//        esto muestra todos los archivos de 1 nivel en la carpeta
        Arrays.stream(file.listFiles()).forEach(System.out::println);

        System.out.println("Es directorio? si es true le pone un / ... sino le pone un _");
        for (File f : file.listFiles()) {
            System.out.println((f.isDirectory() ? "/" : "_") + f.getName());
        }

//        crear un nuevo archivo (file carpeta y luego un archivo.txt)

        File file1 = new File(file, "otra carpeta");
        file1.mkdirs();
        File archivo = new File(file1, "archivo.txt");

        try {
            System.out.println(archivo.createNewFile());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

//        para cambiar el nombre de un archivo (en vdd crea un archivo nuevo igual)
//        archivo.renameTo(new File(\\otra carpeta));
    }
}

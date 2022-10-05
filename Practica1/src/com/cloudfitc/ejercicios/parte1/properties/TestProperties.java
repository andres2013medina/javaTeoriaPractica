package com.cloudfitc.ejercicios.parte1.properties;

import java.io.*;
import java.util.Date;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) throws IOException {
        Properties properties = System.getProperties();
        properties.list(System.out );
        String javaHome = properties.getProperty("java.home");
        System.out.println(javaHome);

        properties.setProperty("idioma","ingles");
        System.out.println(properties.getProperty("idioma"));

        Properties prop = new Properties();
        prop.setProperty("nombre","dani");

        // leer y cargar un archivo Properties
        Reader reader = new FileReader("testProp.properties");
        prop.load(reader);
//        prop.list(System.out);
        prop.setProperty("idioma","castellano");
        System.out.println(prop.getProperty("idioma"));

        // Para guardar el Properties luego de agregar o modificar un elemento.
        Writer writer = new FileWriter("testProp.properties");
        prop.store(writer,"Fecha ultima actualizacion: "+ new Date());
    }
}

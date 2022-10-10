package com.cloudfitc.ejercicios.parte1.logging;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogging {
    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger(TestLogging.class.getName());
        FileHandler manejadorArchivo = new FileHandler("test_logging.log");
        manejadorArchivo.setLevel(Level.ALL);
        log.addHandler(manejadorArchivo);

        FileHandler manejadorArchivos2 = new FileHandler("test_logging_warning.log");
        manejadorArchivos2.setLevel(Level.WARNING);
        log.addHandler(manejadorArchivos2);

        // log de clase superior no escriban en los logs de aca.
        log.setUseParentHandlers(false);

        // para mostrarlo por consola
        ConsoleHandler manejadorConsola = new ConsoleHandler();
        manejadorArchivo.setLevel(Level.OFF);
        log.addHandler(manejadorConsola);

        log.log(Level.INFO, "Inicio de " + TestLogging.class.getName());

        List<String> lista = leerArchivo("asd");
    }

    public static List<String> leerArchivo(String ruta) {
        Logger log = Logger.getLogger(TestLogging.class.getName());

        log.log(Level.INFO, "Intentando accder al archivo" + ruta);

        List<String> lineas;

        try {
            lineas = Files.readAllLines(Paths.get(ruta));
            log.log(Level.INFO, "Archivo leido correctamente " + ruta);
        } catch (IOException e) {
            log.warning(" Error al leer el archivo + " + ruta + " \n \t " + e.getMessage());
            lineas = Arrays.asList(new String[0]);
        }
        return lineas;
    }
}

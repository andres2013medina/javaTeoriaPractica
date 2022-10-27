package com.cloudfitc.ejercicios.parte3.filesPaths;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFilesPaths {
    public static void main(String[] args) {
        Files files;
        Paths paths;

        // ruta para carpetas.
        Path ruta = Path.of("ruta");
        ruta = Paths.get("ruta");
    }
}

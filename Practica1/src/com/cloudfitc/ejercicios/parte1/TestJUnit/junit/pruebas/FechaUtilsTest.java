package com.cloudfitc.ejercicios.parte1.TestJUnit.junit.pruebas;

import com.cloudfitc.ejercicios.parte1.TestJUnit.FechaUtils;
import org.junit.jupiter.api.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class FechaUtilsTest {

    Date fechaHoy;

    @Test
    @DisplayName("Prueba")
    @Disabled
    void test() {
        fail("Not yet implemented");
    }

    @Test
    @DisplayName("Test Fecha Correcta")
    void testFechaCorrecta() {
        /*
         * Datos de Entrada */
        Date date = fechaHoy;

        /*
         * Ejecutamos el metodo
         * */
        String sFecha = FechaUtils.convertirFechaAString(date);

        /*
         * Evaluar resultado */
        boolean esCorrecto = sFecha.equals("10/10/2022");
        assertTrue(esCorrecto);
    }

    @Test
    @DisplayName("Test Validador de fechas con una fecha correcta")
    void testValidarDatosFecha() {
        int anho = 2021;
        int mes = 12;
        int dia = 29;
        boolean fechaCorrecta = FechaUtils.validarDatosFecha(anho, mes, dia);
        assertTrue(fechaCorrecta, "Validacion incorrecta. Fecha Valida");
    }

    @Test
    @DisplayName("Test validador de fechas con una fecha incorrecta")
    void testValidarDatosFechaIncorrecta() {
        int anho = 2020;
        int mes = 12;
        int dia = 33;

        boolean ahoraEsFalso = FechaUtils.validarDatosFecha(anho, mes, dia);
        assertTrue(!ahoraEsFalso, "Validacion incorrecta. Fecha invalida");
    }

    @Test
    @DisplayName("Test Date correcto")
    void testObtenerDateCorrecto() {
        int anho = 2021;
        int mes = 12;
        int dia = 29;
        Date fechaEsperada = null;

        try {
            fechaEsperada = (new SimpleDateFormat("yyyy-MM-dd")).parse(anho + "-" + mes + "-" + dia);
        } catch (ParseException e) {

        }

        Date fechaGenerada = FechaUtils.obtenerDate(anho, mes, dia);

        assertEquals(fechaGenerada, fechaEsperada);

    }

    @Test
    @DisplayName("Test de convertir String a Date formato invalido")
    void testConvertirStringADateParseException() {
        String formato = "dd/MM/YYYY";
        String fechaString = "ad;fglk";

        assertThrows(ParseException.class, () -> FechaUtils.convertirStringADate(fechaString, formato), "Se esperaba una parse Exception");
    }

    // En este metodo se generan las variables y se inicializan, para no tener que repetir codigo por prueba.
    @BeforeEach
    void antesDePrueba() {
        fechaHoy = new Date();

    }

    @AfterEach
    void despuesDePruebar() {
        fechaHoy = null;
    }

    // Solo se ejecuta una unica vez antes de todas las pruebas.
    @BeforeAll
    static void inicializarDatos() {
    }
}

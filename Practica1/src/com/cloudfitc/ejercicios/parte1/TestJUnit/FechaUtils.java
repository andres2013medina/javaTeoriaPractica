package com.cloudfitc.ejercicios.parte1.TestJUnit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FechaUtils {

    public static String convertirFechaAString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }

    public static Date obtenerDate(int anho, int mes, int dia) {
        Calendar cal = new GregorianCalendar(anho, mes - 1, dia);
        return cal.getTime();
    }

    public static boolean validarDatosFecha(int anho, int mes, int dia) {
        try {
            LocalDate.of(anho, mes, dia);
            return true;
        } catch (DateTimeException ex) {
            return false;
        }
    }

    public static Date convertirStringADate(String fecha, String formato) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        Date f = sdf.parse(fecha);
        return f;
    }
}

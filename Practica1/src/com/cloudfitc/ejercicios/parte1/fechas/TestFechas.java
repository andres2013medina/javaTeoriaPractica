package com.cloudfitc.ejercicios.parte1.fechas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class TestFechas {
    public static void main(String[] args) throws ParseException {
        // DATE --- aunque se recomienda usar Calendar
        Date fecha = new Date(0);
        Date fechaActual = new Date();
        System.out.println(fecha);
        System.out.println(fechaActual.before(fecha));
        System.out.println(fechaActual.getTime());
        fecha.setTime(3000);
        System.out.println(fecha);

        System.out.println("CALENDAR");

        //Calendar
        Calendar cal = Calendar.getInstance(new Locale("en", "UK"));
        cal.add(Calendar.HOUR_OF_DAY, 3);
        System.out.println(cal.getTime());
        cal.set(Calendar.MONTH, 1);
        System.out.println(cal.getTime());
        cal.setTime(new Date());
        cal.setTimeInMillis(System.currentTimeMillis());

        GregorianCalendar gregorianCalendar = new GregorianCalendar(2020, 12, 11);

        // FULL/LONG/ MEDIUM/ SHORT
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, new Locale("en", "UK"));

        // formato fecha
        String fechaFormateada = df.format(new Date());
        System.out.println(fechaFormateada);

        //formato fecha formato hora

        df = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.MEDIUM, new Locale("en", "UK"));
        System.out.println(df.format(new Date()));

        // String to Date
        Date fechaPars = df.parse("12/11/20, 9:50:29 PM");
        System.out.println(fechaPars);

        // Formato de fecha
        SimpleDateFormat sdf = new SimpleDateFormat("E d-M-Y HH:mm:ss");
        System.out.println(sdf.format(new Date()));

        sdf = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy 'a las' HH:mm:ss", new Locale("en", "UK"));
        System.out.println(sdf.format(new Date()));

        Date d = sdf.parse("Friday, 11 de December de 2020 a las 21:59:36");
        System.out.println(d);
    }
}

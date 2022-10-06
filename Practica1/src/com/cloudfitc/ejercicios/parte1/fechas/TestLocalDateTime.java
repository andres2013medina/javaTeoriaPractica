package com.cloudfitc.ejercicios.parte1.fechas;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class TestLocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt;
        LocalDate ld;
        LocalTime lt;

        ldt = LocalDateTime.now();
        ldt = LocalDateTime.of(2010, 2, 5, 5, 6, 7);
        System.out.println(ldt);

        ld = LocalDate.now();
        ld = LocalDate.of(22, 9, 11);

        System.out.println(" Imprimir fecha String con formato : 2015-11-05T07:06:07");
        ldt = LocalDateTime.parse("2015-11-05T07:06:07");
        System.out.println(ldt);
        System.out.println("Se le suma 5 dias y luego se le restan 3 dias");
        ldt = ldt.plusDays(5);
        ldt = ldt.minusDays(3);
        System.out.println(ldt);

        int minutos = ldt.getMinute();
        Month mes = ldt.getMonth();
        System.out.println("Se extrae el mes de la variable de arriba y se imprime Textstyle.full y Locale ES");
        String smes = mes.getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        System.out.println(smes);

        System.out.println("Se extrae el dia de la variable de arriba y se imprime en TextStyle.full y Locale DE");
        DayOfWeek dia = ldt.getDayOfWeek();
        String sDia = dia.getDisplayName(TextStyle.FULL, new Locale("de", "DE"));
        System.out.println(dia);

        // Formatear Dia

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
        ld = LocalDate.parse("2015-11-05");
        System.out.println("Imprimir mes con TextStyle.FULL y Locale EN");
        System.out.println(ld.getMonth().getDisplayName(TextStyle.FULL, new Locale("EN")));

        System.out.println("String fecha 1/2/2003 a LocalDate");
        String cadenaFecha = "1/2/2003";
        LocalDate localDate = LocalDate.parse(cadenaFecha, dtf);
        System.out.println(localDate);


        System.out.println("De String a formatear y luego LocalTime");
        dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        String cadenaHora = "23:35:22";
        LocalTime localTime = LocalTime.parse(cadenaHora, dtf);
        System.out.println(localTime);


        Date date = new Date();
        // DATE a LocalDATETIME
        LocalDateTime localDateTime = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        //Date a LocalDATE
        LocalDate localDate2 = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        // LocalDateTime a date
        Date date1 = Date.from(ldt.atZone(ZoneId.systemDefault()).toInstant());
        //LocalDate a date
        Date date2 = Date.from(localDate2.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());


        //Duration
        System.out.println("Clase DURANTION");
        Duration duration; // dias, horas , minutos

        // intervalo entre HORAS
        System.out.println("Intervalo entre 2 horas");
        Duration intervaloEntreHoras = Duration.between(LocalTime.now().minusHours(2).minusMinutes(5), LocalTime.now());
        System.out.println(intervaloEntreHoras);

        System.out.println("Se le suma 2 horas y se le resta 5 min, tener en consideracion que puede ser" +
                " negativo y colocaria un - antes del numero");
        intervaloEntreHoras = intervaloEntreHoras.plusHours(2);
        intervaloEntreHoras = intervaloEntreHoras.minusMinutes(5);
        System.out.println(intervaloEntreHoras);

        System.out.println("Se suma el intervalo a la variable localDATETIME");
        localDateTime = localDateTime.plus(intervaloEntreHoras);
        System.out.println(localDateTime);


        System.out.println("clase Period");
        Period period; // dias, semanas , meses , anhos

        period = Period.between(LocalDate.now(), LocalDate.of(2000, 3, 6));
        System.out.println(period);

        System.out.println("Duration de 5 dias en horas");
        duration = Duration.of(5, ChronoUnit.DAYS);
        System.out.println(duration);

        System.out.println("Period de 5 dias en dias");
        period = Period.ofDays(5);
        System.out.println(period);

    }

    public static boolean validarFecha(int anio, int mes, int dia) {
        try {
            LocalDate.of(anio, mes, dia);
            return true;
        } catch (DateTimeException ex) {
            return false;
        }
    }
}

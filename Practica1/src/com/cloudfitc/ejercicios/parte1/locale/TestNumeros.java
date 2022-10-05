package com.cloudfitc.ejercicios.parte1.locale;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class TestNumeros {
    public static void main(String[] args) throws ParseException {

        double n = 123123.4567;
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("es", "ES"));
        System.out.println(nf.format(n));

        nf = NumberFormat.getNumberInstance(new Locale("es","ES"));
        System.out.println(nf.format(n));

        double d = nf.parse("123.456,098").doubleValue();
        System.out.println(d);
    }
}

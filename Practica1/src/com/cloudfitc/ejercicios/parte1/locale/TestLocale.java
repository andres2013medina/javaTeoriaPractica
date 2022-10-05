package com.cloudfitc.ejercicios.parte1.locale;

import java.util.Arrays;
import java.util.Locale;

public class TestLocale {
    public static void main(String[] args){
        Locale loc = new Locale("es","ES");
        System.out.println(loc.getCountry());
        System.out.println(loc.getLanguage());
        System.out.println(loc.getDisplayCountry());
        System.out.println(loc.getDisplayLanguage());

        Locale locGer = Locale.GERMAN;
        Locale locDef = Locale.getDefault();
        locDef.setDefault(new Locale("en"));
        System.out.println(Arrays.toString(Locale.getISOLanguages()));

        System.out.printf(new Locale("es","ES"), "%.2f\n", 25.5); // Imprimir en el formato de otro pais
        String.format(new Locale("es","ES"),"%.2f\n",25.5);

    }
}

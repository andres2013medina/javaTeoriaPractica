package com.cloudfitc.ejercicios.parte1.resourceBundle;

import java.util.Locale;

public class TestResourceBundle {
    public static void main(String[] args){
        System.out.println("mejor utilizar literales");

        Literales litEs = new Literales(new Locale("en","US"));
        System.out.println(litEs.lNombre);
    }
}

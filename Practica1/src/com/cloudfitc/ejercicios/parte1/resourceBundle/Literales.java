package com.cloudfitc.ejercicios.parte1.resourceBundle;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Literales {

    private ResourceBundle recursos;
    public final String lNombre,lApellido,lEdad;

    public Literales(Locale locale){
        recursos = PropertyResourceBundle.getBundle("com/cloudfitc/ejercicios/parte1/proplang/textos",locale);
        lNombre=recursos.getString("nombre");
        lApellido= recursos.getString("apellido");
        lEdad = recursos.getString("edad");
    }

    public Literales(){
        this(Locale.getDefault());
    }
}

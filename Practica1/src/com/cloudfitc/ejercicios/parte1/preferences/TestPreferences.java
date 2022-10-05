package com.cloudfitc.ejercicios.parte1.preferences;

import java.util.prefs.Preferences;

public class TestPreferences {
    public static void main(String[] args){
        //Preferences

        Preferences prefUsuario = Preferences.userRoot();

        prefUsuario.node("test/preferences/nodoprueba2");
    }
}

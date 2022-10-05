package com.cloudfitc.ejercicios.parte1.claseAbstracta;

public class Main {

    public static void main(String[] args){

        Audifonos audifono = new Audifonos("audif", Periferico.tipoConexion.HDMI);
        Casco casco = new Casco("casc", Periferico.tipoConexion.USB);
        Microfono microfono = new Microfono("micro", Periferico.tipoConexion.JACK);

        System.out.println(audifono.enviarInformacion());
        System.out.println(casco.enviarInformacion());
        System.out.println(microfono.enviarInformacion());

        System.out.println(audifono);
        System.out.println(casco);
        System.out.println(microfono);
    }
}

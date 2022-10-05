package com.cloudfitc.ejercicios.parte1.Herencias;

import java.util.ArrayList;
import java.util.Arrays;

public class GestorConsumibles {

    private static ArrayList<Consumible> listaConsumible = new ArrayList<Consumible>();

    public static void addConsumibles(Consumible... consumibles) {

        listaConsumible.addAll(Arrays.asList(consumibles));
    }

    public static void removeConsumible(Consumible... consumibles) {
        listaConsumible.removeAll(Arrays.asList(consumibles));
    }

    public static void editConsumible(int posicion, Consumible consumible) {
        listaConsumible.set(posicion, consumible);
    }

    public static Consumible[] findAllConsumibles() {
        Consumible[] arrConsumible = new Consumible[listaConsumible.size()];
        return listaConsumible.toArray(arrConsumible);
    }

    public static Consumible[] consumiblesCaducados() {
        ArrayList<Consumible> consumiblesCaducados = new ArrayList<>();
        for (Consumible consumible : listaConsumible) {
            if (consumible.EstaCaducado()==true) {
                consumiblesCaducados.add(consumible);
            }
        }
        Consumible[] arrConsumibleCad = new Consumible[consumiblesCaducados.size()];
        return consumiblesCaducados.toArray(arrConsumibleCad);
    }

    public static Consumible[] refrescosNevera() {
        ArrayList<Consumible> esRefrescoNevera = new ArrayList<>();
        for (Consumible consumible : listaConsumible) {
            if (consumible instanceof Refresco && ((Refresco) consumible).isNevera()) {
                esRefrescoNevera.add(consumible);
            }
        }
        Refresco[] arrRefrescoNevera = new Refresco[esRefrescoNevera.size()];
        return esRefrescoNevera.toArray(arrRefrescoNevera);
    }

}

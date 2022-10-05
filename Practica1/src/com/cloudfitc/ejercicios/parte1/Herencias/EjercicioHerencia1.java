package com.cloudfitc.ejercicios.parte1.Herencias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class EjercicioHerencia1 {

    public static void main(String[] args){
        Calendar fecha = new GregorianCalendar(2019, 1, 7);
        Calendar fecha2 = new GregorianCalendar(2021, 5, 8);
        Calendar fecha3 = new GregorianCalendar(2020, 7, 3);
        Calendar fecha4 = new GregorianCalendar(2005, 9, 1);

        Bolleria aux = new Bolleria("bollito", "rico", "mercadona", true);
        Bolleria aux2= new Bolleria("pan", "delicioso", "carrefour", false);
        Refresco aux3= new Refresco("coca", "negra", "coke", fecha, Envase.BOTELLA, 1,true);
        Refresco aux4= new Refresco("pepsi", "negra", "fria",fecha2, Envase.BRICK, 1,false);
        Consumible aux5 = new Consumible("Consumible", "esplendido", "mercadona", fecha3);
        Consumible aux6 = new Consumible("Desconsumible", "esplendido", "mercadona", fecha4);

        GestorConsumibles.addConsumibles(aux);
        GestorConsumibles.addConsumibles(aux2);
        GestorConsumibles.addConsumibles(aux3);
        GestorConsumibles.addConsumibles(aux4);
        GestorConsumibles.addConsumibles(aux5);
        GestorConsumibles.addConsumibles(aux6);


        System.out.println("Todos los Consumibles:::");
        for(Consumible consumible : GestorConsumibles.findAllConsumibles()) {
            System.out.println(consumible.toString());
        }
        System.out.println("*******1*********");
        System.out.println("");
        System.out.println("Eliminar el primer consumible");
        GestorConsumibles.removeConsumible(aux);
        for(Consumible consumible : GestorConsumibles.findAllConsumibles()) {
            System.out.println(consumible.toString());
        }

        System.out.println();
        System.out.println("*******2*********");
        System.out.println("Se edita el primer consumbile (aux2) y se coloca el dato del aux eliminado previamente");
        System.out.println();
        GestorConsumibles.editConsumible(0, aux);
        for(Consumible consumible : GestorConsumibles.findAllConsumibles()) {
            System.out.println(consumible.toString());
        }

        System.out.println();
        System.out.println("*******3*********");
        System.out.println("Todos los Consumibles Caducados");
        for(Consumible consumible : GestorConsumibles.consumiblesCaducados()) {
            System.out.println(consumible.toString());
        }

        System.out.println();
        System.out.println("Todos los refrescos que deben guardarse en nevera");
        for(Consumible consumible : GestorConsumibles.refrescosNevera()) {
            System.out.println(consumible.toString());
        }
    }

}

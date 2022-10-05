package com.cloudfitc.ejercicios.parte1.Herencias;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Bolleria extends Consumible {
    private boolean fresco;

    public Bolleria(String nombre, String descripcion, String proveedor, boolean fresco) {
        super(nombre, descripcion, proveedor);
        this.fresco = fresco;
        fechaBolleria();
    }

    public void fechaBolleria(){
        Calendar hoy = new GregorianCalendar();
        hoy.add(Calendar.DAY_OF_MONTH, +1);
        setFechaCaducidad(hoy);
    }

    public boolean isFresco() {
        return fresco;
    }

    public void setFresco(boolean fresco) {
        this.fresco = fresco;
    }

    @Override
    public String toString() {
        return "Bolleria{" + "fecha de caducidad "+ getFechaCaducidad().getTime() +
                (isFresco()?"Esta Fresco":"")+
                '}';
    }
}

package com.cloudfitc.ejercicios.parte1.listas;

import java.util.ArrayList;
import java.util.Arrays;

public class TestListas {

    private static ArrayList<Empleado> empleados = new ArrayList<>();
    static int MAX = 10;

    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1, "juan", "rrhh", 1200));
        empleados.add(new Empleado(2, "pedro", "rrhh", 1400));

        System.out.println(empleados);

        Empleado empleadoBorrado = new Empleado(4, "domingo", "ventas", 1600);
        empleados.add(empleadoBorrado);

        for (Empleado emp : empleados) {
            System.out.println(emp);
        }

        Empleado empGet = empleados.get(1);
        System.out.println("el empleado " + empGet.getNombre() + " esta en la posicion " + empleados.indexOf(empGet));

        empleados.set(1, new Empleado(5, "reemplazo", "rrPP", 1900));

        for (Empleado emp : empleados) {
            System.out.println(emp);
        }

       //Array de los objetos que estan en la lista
        System.out.println("Lista a array");
       Empleado[] arrEmpleados = empleados.toArray(new Empleado[empleados.size()]);

        for (Empleado empleado:arrEmpleados){
            System.out.println(empleado);
        }

        //Array a Lista
        ArrayList<Empleado> empleadosDesdeArray = new ArrayList<>(Arrays.asList(arrEmpleados));

    }

    public boolean addEmpleado(Empleado empleado) {
        if (empleados.size() <= MAX) {
            empleados.add(empleado);
            return true;
        } else {
            return false;
        }
    }
}

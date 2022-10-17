package com.cloudfitc.ejercicios.parte2.colecciones;

import java.util.TreeMap;

public class TestAlmacenProductos {
    public static void main(String[] args) {
        TreeMap<IDPosicionAlmacen, Producto> almacenProductoTreeMap = new TreeMap<>();

        almacenProductoTreeMap.put(new IDPosicionAlmacen(1, 'a'), new Producto(5, "silla"));
        almacenProductoTreeMap.put(new IDPosicionAlmacen(2, 'a'), new Producto(35, "mesa"));
        almacenProductoTreeMap.put(new IDPosicionAlmacen(1, 'b'), new Producto(45, "espejo"));
        almacenProductoTreeMap.put(new IDPosicionAlmacen(2, 'b'), null);
        almacenProductoTreeMap.put(new IDPosicionAlmacen(1, 'c'), new Producto(25, "sabana"));
        almacenProductoTreeMap.put(new IDPosicionAlmacen(2, 'c'), new Producto(55, "manta"));

        for (IDPosicionAlmacen clave : almacenProductoTreeMap.keySet()) {
            System.out.println(clave + " - >" + almacenProductoTreeMap.get(clave));
        }

        IDPosicionAlmacen posicionAlmacen = new IDPosicionAlmacen(2, 'c');
        Producto p = almacenProductoTreeMap.get(posicionAlmacen);
        System.out.println("Producto posicion " + posicionAlmacen + " *** " + posicionAlmacen);

        boolean existeKey = almacenProductoTreeMap.containsKey(new IDPosicionAlmacen(2, 'c'));
        System.out.println("existe key? " + existeKey);
        boolean existeValue = almacenProductoTreeMap.containsValue(new Producto(20, "sabana"));
        System.out.println("existe value?" + existeValue);
        existeValue = almacenProductoTreeMap.containsValue(new Producto(25, "sabana"));
        System.out.println(existeValue);
    }
}

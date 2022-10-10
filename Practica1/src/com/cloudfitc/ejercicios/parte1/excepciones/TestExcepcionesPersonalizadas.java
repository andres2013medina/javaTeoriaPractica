package com.cloudfitc.ejercicios.parte1.excepciones;

public class TestExcepcionesPersonalizadas {

    public static void main(String[] args) {
        try {
            Producto p = new Producto("p", 100, -100);
        } catch (PrecioNegativoException e) {
            System.out.println(e.getMessage());
            double precioInvalido = e.getPrecioInvalido();
        }
    }
}

class Producto {
    String nombre;
    double precioVenta;
    double precioCompra;

    public Producto() {
    }

    public Producto(String nombre, double precioVenta, double precioCompra) throws PrecioNegativoException {
        this.nombre = nombre;
        setNombre(nombre);
        setPrecioCompra(precioCompra);
        setPrecioVenta(precioVenta);
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(double precioVenta) throws PrecioNegativoException {
        if (validarPrecio(precioVenta)) {
            this.precioVenta = precioVenta;
        }
    }

    private boolean validarPrecio(double precio) throws PrecioNegativoException {
        if (precio < 0) {
            throw new PrecioNegativoException(precio);
        } else {
            return true;
        }
    }
}

class ProductoLiquidacion extends Producto {
    public void setPrecioVenta(double precioVenta) {
        super.precioVenta = precioVenta;
    }
}

class PrecioNegativoException extends Exception {
    private double precioInvalido;

    public PrecioNegativoException(double precio) {
        super("Precio " + precio + " no valido. debe ser positivo");
        this.precioInvalido = precio;
    }

    public double getPrecioInvalido() {
        return precioInvalido;
    }
}

package com.cloudfitc.ejercicios.parte2.colecciones;

public class IDPosicionAlmacen implements Comparable<IDPosicionAlmacen> {
    private int numero;
    private char letra;

    public IDPosicionAlmacen(int numero, char letra) {
        this.numero = numero;
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }


    @Override
    public int compareTo(IDPosicionAlmacen o) {

        int resultado = this.getNumero() - o.getNumero();
        resultado = resultado != 0 ? resultado : Character.compare(this.getLetra(), o.getLetra());

        return resultado;
    }

    @Override
    public String toString() {
        return "IDPosicionAlmacen{" +
                "numero=" + numero +
                ", letra=" + letra +
                '}';
    }
}

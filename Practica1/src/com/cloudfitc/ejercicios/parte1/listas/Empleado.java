package com.cloudfitc.ejercicios.parte1.listas;

public class Empleado {

    private int codigo;
    private String nombre;
    private String departamento;
    private double salario;

    public Empleado() {
    }

    public Empleado(int codigo, String nombre, String departamento, double salario) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                '}';
    }
}

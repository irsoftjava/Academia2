package com.cga.pro.investigacion.salario_interface;

public class EmpleadoPorHora implements Empleado {

    private double horasTrabajadas;

    private double salarioPorHora;

    public EmpleadoPorHora(double horasTrabajadas, double salarioPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.salarioPorHora = salarioPorHora;
    }

    @Override
    public double getSalario() {
        return horasTrabajadas * salarioPorHora;
    }

    @Override
    public void ajustarSalario(double porcentaje) {
        salarioPorHora = salarioPorHora * (1 + porcentaje / 100);
    }
}

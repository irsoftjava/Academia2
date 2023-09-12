package com.cga.pro.investigacion.salario_interface;

public class EmpleadoSueldoFijo implements Empleado {

    private double sueldoFijo;

    public EmpleadoSueldoFijo(double sueldoFijo) {
        this.sueldoFijo = sueldoFijo;
    }

    @Override
    public double getSalario() {
        return this.sueldoFijo;
    }

    @Override
    public void ajustarSalario(double porcentaje) {
        sueldoFijo = sueldoFijo * (1 + porcentaje / 100);
    }
}

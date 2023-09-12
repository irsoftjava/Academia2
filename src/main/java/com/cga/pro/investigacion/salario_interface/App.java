package com.cga.pro.investigacion.salario_interface;

public class App {

    public static void main(String[] args) {

        EmpleadoSueldoFijo empleadoSueldoFijo = new EmpleadoSueldoFijo(1000);
        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora(40, 10);

        System.out.println("Salario Empleado sueldo fijo: " + empleadoSueldoFijo.getSalario());
        System.out.println("Salario Empleado sueldo por hora: " + empleadoPorHora.getSalario());

        empleadoSueldoFijo.ajustarSalario(10);
        empleadoPorHora.ajustarSalario(10);

        System.out.println("Salario Empleado sueldo fijo: " + empleadoSueldoFijo.getSalario());
        System.out.println("Salario Empleado sueldo por hora: " + empleadoPorHora.getSalario());
    }
}

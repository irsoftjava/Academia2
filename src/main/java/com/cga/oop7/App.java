package com.cga.oop7;

public class App {

    public static void main(String[] args) {

        Supervisor su = new Supervisor("Candelaria", 2500);
        Empleado em = new Empleado("Juan", 1200);

        System.out.println("El incremento de sueldo del Supervisor es: " + su.incrementoDeSueldo());
        System.out.println("El incremento de sueldo de un Empleado es: " + em.incrementoDeSueldo());
    }
}

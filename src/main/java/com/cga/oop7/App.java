package com.cga.oop7;

public class App {

    public static void main(String[] args) {

        Supervisor su = new Supervisor("Candelaria", 2500);
        Empleado em = new Empleado("Juan", 1200);

        System.out.println();
        System.out.printf("Sueldo del Supervisor %.2f€, después del incremento: %.2f€\n", su.getSueldo(), su.incrementoDeSueldo(20));
        System.out.printf("Sueldo del Empleado %.2f€, después del incremento: %.2f€\n", em.getSueldo(), em.incrementoDeSueldo(10));
    }
}

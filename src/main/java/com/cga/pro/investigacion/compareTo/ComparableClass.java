package com.cga.pro.investigacion.compareTo;

public class ComparableClass {

    public static void main(String[] args) {

        Alumno a1 = new Alumno("Eduardo", 8.5f, 23);
        Alumno a2 = new Alumno("Jesus", 5.5f, 23);

        //  < 0 Menor
        //  = 0 Iguales
        //  > 0 Mayor

        if (a1.compareTo(a2) > 0) {
            System.out.println("El mayor es " + a1);
        } else if (a1.compareTo(a2) < 0) {
            System.out.println("El mayor es " + a2);
        } else {
            System.out.println("Son iguales...");
        }

    }
}
